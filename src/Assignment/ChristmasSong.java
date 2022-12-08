package Assignment;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ChristmasSong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pick a day from the Days of Christmas Song");
        int days = input.nextInt();

        while (days <= 12){

            if (days == 1){
                System.out.println("On the first day of Christmas, my true love sent to me");
            }
            else if (days == 2){
                System.out.println("On the second day of Christmas, my true love sent to me");
            }
            else if (days == 3){
                System.out.println("On the third day of Christmas, my true love sent to me");
            }
            else if (days <= 12){
                System.out.println("On the " + days + "th day of Christmas, my true love sent to me");
            }
            switch (days) {
                case 12:
                    System.out.println("Twelve drummers drumming");
                case 11: System.out.println("Eleven pipers piping");
                case 10: System.out.println("Ten lords a leaping");
                case 9: System.out.println("Nine ladies dancing");
                case 8: System.out.println("Eight maids a-milking");
                case 7: System.out.println("Seven swans a-swimming");
                case 6: System.out.println("Six geese a-laying");
                case 5: System.out.println("Five golden rings");
                case 4: System.out.println("Four calling birds");
                case 3: System.out.println("Three french hens");
                case 2:  System.out.println("Two turtle doves, and");
                case 1: System.out.println("A partridge in a pear tree");



            }

            days ++;
            System.out.println("\n\n\nPick a day from the Days of Christmas Song");
            days = input.nextInt();
        }

    }
}
