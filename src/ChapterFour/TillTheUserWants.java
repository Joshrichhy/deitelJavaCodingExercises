package ChapterFour;

import java.util.Scanner;

public class TillTheUserWants {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float min = Float.POSITIVE_INFINITY;
        float max = Float.NEGATIVE_INFINITY;


       System.out.println("Enter Number or 00 to quit");
        float userInput = input.nextFloat();

         while (userInput != 00) {

            if (userInput > max) {

                max = userInput;
            }
                if (userInput < min ) {
                    min = userInput;
                }
             System.out.println("Enter Number or 00 to quit");
             userInput = input.nextFloat();
             //userInput += 1;}
         }

        System.out.printf("The highest number is %.1f and the lowest number is %.1f%n ", max, min);
        System.out.println("Thank you for using me, come again later, Bye, dont forget to rate me five stars.");
        }


    }




