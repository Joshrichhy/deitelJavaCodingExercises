package ChapterSeven.ArrayExample;

import java.util.Arrays;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
       // int [] numbers = new int [10];
        //numbers [0] = 5;
        //numbers [4] = 10;
       // numbers [9] = 100;
        //numbers [4] = 29;

        //System.out.println(Arrays.toString(numbers));

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many scores you wan add?");
        int numberOfScores = scanner.nextInt();
        int[] scores = new int [numberOfScores];
        int sum = 0;

        for (int index = 0; index < numberOfScores; index++) {
            System.out.println("Enter number " + (index + 1));
            int score = scanner.nextInt();
            scores[index] = score;

        }

        for (int index = 0; index < scores.length; index++) {
            sum += scores[index];

        }
        System.out.println("sum of scores is " + sum);
    }
}
