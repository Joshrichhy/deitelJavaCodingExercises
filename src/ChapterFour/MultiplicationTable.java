package ChapterFour;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1;
        System.out.println("Enter number");
        int userInput = input.nextInt();
        while (count <= 12) {
            int total = userInput * count;
            System.out.printf("%d times %d = %d%n", userInput, count, total);
            count += 1;
        }
    }
}