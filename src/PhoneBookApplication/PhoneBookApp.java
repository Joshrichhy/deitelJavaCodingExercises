package PhoneBookApplication;

import javax.swing.*;
import java.util.Scanner;

public class PhoneBookApp {
    private static Scanner keyboardInputCollector = new Scanner(System.in);
    private static PhoneBook phoneBook = new PhoneBook();
    public static void main(String... args) {
        


            try{gotoMainMenu();}
            catch(StringIndexOutOfBoundsException | NullPointerException ex){display("Invalid Information");
            main();}
            }

    private static void gotoMainMenu() {
        String mainMenu = """
                ===================================
                YOUR PHONEBOOK IS SAYING HI
                1 -> Create Contact
                2 -> View Contact
                3 -> Edit Contact
                4 -> Count Contacts
                5 -> Delete Contact
                6 -> View All Contacts
                7 -> Exit
                """;
        String userInput = input(mainMenu);
        switch (userInput.charAt(0)){
            case '1' -> createContact();
            case '2' -> viewContactIn();
            case '3' -> editContactIn();
            case '4' -> countContact();
            case '5' -> deleteContactIn();
            case '6' -> viewAllContactsIn();
            case '7' -> exitApplication();
            default -> gotoMainMenu();

        }
    }

    private static void viewAllContactsIn() {
        display(phoneBook.viewAllContact());
        gotoMainMenu();
    }

    private static void createContact() {
        String firstName = input("Enter First Name");
        String lastName = input("Enter Last Name");
        String phoneNumber = input("Enter Phone Number");
        String emailAddress = input("Enter Email Address");
        phoneBook.createContact(firstName, lastName, phoneNumber, emailAddress);
        display("Contact created successfully");
        gotoMainMenu();

    }
    private static void viewContactIn() {
        String firstName= input("Enter First Name");
try{
        display(phoneBook.viewContact(firstName).toString());
        display("Hi, here is your Contact Information");
       }
catch (IllegalArgumentException |IndexOutOfBoundsException | NullPointerException  ex){
    display("No Contact Found");
}
        gotoMainMenu();
    }

    private static void editContactIn() {
        String firstName = input("Enter First Name");
        String newFirstName = input("Enter New First Name");
        String newLastName= input("Enter New Last Name");
        String newPhoneNumber = input("Enter Phone Number");

        try{
        phoneBook.editContact(firstName, newFirstName, newLastName, newPhoneNumber );
        display("Contact updated successfully");}
        catch (IllegalArgumentException |IndexOutOfBoundsException | NullPointerException  ex){
            display("No Contact information Found");
        }
        gotoMainMenu();

    }
        private static void countContact() {
        String numberOfContacts =String.format( """
				You have %s numbers of entries in your diary
				""", phoneBook.countContacts());
        display(numberOfContacts);
        gotoMainMenu();
    }


    private static void exitApplication() {
        display("Thank you for using our application ");
        System.exit(1);
    }
    private static void deleteContactIn() {
        String name = input("Enter Your First Name");
        try{
        phoneBook.deleteContact(name);
       display("Contact deleted successful");}
        catch (IllegalArgumentException |IndexOutOfBoundsException | NullPointerException  ex){
                display("No Contact Found");
            }

        gotoMainMenu();}

    private static String input(String Prompt){
        return JOptionPane.showInputDialog(Prompt);
    }
    private static void display(String prompt){
        JOptionPane.showMessageDialog(null, prompt);
    }
}

