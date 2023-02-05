package MyDiaryApp;

import javax.swing.*;
import java.util.Objects;
import java.util.Scanner;

public class DiaryApp {
    private static Scanner keyboardInputCollector = new Scanner(System.in);
    static final String password = "1234";
    private static Diary diary = new Diary();
    public static void main(String... args) {
        String passwordEntered = input("Enter Password");

        if (!Objects.equals(passwordEntered, password)){
            display("Invalid Password");
            main();
        }else if (passwordEntered.equals(password)) {
            gotoMainMenu();
        }
    }

    private static void gotoMainMenu() {
        String mainMenu = """
                ===================================
                THIS IS MY DIARY
                1 -> Create Entry
                2 -> View Entry
                3 -> Edit Entry
                4 -> Count Entry
                5 -> Delete Entry
                6 -> View All Entries
                7 -> overWrite Entry 
                8 -> Exit
                """;
        String userInput = input(mainMenu);
        switch (userInput.charAt(0)){
            case '1' -> createEntryIn();
            case '2' -> viewEntryIn();
            case '3' -> editEntry();
            case '4' -> countEntry();
            case '5' -> deleteEntryIn();
            case '6' -> viewAllEntryInDiary();
            case '7' -> overWriteEntryIn();
            case '8' -> exitApplication();
            default -> gotoMainMenu();

        }
    }

    private static void viewAllEntryInDiary() {
        display(diary.viewAllEntry());
        gotoMainMenu();
    }

    private static void createEntryIn() {
        String title = input("Enter your Entry title");
        String body = input("What are you writing today?");

        diary.createEntry(title, body);
        display("Entry created successfully");

        gotoMainMenu();

    }
    private static void viewEntryIn() {
        int idNumber = Integer.parseInt(input("Enter your id Number"));
        idNumberValidation(idNumber);

        display("Hi, here is your entry");
        display(diary.viewEntry(idNumber));
        gotoMainMenu();
    }

    private static void editEntry() {
        int idNumber = 0;
        try{
        idNumber  = Integer.parseInt(input("Enter your id Number to edit"));}
        catch( NumberFormatException ex){
            display("Invalid input");
            editEntry();
        }
        idNumberValidation(idNumber);

            int whaToEdit = Integer.parseInt(input("""
                what do you want to edit
                1. Title
                2. Body
                """));
            String title = null;
            String body = null;
            if (whaToEdit == 1){
                title = input("Enter your Entry title");}
            else if( whaToEdit == 2) {  body = input("What's  new?");}
            diary.editOrAddingIntoEntry(idNumber, title, body);
            display("Entry updated successfully");
            gotoMainMenu();


    }
    private static void overWriteEntryIn() {
        int idNumber = Integer.parseInt(input("Enter your id Number "));
        idNumberValidation(idNumber);
        int whaToOverWrite = Integer.parseInt(input("""
                what do you want to edit
                1. Title of Entry
                2. Body of Entry
                """));
        String title = null;
        String body = null;
        if (whaToOverWrite == 1){
            title = input("Enter your Entry title");}
        else if( whaToOverWrite == 2) {  body = input("What's  new?");}

        diary.overwriteEntry(idNumber, title, body);
        display("Entry updated successfully");
        gotoMainMenu();
    }

       private static void countEntry() {
                String numberOfEntries =String.format( """
				You have %s numbers of entries in your diary
				""", diary.countEntries());
        display(numberOfEntries);
        gotoMainMenu();
    }


    private static void exitApplication() {
        display("Thank you for using our application ");
        System.exit(1);
    }

    private static void deleteEntryIn() {
        int idNumber = Integer.parseInt(input("Enter Your entry id you want to delete"));
        idNumberValidation(idNumber);
       diary.deleteEntry(idNumber);
            display("Entry deleted successful");
                gotoMainMenu();
    }


    private static String input(String Prompt){
        return JOptionPane.showInputDialog(Prompt);
        // display(Prompt);
        //  return keyboardInputCollector.nextLine();
    }
    private static void display(String prompt){
        //System.out.println(prompt);
        JOptionPane.showMessageDialog(null, prompt);
    }

    private static void idNumberValidation(int idNumber){
        try {diary.validateId(idNumber);}
        catch (IndexOutOfBoundsException ex){
            display("ID Number not found");
            gotoMainMenu();
        }
    }

}
