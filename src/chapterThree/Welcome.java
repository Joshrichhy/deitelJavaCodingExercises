package chapterThree;

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello World");
        System.out.println("Enter your username");
        String Name = input.nextLine();
        System.out.println("Welcome " + Name);
    }
}
