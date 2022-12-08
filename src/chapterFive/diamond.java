package chapterFive;

import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input number");
        int shape = input.nextInt();
        int space = (shape-1)/2;


        for(int i = 1; i <= shape; i+=2){
            for (int j = 1; j <= space; j++ ){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++  ){
                System.out.print("*");
            }
            System.out.println();
            space--;

        }
        space = 1;
shape = shape - 2;
        for(int i = shape; space < shape; i-=2){
            for (int j = 0; j < space; j++ ){
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--){
                System.out.print("*");
            }
            System.out.println();
            space ++;
        }

    }
}
