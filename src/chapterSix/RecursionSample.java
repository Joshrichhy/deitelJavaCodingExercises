package chapterSix;

import java.util.Scanner;

public class RecursionSample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("gimme number");
        int num = input.nextInt();
        printRightFacingRightAngledTriangle(num);
        printLeftFacingRightAngledTriangle(num);

    }
    private static void printRightFacingRightAngledTriangle(int number){
        if (number < 1) return;
        number = number -1;
        printRightFacingRightAngledTriangle(number);
        for (int index = 0; index < number; index++){
            System.out.print("* ");
        }
        System.out.println();
    }
    private static void printLeftFacingRightAngledTriangle(int number){

        if (number < 1) return;
        number = number -1;
        printLeftFacingRightAngledTriangle(number);
        for (int i = number; i < 4; i++){
            System.out.print(" ");
        }
        for (int index = 0; index < number; index++){
            System.out.print("*");
        }

        System.out.println();
    }
}
