package Practice;

import java.util.Scanner;

public class Human {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        int guess = 65;

        while (count < 4){
            System.out.println("Enter a number:");
            int number = input.nextInt();
            count += 1;

            if (number == guess){
             System.out.println("you mad o, how did you get that so fast");
             break;
        }
         else {
                if (number < guess)
                    System.out.println("A whole you, try again");

            }
         }

         }


    }


