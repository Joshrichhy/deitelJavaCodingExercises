package Assignment;

import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int num = input.nextInt();
        while (num != 0){
            System.out.println("1");
           num= input.nextInt();
           switch (num) {
               case 1: System.out.println("another number");
            int num2 = input.nextInt();
            while (num2 != 0){
                System.out.println("2");
                num2 = input.nextInt();
               switch (num2) {
                   case 1: System.out.println("another number 3");
                int num3 = input.nextInt();
                while (num3 != 0){
                    System.out.println("4");
                    num3 = input.nextInt();}
                   case 2:
                       System.out.println("madman"); }

                }
               case 2:
                   System.out.println("you are high");}

            }
    }
}
