package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class gameOfCrap {
    private static double balance = 1000;
    static int wager;
    static int myPoint;
   static Status gameStatus;
    private static final SecureRandom randomNumbers =  new SecureRandom();
    private static final SecureRandom randomNumbersToDisplayChatter =  new SecureRandom();
    private enum Status{CONTINUE, WON, LOST}

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        myPoint = 0;
        System.out.println("Enter any number to play and 0 to terminate");
        int userInput = input.nextInt();

    while (userInput != 0) {
        System.out.println("Enter amount to wager: ");
        wager = input.nextInt();
       if (balance > 0 && wager <= balance) {
           play();}
       else { if (wager > balance && balance > 0){
           System.out.println("your current balance is " + balance + "\nKindly enter wager below your balance");
           wager = input.nextInt();
           play();}
       else{ if (balance == 0 && wager >= balance ) {
           System.out.println("oooops, sorry, No money in your account!!! \nYour current balance is "+ balance);
           System.out.println("""
                Would you like to deposit into your account?
                1. yes
                2. No
                """);
           int response = input.nextInt();
           switch (response){
               case 1:
                   System.out.println("How much do you want to deposit?");
                   double amount = input.nextDouble();
                   deposit(amount);
                   break;
               case 2:
                   System.out.println("Awwwwwn, we would like to have you here again...Bye");
                   System.exit(0);}

       }}
           System.out.println("Enter amount to wager: ");
           wager = input.nextInt();
           play();
       }

        System.out.println("Enter 1 to play and 0 to terminate");
         userInput = input.nextInt(); }
    }


    private static int rollDice() {
        int firstDie = 1 + randomNumbers.nextInt(6);
        int secondDie = 1 + randomNumbers.nextInt(6);
        int sum = firstDie + secondDie;
        System.out.println(firstDie +" + "+ secondDie +" = " + sum);

        return sum;
    }
    private static String deposit(double amount){

        balance = balance + amount;

        return "DEPOSIT SUCCESSFUL";
    }

    private static double play(){

        int sumOfDice = rollDice();

        switch (sumOfDice) {
            case SEVEN:
            case YO_LEVEN:
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = Status.LOST;
            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.println("Point is " + myPoint);
        }
        while (gameStatus == Status.CONTINUE) {
            chatter();
            sumOfDice = rollDice();

            if (sumOfDice == myPoint) {
                gameStatus = Status.WON;}
            else {
                if (sumOfDice == SEVEN) {
                    gameStatus = Status.LOST;}
                else {
                    if (balance == 0) {System.out.println("oooops, sorry, No Money!!!");
                        break;}
                }
            }
        }

        if (gameStatus == Status.WON) {
            balance += wager;
            System.out.println("PLAYER WINS");
            System.out.println("Your new balance is " + balance);}
        else {
            if (gameStatus == Status.LOST) {
                balance -= wager;
                System.out.println("PLAYER LOSES THE GAME");
                System.out.println("Your balance is " + balance);
            }
            if (balance == 0){
                System.out.println("Oooops, Sorry, YOU'RE BUSTED!!!");
            }
            }


        return balance;
    }

    private static void chatter(){
        if (gameStatus == Status.CONTINUE){
          int display = 1 + randomNumbersToDisplayChatter.nextInt(2);
          switch (display){
              case 1->
                  System.out.println("oh!, You are going for a broke, c'mon");
                  case 2 -> System.out.println("Aw c'mon, take a chance!");
                  case 3 -> System.out.println("You're up big, Now's the time to cash in your chips");
          }
        }
    }
}
