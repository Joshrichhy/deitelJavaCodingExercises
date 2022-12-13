package Array.Practices;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" how many numbers are you inputing: ");
        int lengthOfArray = input.nextInt();
        int [] arrayLength = new int [lengthOfArray];
        System.out.println("Enter the number you want to get the values that will add up to your number:");
        int sum = input.nextInt();

        for (int index = 0; index < lengthOfArray; index++) {
            System.out.println("Enter Numbers: ");
            int number = input.nextInt();
            arrayLength [index] = number;
        }

        for (int index = 0; index < arrayLength.length; index++) {
            for (int numbersInTheArrayList = 0; numbersInTheArrayList < arrayLength[index]; numbersInTheArrayList++) {
                if ((sum - arrayLength[numbersInTheArrayList]  == arrayLength[index] ) &&
                        arrayLength[numbersInTheArrayList] != arrayLength[index] ){
                    System.out.printf("Index %d & %d gives the number you asked for:%n", index, numbersInTheArrayList);
                    System.out.printf("%d + %d = %d%n", arrayLength[index], arrayLength[numbersInTheArrayList], sum);
                }

            }


        }







    }
}
