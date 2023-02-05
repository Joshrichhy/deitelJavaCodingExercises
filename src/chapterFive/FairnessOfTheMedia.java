package chapterFive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FairnessOfTheMedia {
    Scanner input = new Scanner(System.in);

    ArrayList<String> response = new ArrayList<>();

    public String administerQuestions() {
        String responsetoQuestion = "";
//        System.out.println("""
//                THIS QUESTIONAIRE IS TO KNOW HOW FAMILIAR YOU ARE WITH THE MEDIA IN NIGERIA
//
//                You have two questions with five options that have four possible answers...
//
//                Press 1 to start or 0 to terminate
//                              """);
//        int response = input.nextInt();
//
//        while (response == 1){
        System.out.println("""
                   Question 1: How well have the media in Nigeria reported crimes
                   
                   i: The Kaduna-Abuja train attack was reported.
                  A. YES
                  B. NO
                                    
                   
                   ii: The IPOB sit-at-home was effectively reported.
                    A. YES
                    B. NO
                   
                   iii: The the Covid-19 pandemic, the One million boys cult attack on homes in Lagos
                       was reported
                    A. YES
                    B. NO
                       
                   iv: Fulani herdsmen destruction of farmland in South South was reported.
                   A. YES
                    B. NO
                   
                   v: Fulani herdsmen destruction of farmland in South West was reported.
                   A. YES
                    B. NO
                   
                   
                    Question 2: During the past four years in Nigeria, how well have good governance been reported
                   
                   i: The Buhari-led administration was painted as 80% bad governance.
                   A. YES
                    B. NO
                   
                   ii: The Buhari led administration supported the 2020 Lekki Protest.
                   A. YES
                    B. NO
                   
                   iii: The Buhari led administration totally put an end to SARS in Nigeria.
                   A. YES
                    B. NO
                       
                   iv: The rate of unemployment increased in the past 4 years.
                   A. YES
                    B. NO
                   
                   v:  The rate of dollar to Naira increased in the past 4 years.
                   A. YES
                    B. NO
                   
                                
                   
                """);

        responsetoQuestion = input.nextLine();

        return responsetoQuestion;

    }

    public void resultAnalysis(String answer) {

        String[] answerInArray = new String[10];

        String[] correctAnswers = {"A", "A", "B", "A", "A", "B", "B", "B", "A", "A"};

        for (int i = 0; i < correctAnswers.length; i++) {
            answerInArray[i] = String.valueOf(answer.charAt(i));
        }

        for (int i = 0; i < answerInArray.length; i++) {
            if (correctAnswers[i].equalsIgnoreCase(answerInArray[i])) {
                response.add(answerInArray[i]);
            }
        }


        if (response.size() == 10) {
            System.out.println("EXECELLENT");
        } else if (response.size() > 6 && response.size() < 10) {
            System.out.println("VERY GOOD");
        } else if (response.size() <= 6) {
            System.out.println("Ahn Ahnnnn, Time to brush up, listen to the news more");
        }

        int numbersGotten = response.size();
        System.out.println(" you got only " + numbersGotten);
    }
}
