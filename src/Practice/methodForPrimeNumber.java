package Practice;

import java.util.Scanner;

public class methodForPrimeNumber {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        primeNumber(5);
        primeNumberUpToTenThousand();


    }
    private static void primeNumber(int number){
        int counter = 0;
        for (int count = 1; count <= number; count++) {
            if (number % count == 0){
                System.out.println(count);
                counter ++;}

        }
        if (counter == 2){
            System.out.println("Number is a prime Number");
        }
        else {
            System.out.println("number is not a Prime Number");
        }
    }

    private static void primeNumberUpToTenThousand(){
        int counter = 0;
        for (int count = 1; count <= 10000; count++) {
            for ( int divisibleNumber = 1; divisibleNumber <= count; divisibleNumber++) {
                if (count % divisibleNumber == 0){
                    counter ++;}


                if (counter == 2){
                    System.out.println(count);}
            }

        }



    }
}
