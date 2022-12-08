package ChapterFour;

import java.util.Scanner;

public class salesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int item = 0;
        double sum = 0;
        double bonus = 0;
        System.out.println("Enter Amount of Items and enter 0 to terminate");
        double amount = input.nextDouble();

       // System.out.println("item  \t  amount" );
        while (amount != 0){
            sum +=  amount;
            item += 1;
            amount = input.nextDouble();

        }
        //System.out.println(item + "\t" + amount );
        bonus = 200 + (0.9 * sum);
        System.out.printf("Your Bonus this week is %.2f", bonus);

    }
}
