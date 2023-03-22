package MyBankApp;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.Scanner;

public class ATMachine {
    private static Scanner keyboardInputCollector = new Scanner(System.in);
    private static Bank wemaBank = new Bank();
    public static void main(String[] args) {
        gotoMainMenu();
    }

    private static void gotoMainMenu() {
        String mainMenu = """
                ===================================
                Welcome to Wema Bank
                1 -> Create Account
                2 -> Deposit
                3 -> Withdraw
                4 -> Transfer
                5 -> Check Balance
                6 -> Close Account
                7 -> Check Account Info
                8 -> Exit
                """;
        display(mainMenu);
        String userInput = input(mainMenu);
        switch (userInput.charAt(0)){
            case '1' -> createAccount();
            case '2' -> deposit();
            case '3' -> withdraw();
            case '4' -> transfer();
            case '5' -> checkBalance();
            case '6' -> closeAccount();
            case  '7' -> checkAccountInfo();
            case '8' -> exitApplication();

            default -> gotoMainMenu();

        }
    }

    private static void checkAccountInfo() {
        String firstName = input("Enter your first name");
        String lastName = input("Enter your last name");
        int accountNumber = Integer.parseInt(input("Enter Your Account Number"));
        display("Hello dear customer, below is your account details");
       display(wemaBank.checkAccountInfo(accountNumber));
        gotoMainMenu();
    }

    private static void closeAccount() {
        String firstName = input("Enter your first name");
        String lastName = input("Enter your last name");
        int accountNumber = Integer.parseInt(input("Enter Your Account Number"));
        String pin = input("Enter your pin");
        wemaBank.deleteAccountFor(firstName, lastName, accountNumber);
        display("Account closed successfully");
        gotoMainMenu();
    }

    private static void exitApplication() {
        display("Thank you for using our application ");
        System.exit(1);
    }

    private static void checkBalance() {
        int accountNumber = Integer.parseInt(input("Enter Your Account Number"));
        String pin = input("Enter Your Pin");
        String accountBalance =String.format( """
				Your account balance is %s
				""", wemaBank.checkBalanceFor(accountNumber, pin).toPlainString());
        display(accountBalance);
        gotoMainMenu();
    }

    private static void transfer() {
        int senderAccountNumber = Integer.parseInt(input("Enter Your Account Number"));
        int receiverAccountNumber = Integer.parseInt(input("Enter Your Receiver Account Number"));
        BigDecimal amount = BigDecimal.valueOf(Long.parseLong(input("Enter Your Amount")));
        String senderPin = input("Enter your Pin");
        try {
            wemaBank.transfer(amount, senderAccountNumber, receiverAccountNumber, senderPin);
        }
        catch (IllegalArgumentException error){
            display(error.getMessage());
            transfer();
            display("Transfer successful");
        }

        gotoMainMenu();
    }

    private static void withdraw() {
        int accountNumber = Integer.parseInt(input("Enter your account number"));
        BigDecimal amount = BigDecimal.valueOf(Long.parseLong(input("Enter your amount")));
        String pin = input("Enter your Pin");
        try {
            wemaBank.withdrawFrom(accountNumber, amount, pin);
        }
        catch (IllegalArgumentException ex){
            display(ex.getMessage());
            withdraw();
        }
        display("Withdrawal successful");

        gotoMainMenu();

    }

    private static void deposit() {
        int accountNumber = Integer.parseInt(input("Enter your account number"));
        BigDecimal amount = BigDecimal.valueOf(Long.parseLong(input("Enter your amount")));
        wemaBank.depositInto(amount, accountNumber);
        display("Deposited successfully");
        gotoMainMenu();
    }

    private static void createAccount() {
        String firstName = input("Enter your first name");
        String lastName = input("Enter your last name");
        String pin = input("Enter your pin");
        display(wemaBank.createAccountFor(firstName, lastName, pin));
        display("Account created successfully");

        gotoMainMenu(); }

    private static String input(String Prompt){
        return JOptionPane.showInputDialog(Prompt);
       // display(Prompt);
      //  return keyboardInputCollector.nextLine();
    }
    private static void display(String prompt){
        //System.out.println(prompt);
        JOptionPane.showMessageDialog(null, prompt);
    }

}
