package ChapterFour;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int userInput = input.nextInt();
        int count = 1;
        int counter = 0;
        while (count <= userInput) {
            if (userInput % count == 0) {
                counter += 1;
            }
            count += 1;
        }

            if (counter == 2) {
                System.out.println(userInput + " is a prime number");}

            else{
                System.out.println(userInput + " is not a prime number");


            }
        }}
