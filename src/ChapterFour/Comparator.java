package ChapterFour;

import java.util.Scanner;

public class Comparator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int firstNumber = input.nextInt();

        System.out.println("Enter Number");
        int secondNumber = input.nextInt();

    if (firstNumber == secondNumber){
        System.out.println("0");
    }
    else if (firstNumber > secondNumber){
        System.out.println("1");
    }
    else if (firstNumber < secondNumber){
        System.out.println("-1");
    }

        System.out.println("Do you want to continue comparing? Press 0 to continue");
    int continuation = input.nextInt();
    while (continuation == 0) {
        System.out.println("Enter Number");
         firstNumber = input.nextInt();

        System.out.println("Enter Number");
         secondNumber = input.nextInt();

        if (firstNumber == secondNumber){
            System.out.println("0");
        }
        else if (firstNumber > secondNumber){
            System.out.println("1");
        }
        else if (firstNumber < secondNumber){
            System.out.println("-1");
        }

        System.out.println("Do you want to continue comparing? Press 0 to continue OR any Number to terminate");
         continuation = input.nextInt();

    }

}


    }

