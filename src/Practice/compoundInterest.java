package Practice;

import java.util.Scanner;

public class compoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double principal = 1000;
        double rate = 0.05;
        int year = 1;

        System.out.printf("%s %20s%n", "year", "Amount on deposit");

        for(year = 1; year <= 10; year ++){
           double interest = principal * Math.pow (1 + rate, year);
            System.out.printf("%3d%,20.2f%n", year, interest);
        }

    }
}
