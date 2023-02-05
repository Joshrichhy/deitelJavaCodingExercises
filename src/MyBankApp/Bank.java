package MyBankApp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Objects;

public class Bank {

    ArrayList <Account> accounts = new ArrayList<>();
    public String createAccountFor(String firstName, String lastName, String pin) {
        int accountNumber = accounts.size() + 1;
        Account newAccount = new Account(accountNumber, lastName +" "+firstName, pin);
        accounts.add(newAccount);

        return "Your Account Number is " + accountNumber;
    }

    public int getNumberOfCustomers() {
        return accounts.size();
    }

    public Account findAccount(int accountNumber) {
        return accounts.get(accountNumber -1);
    }

    public BigDecimal checkBalanceFor(int accountNumber, String pin) {
        Account account = findAccount(accountNumber);
        return account.getBalance(pin);
        //or return findAccount(accountNumber).getBalance(pin);
    }


    public void depositInto(BigDecimal amount, int accountNumber) {
        Account account = findAccount(accountNumber);
        account.deposit(amount);
    }

    public void withdrawFrom(int accounNumber, BigDecimal amount, String pin) {
        findAccount(accounNumber).withdraw(amount, pin);
    }

    public void transfer(BigDecimal amount, int senderAccountNumber, int receiverAccountNumber, String senderPin) {
        withdrawFrom(senderAccountNumber, amount, senderPin);
        depositInto(amount, receiverAccountNumber);

//        Account senderAccount = findAccount(senderAccountNumber);
//        Account receiverAccount = findAccount(receiverAccountNumber);
//        senderAccount.withdraw(amount, senderPin);
//        receiverAccount.deposit(amount);
    }

    public void deleteAccountFor(String firstName, String lastName, int accountNumber) {
        Account account = findAccount(accountNumber);
        accounts.add(accountNumber, null);
        accounts.remove(account);
           }


    public String checkAccountInfo(int accountNumber) {
        Account checkAccount = findAccount(accountNumber);
        if(checkAccount == null ) return "Account does not exist";
        else
            return findAccount(accountNumber).toString();
    }
}
