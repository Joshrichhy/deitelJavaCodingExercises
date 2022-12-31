package xmasChicken;

import java.util.Arrays;
import java.util.Scanner;

public class myerBriggs {

    static String [] answers = new String [20];
    public static String [] result = new String[4];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       questionaire();
        String answer = input.nextLine();
        for (int eachQuestions = 0; eachQuestions < answers.length; eachQuestions++) {
            answers[eachQuestions] = String.valueOf(answer.charAt(eachQuestions));
        }
        System.out.println(Arrays.toString(answers));

        displayResult();






    }
    private static void questionaire(){
        System.out.println("""
                          A                                          B
                1. expand energy, enjoy groups           conserve energy, enjoy one-on-one
                
                2. interpret literally                   look for meaning and possibilities                                             
                
                3. logical, thinking, questioning         empathetic, feeling, accomodating
                 
                4. organized, orderly                     flexible, adaptable
               
                5. more outgoing, think aloud             more reserved, think to yourself
               
                6. practical, realistic, experimental     imaginative, innovative, theoretical
                
                7. candid, straight forward, frank        tactful, kind, encouraging
               
                8. plan, schedule                         unplanned, sponteneous
                
                9. seek many tasks, public activities,    seek private, solitary activities
                    interaction with others
                
                10. standard, usual, conventional         different, novel, unique
                
                11. firm, tend to criticize, hold         gentle, tend to appreciate, conciliate
                    the line  
               
                12. regulated, structured                 easygoing live and let live
               
                13. external, communicative,              internal, reticent, keep to yourself
                    express yourself
                
                14. focus on here-and- now                look to the future, global perspective, big picture
                
                15. tough-minded, just                    tender-hearted, merciful
                
                16. preparation, plan ahead               go with the flow, adapt as you go
                
                17. active, initiate                      reflective, deliberate
                
                18. fact, things, what is                 ideas, dreams, what could be, philosophical
                
                19. matter of fact, issue oriented        sensitive, people-oriented, compassionate
                
                20. control, govern                       latitude, freedom
                 """);


    }

    private static void forEandI(){
        int optionA = 0;
        int optionB = 0;
        String[] compartmentA = new String[5];
        compartmentA[0] = answers[0];
        compartmentA[1] = answers[4];
        compartmentA[2] = answers[8];
        compartmentA[3] = answers[12];
        compartmentA[4] = answers[16];

        for (int i = 0; i < compartmentA.length; i++) {
            if (compartmentA[i].equals("A")){
                System.out.println((i+1) +" "+ compartmentA[i]);
                optionA++;
            }
            else if(compartmentA[i].equals("B")) {optionB++;
                System.out.println((i+1) +" "+ compartmentA[i]);}

        }
        System.out.printf("optionA has %d while optionB is %d%n", optionA, optionB);

    if (optionA > optionB) {result[0] = "E";
        }
    else { result[0] = "I";}
    }

    private static void forSandN(){
        int optionA = 0;
        int optionB = 0;
        String[] compartmentB = new String[5];
        compartmentB[0] = answers[1];
        compartmentB[1] = answers[5];
        compartmentB[2] = answers[9];
        compartmentB[3] = answers[13];
        compartmentB[4] = answers[17];

        for (int i = 0; i < compartmentB.length; i++) {
            if (compartmentB[i].equals("A")){
                System.out.println((i+1) +" "+ compartmentB[i]);
                optionA++;
            }
            else if(compartmentB[i].equals("B")) {optionB++;
                System.out.println((i+1) +" "+ compartmentB[i]);}

        }
        System.out.printf("optionA has %d while optionB is %d%n", optionA, optionB);

        if (optionA > optionB) {result[1] = "S";
        }
        else { result[1] = "N";}
    }
    private static void forTandF(){
        int optionA = 0;
        int optionB = 0;
        String[] compartmentC = new String[5];
        compartmentC[0] = answers[2];
        compartmentC[1] = answers[6];
        compartmentC[2] = answers[10];
        compartmentC[3] = answers[14];
        compartmentC[4] = answers[18];

        for (int i = 0; i < compartmentC.length; i++) {
            if (compartmentC[i].equals("A")){
                System.out.println((i+1) +" "+ compartmentC[i]);
                optionA++;
            }
            else if(compartmentC[i].equals("B")) {optionB++;
                System.out.println((i+1) +" "+ compartmentC[i]);}

        }
        System.out.printf("optionA has %d while optionB is %d%n", optionA, optionB);

        if (optionA > optionB) {result[2] = "T";
        }
        else { result[2] = "F";}
    }

    private static void forJandP(){
        int optionA = 0;
        int optionB = 0;
        String[] compartmentD = new String[5];
        compartmentD[0] = answers[3];
        compartmentD[1] = answers[7];
        compartmentD[2] = answers[11];
        compartmentD[3] = answers[15];
        compartmentD[4] = answers[19];

        for (int i = 0; i < compartmentD.length; i++) {
            if (compartmentD[i].equals("A")){
                System.out.println((i+1) +" "+ compartmentD[i]);
                optionA++;
            }
            else if(compartmentD[i].equals("B")) {optionB++;
                System.out.println((i+1) +" "+ compartmentD[i]);}

        }
        System.out.printf("optionA has %d while optionB is %d%n", optionA, optionB);

        if (optionA > optionB) {result[3] = "J";
        }
        else { result[3] = "P";}
    }

    private static void displayResult(){
        int optionA = 0;
        int optionB= 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i].equals("A")){
                optionA++;
            }
            else if(answers[i].equals("B")) {optionB++;
               }

        }
        System.out.printf("optionA has %d while optionB is %d%n", optionA, optionB);
        forSandN();forEandI();forTandF();forJandP();
        System.out.println(Arrays.toString(result));
        System.out.println("I HOPE THIS HELPS YOU TO KNOW YOUR PERSONALITY TYPE");
    }

}
