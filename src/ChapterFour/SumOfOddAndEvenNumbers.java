package ChapterFour;

import java.util.Scanner;

public class SumOfOddAndEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int oddNumberCounter = 0;
        int evenNumberCounter = 0;
        int sumOdd = 0;
        int sumEven = 0;
        System.out.println("Enter Number or any negative number to quit");
        int userInput = input.nextInt();

        while (userInput > 0) {
            if (userInput%2 == 0){
                sumEven += userInput;
                evenNumberCounter += 1;
            }else {oddNumberCounter += 1;
                    sumOdd += userInput;
            }

            System.out.println("Enter Number or any negative number to quit");
            userInput = input.nextInt();

        }
        System.out.println("number of even number is " + evenNumberCounter);
        System.out.println("number of odd number is " + oddNumberCounter);
        System.out.println("Sum of even number is " + sumEven);
        System.out.println("Sum of odd number is " + sumOdd);
    }
}
