package Practice;

import java.util.Scanner;

public class methodForPrimeNumber {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        displayPrimeNumber(7);
      primeNumberUpToTenThousand(10);


    }
    private static void primeNumber(int number){
        int counter = 0;
        for (int count = 1; count <= number; count++) {
            if (number % count == 0){
                counter ++;}
        }
        if (counter == 2){
            System.out.println(number + " Number is a prime Number");
        }
        else {
            System.out.println(number + " number is not a Prime Number");
        }

    }

    private static void primeNumberUpToTenThousand(int number){
        if (number <= 10000){

        for (int counting = 1; counting <= number; counting++) {
            int counter = 0;
            for ( int numberThatCanDivide = 1; numberThatCanDivide <= counting; numberThatCanDivide++) {
                if (counting % numberThatCanDivide == 0){
                    counter ++;}
                }
                if (counter == 2){
                    System.out.println(counting);}
        }

        }
        else {
            System.out.println("ooops, too large, input number below 10,000");
        }
    }

    private static void displayPrimeNumber(int number){

        for (int count = 0; count < number; count++) {
            primeNumber(count);
        }


    }


}

