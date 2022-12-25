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
                1.
                A. expand energy, enjoy groups
                B. conserve energy, enjoy one-on-one
                
                2.
                A. interpret literally
                B. look for meaning and possibilities
                
                3.
                A. logical, thinking, questioning
                B. empathetic, feeling, accomodating
                
                4. 
                A. organized, orderly
                B. flexible, adaptable
                
                5. 
                A. more outgoing, think aloud
                B. more reserved, think to yourself
                
                6.
                A. practical, realistic, experimental
                B. imaginative, innovative, theoretical
                
                7.
                A. candid, straight forward, frank
                B. tactful, kind, encouraging
                
                8.
                A. plan, schedule
                B. unplanned, sponteneous
                
                9. 
                A. seek many tasks, public activities, interaction with others
                B. seek private, solitary activities, 
                
                10.
                A. standard, usual, conventional
                B. different, novel, unique
                
                11. 
                A. firm, tend to criticize, hold the line
                B. gentle, tend to appreciate, conciliate
                
                12. 
                A. regulated, structured
                B. easygoing live and let live
                
                13.
                A. external, communicative, express yourself
                B. internal, reticent, keep to yourself
                
                14. 
                A. focus on here-and- now
                B. look to the future, global perspective, big picture
                
                15.
                A. tough-minded, just
                B. tender-hearted, merciful
                
                16. 
                A. preparation, plan ahead
                B. go with the flow, adapt as you go
                
                17.
                A. active, initiate
                B. reflective, deliberate
                
                18. 
                A. fact, things, what is
                B. ideas, dreams, what could be, philosophical
                
                19. 
                A. matter of fact, issue oriented
                B. sensitive, people-oriented, compassionate
                
                20.
                A. control, govern
                B. latitude, freedom""");


    }

    private static void forEandI(){
        int A = 0;
        int B = 0;
        String[] compartmentA = new String[5];
        compartmentA[0] = answers[0];
        compartmentA[1] = answers[4];
        compartmentA[2] = answers[8];
        compartmentA[3] = answers[12];
        compartmentA[4] = answers[16];

        for (int i = 0; i < compartmentA.length; i++) {
            if (compartmentA[i].equals("A")){
                System.out.println((i+1) +" "+ compartmentA[i]);
                A++;
            }
            else if(compartmentA[i].equals("B")) {B++;
                System.out.println((i+1) +" "+ compartmentA[i]);}

        }
        System.out.printf("A has %d while B is %d%n", A, B);

    if (A > B) {result[0] = "E";
        }
    else { result[0] = "I";}
    }

    private static void forSandN(){
        int A = 0;
        int B = 0;
        String[] compartmentB = new String[5];
        compartmentB[0] = answers[1];
        compartmentB[1] = answers[5];
        compartmentB[2] = answers[9];
        compartmentB[3] = answers[13];
        compartmentB[4] = answers[17];

        for (int i = 0; i < compartmentB.length; i++) {
            if (compartmentB[i].equals("A")){
                System.out.println((i+1) +" "+ compartmentB[i]);
                A++;
            }
            else if(compartmentB[i].equals("B")) {B++;
                System.out.println((i+1) +" "+ compartmentB[i]);}

        }
        System.out.printf("A has %d while B is %d%n", A, B);

        if (A > B) {result[1] = "S";
        }
        else { result[1] = "N";}
    }
    private static void forTandF(){
        int A = 0;
        int B = 0;
        String[] compartmentC = new String[5];
        compartmentC[0] = answers[2];
        compartmentC[1] = answers[6];
        compartmentC[2] = answers[10];
        compartmentC[3] = answers[14];
        compartmentC[4] = answers[18];

        for (int i = 0; i < compartmentC.length; i++) {
            if (compartmentC[i].equals("A")){
                System.out.println((i+1) +" "+ compartmentC[i]);
                A++;
            }
            else if(compartmentC[i].equals("B")) {B++;
                System.out.println((i+1) +" "+ compartmentC[i]);}

        }
        System.out.printf("A has %d while B is %d%n", A, B);

        if (A > B) {result[2] = "T";
        }
        else { result[2] = "F";}
    }

    private static void forJandP(){
        int A = 0;
        int B = 0;
        String[] compartmentD = new String[5];
        compartmentD[0] = answers[3];
        compartmentD[1] = answers[7];
        compartmentD[2] = answers[11];
        compartmentD[3] = answers[15];
        compartmentD[4] = answers[19];

        for (int i = 0; i < compartmentD.length; i++) {
            if (compartmentD[i].equals("A")){
                System.out.println((i+1) +" "+ compartmentD[i]);
                A++;
            }
            else if(compartmentD[i].equals("B")) {B++;
                System.out.println((i+1) +" "+ compartmentD[i]);}

        }
        System.out.printf("A has %d while B is %d%n", A, B);

        if (A > B) {result[3] = "J";
        }
        else { result[3] = "P";}
    }

    private static void displayResult(){
        int A = 0;
        int B= 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i].equals("A")){
                A++;
            }
            else if(answers[i].equals("B")) {B++;
               }

        }
        System.out.printf("A has %d while B is %d%n", A, B);
        forSandN();forEandI();forTandF();forJandP();
        System.out.println(Arrays.toString(result));
        System.out.println("I HOPE THIS HELPS YOU TO KNOW YOUR PERSONALITY TYPE");
    }

}
