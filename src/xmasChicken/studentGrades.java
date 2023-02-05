package xmasChicken;

import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalInt;
import java.util.Scanner;

public class studentGrades {

    static int[][] studentGradesArray;
    static int student;
    static int subject;
    static int score;

    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many Students are in your class");
        int numberOfStudents = input.nextInt();
        System.out.println("how many subjects are they offering?");
        int numberOfSubjects = input.nextInt();

        studentGradesArray = new int[numberOfStudents][numberOfSubjects];
        Integer [] total = new Integer[numberOfStudents];
        int [] average = new int [numberOfStudents];

        for (student = 0; student < studentGradesArray.length; student++) {
            for (int subject = 0; subject < studentGradesArray[student].length; subject++) {
                System.out.printf("Enter Score for Student %d in subject %d%n", (student + 1), (subject + 1));
                System.out.println("Scores must between 0 and 100");
                score = input.nextInt();
                if (score >= 0 && score <= 100) {
                    studentGradesArray[student][subject] = score;
                } else {
                    scoreConstraint();}
            }


            for (int scoresOfEachStudent = 0; scoresOfEachStudent < studentGradesArray.length; scoresOfEachStudent++) {
                int totalScore = 0;

                for (int scores: studentGradesArray[scoresOfEachStudent]) {
                       totalScore += scores;
                    total[scoresOfEachStudent] = totalScore;
                    average[scoresOfEachStudent] = totalScore/numberOfStudents;

                }


            }




        }
        int [] position = new int[numberOfStudents];

        // Arrays.sort(total, Collections.reverseOrder());

        //for (int i = 0; i < position.length; i++) {
         //   total = Arrays.sort(total, Collections.reverseOrder());
       // }


        System.out.println(Arrays.toString(total));




        System.out.println(Arrays.toString(total));
        System.out.println(Arrays.toString(average));
       // System.out.println(Arrays.toString(position));

        System.out.println(Arrays.deepToString(studentGradesArray));
        for (int[] rows: studentGradesArray) {
            System.out.println(Arrays.toString(rows));

        }

int highestScoringStudent = 0;
        int lowestScoringStudent = 0;
        int sum =0;

        int counter = 0;



        for (int i = 0; i < studentGradesArray.length; i++) {
            sum += studentGradesArray[i][counter];

           // for (int j = 0; j < studentGradesArray.length; j++) {
               // System.out.println(studentGradesArray[i][counter]);

                //highestScoringStudent = studentGradesArray[i][j].max();
               // lowestScoringStudent = Arrays.stream(studentGradesArray[counter]).min();

           // }
            counter++;
           // System.out.println(highestScoringStudent);
            //System.out.println(lowestScoringStudent);
            System.out.println(sum);
        }


    }

    public static void scoreConstraint() {
        System.out.println("Enter a valid score");
        System.out.printf("Enter Score for Student %d in subject %d%n", (student + 1), (subject + 1));
        System.out.println("Scores must between 0 and 100");
        score = input.nextInt();
        if (score >= 0 && score <= 100) {
            studentGradesArray[student][subject] = score;
        }
        else{
            scoreConstraint();

        }
    }

}