package Assignment;

import java.util.Scanner;

public class fraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        double sum = 0;
        int denominator = 1;
        int numerator = 0;

        System.out.println("Enter Number");
        double userInput = scanner.nextDouble();

        while (count <= userInput) {
            if (count % 2 != 0) {
                count = count;
            }
            denominator = denominator * count;
            sum += (1.0 / count);
            count += 1;
        }

        int lower = denominator;
        for (int i = 1; i <= userInput; i++) {
            numerator += (lower / i);
        }

       int num = 2;
        do { if (numerator % num == 0 && denominator % num == 0){
            numerator = numerator/num;
            denominator = denominator/num;

        }
        else{denominator = denominator;
        numerator= numerator;}
       num += 1;

        }while(num <= 30);


        System.out.println(sum);
        System.out.println(numerator+"/"+denominator);


    }
}
