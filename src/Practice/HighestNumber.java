package Practice;

import java.util.Scanner;

public class HighestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int highest = -10000;
        int Secondlargest = -10000;
        int lowest = 10000;
        int Secondlowest = 10000;
        int count = 0;

        while (count < 5){
        System.out.println(" Enter Number: ");
        int Number = input.nextInt();
        count += 1;

        if (Number > highest)
            Secondlargest = highest;
            highest = Number;

            if (Number < highest && Number > Secondlargest)
                Secondlargest = Number;

                if (Number < lowest )
                     Secondlowest = lowest;
                    lowest = Number;

                if (Number > lowest && Number < Secondlowest)
                    Secondlowest = Number;

            }

        System.out.printf("%d, %d, %d, %d ", highest, Secondlargest,  Secondlowest, lowest);


    }
        }

