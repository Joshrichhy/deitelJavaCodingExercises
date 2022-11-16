package Practice;

import java.util.Scanner;

public class oddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter number");
        int number = input.nextInt();



        if (number%2 == 0 ) {
            System.out.println(number + " " + "is an even number ");
        }
        else if (number%2 >= 1) {
            System.out.println( number + " " + "it is an odd number ");
        }

    }
}
