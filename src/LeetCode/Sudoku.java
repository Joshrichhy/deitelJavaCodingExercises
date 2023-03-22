package LeetCode;

import java.util.Arrays;

public class Sudoku {
    public static void main(String[] args) {
        char [][] board = {{'5', '3', '.','.','7','.','.','.','.'}
                                        ,{'6','.','.','1','9','5','.','.','.'}
                                        ,{'.','9','8','.','.','.','.','6','.'}
                                        ,{'8','.','.','.','6','.','.','.','3'}
                                        ,{'4','.','.','8','.','3','.','.','1'}
                                        ,{'7','.','.','.','2','.','.','.','6'}
                                        ,{'.','6','.','.','.','.','2','8','.'}
                                        ,{'.','.','.','4','1','9','.','.','5'}
                                        ,{'.','.','.','.','8','.','.','7','9'}};


        for (int i = 0; i < board.length; i++) {



        }




char numberToBeCompare =' ';

        for (int i = 0; i < board.length ; i++) {
            for (int k = 0; k < board.length; k++) {
               numberToBeCompare =  board[i][k];}

            for (int index = 0; index < board.length; index++) {
                if(board[i][index] == numberToBeCompare){
                System.out.println(numberToBeCompare);
                    System.out.println(i  +" and" + index);
                break;}


            }
            System.out.println();
            for (int j = 0; j < board[i].length; j++) {
                if(board[j][i] == numberToBeCompare) {
                    System.out.println(numberToBeCompare);
                    System.out.println(j  +" and" + i);
                    break;
                }

            }
            System.out.println();


//            for (int l = i; l < board.length; l++) {
//                if(board[i][l]== numberToBeCompare){
//                    for (int j = 0; j < board[i].length; j++) {
//                        System.out.println(board[i][j]);
//                        if(board[j][i]==numberToBeCompare){
//                            System.out.println("index "+ i + "index " +l);
//                            System.out.println("Yes"); break;
//                            }
//                   }
//                   }
    //}



        }
    }
}
