package ChapterFour;

import java.util.Scanner;

public class UsersLargest {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter number or enter 0 to quit");
        int num = input.nextInt();
         int largest = num;
         int lowest = num;

         while (num != 0){
             System.out.println("Enter number or enter 0 to quit");
             num = input.nextInt();
             if (num > largest){
                 largest = num;
             }

             if (num < lowest){
                 lowest = num;
             }

         }
        System.out.println(largest + " is the largest number");
        System.out.println(lowest + " is the lowest number");

    }
}
