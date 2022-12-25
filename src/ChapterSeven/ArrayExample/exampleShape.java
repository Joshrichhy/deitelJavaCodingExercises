package ChapterSeven.ArrayExample;

import java.util.Arrays;
import java.util.Scanner;

public class exampleShape {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Binary number");
        String binaryNumber = input.nextLine();

        int[] userInput = new int[8];

        int index;
        for (index = 0; index < userInput.length; index++) {
            userInput[index] = Integer.parseInt(String.valueOf(binaryNumber.charAt(index)));
        }
//        for (int i = 0; i < userInput.length; i++) {
//            if (userInput[0] == 1) {
//                System.out.println("# # # # #");
//            }
//            if (userInput[4] == 4) {
//            }
//            if (userInput[1] == 1) {
//                for (int j = 0; j < 3; j++) {
//                    for (int k = 0; k < 8; k++) {
//                        System.out.print(" ");
//                        if (k == 7) {
//                            System.out.print("#");
//                        }
//                    }
//                    System.out.println();
//                }
//            }
//            if (userInput[3] == 1) {
//                System.out.println("# # # # #");
//            }


        String [][] shape = {{"#","#","#","#","#","#"},
                             {"#"," "," "," "," ","#"},
                             {"#"," "," "," "," ","#"},
                             {"#"," "," "," "," ","#"},
                             {"#","#","#","#","#","#"},
                             {"#"," "," "," "," ","#"},
                             {"#"," "," "," "," ","#"},
                             {"#"," "," "," "," ","#"},
                             {"#","#","#","#","#","#"}};
        for (String[] rows:shape) {
            System.out.println(Arrays.deepToString(rows));
        }
        if (userInput[0] == 1){ for (int i = 0; i < 5; i++) {
            System.out.print(shape[0][i]);}System.out.println();}

       else if (userInput[1]== 1){
            for (int index2 = 1; index2 < 4; index2++) {
                for (int i = 1; i < 6; i++) {
                    System.out.print(shape[index2][i]);}
                System.out.println();}}
        if (userInput[2] == 1){
            for (int i = 0; i < 5; i++) {System.out.print(shape[4][i]);}
            System.out.println();
        }
        if (userInput[3] == 1 && userInput[1]== 1){
            for (int index2 = 0; index2 < 4; index2++) {
                for (int i = 0; i < 6; i++) {
                    System.out.print(shape[index2][i]);}
                System.out.println();}

        }







    }


//         System.out.println(Arrays.toString(userInput));
    }

