package TicTacToe;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    public  static final String [][] BOARD = new String[3][3];
    public static final String PLAYER_ONE = "X";
    public static final String PLAYER_TWO = "O";




    public static String selectPlayer(){
        Scanner input = new Scanner(System.in);
        System.out.println("Select player number, number is between 1 & 2");
        int player = input.nextInt();
        String mainPlayer = null;
                switch (player) {
            case 1 -> mainPlayer = PLAYER_ONE;
            case 2 -> mainPlayer = PLAYER_TWO;
                }


        return mainPlayer;
    }

    public static void movePlayer(int number, String playee) {
        int boardNumber = 0;
        for (int i = 0; i < BOARD.length; i++) {
            for (int j = 0; j < BOARD.length; j++){
                boardNumber++;
                if (boardNumber == number && BOARD[i][j].equals(" ")){
                    BOARD[i][j] = playee;}
                else if (boardNumber == number && !BOARD[i][j].equals(" ")){
                    System.out.println("player on board");
                }

            }
        }
        for (String[] rows : BOARD) {
            System.out.println(Arrays.toString(rows));

        }
    }

    public static int chooseNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Select number to play on board");
        int number = input.nextInt();
    return number;
    }

    public static void playerOnewins(){
        if(PLAYER_ONE.equalsIgnoreCase(BOARD[0][0])&&PLAYER_ONE.equalsIgnoreCase(BOARD[0][1])&&
                PLAYER_ONE.equalsIgnoreCase(BOARD[0][2])){
            System.out.println("Player One wins");
            System.exit(0);}

        else if (PLAYER_ONE.equalsIgnoreCase(BOARD[1][0])&&PLAYER_ONE.equalsIgnoreCase(BOARD[1][1])&&
                PLAYER_ONE.equalsIgnoreCase(BOARD[1][2])) {
            System.out.println("Player One wins");
            System.exit(0);}

        else if (PLAYER_ONE.equalsIgnoreCase(BOARD[2][0])&&PLAYER_ONE.equalsIgnoreCase(BOARD[2][1])&&
                PLAYER_ONE.equalsIgnoreCase(BOARD[2][2])) {
            System.out.println("Player One wins");
            System.exit(0);}

        if(PLAYER_ONE.equalsIgnoreCase(BOARD[0][0])&&PLAYER_ONE.equalsIgnoreCase(BOARD[1][0])&&
                PLAYER_ONE.equalsIgnoreCase(BOARD[2][0])){
            System.out.println("Player One wins");
            System.exit(0);}

        else if (PLAYER_ONE.equalsIgnoreCase(BOARD[0][1])&&PLAYER_ONE.equalsIgnoreCase(BOARD[1][1])&&
                PLAYER_ONE.equalsIgnoreCase(BOARD[2][1])) {
            System.out.println("Player One wins");
            System.exit(0);}

        else if (PLAYER_ONE.equalsIgnoreCase(BOARD[0][2])&&PLAYER_ONE.equalsIgnoreCase(BOARD[2][2])&&
                PLAYER_ONE.equalsIgnoreCase(BOARD[2][0])) {
            System.out.println("Player One wins");
            System.exit(0);}

        else if (PLAYER_ONE.equalsIgnoreCase(BOARD[0][0])&&PLAYER_ONE.equalsIgnoreCase(BOARD[1][1])&&
                PLAYER_ONE.equalsIgnoreCase(BOARD[2][2])) {
            System.out.println("Player One wins");
            System.exit(0);}

        else if (PLAYER_ONE.equalsIgnoreCase(BOARD[0][2])&&PLAYER_ONE.equalsIgnoreCase(BOARD[1][1])&&
                PLAYER_ONE.equalsIgnoreCase(BOARD[2][0])) {
            System.out.println("Player One wins");
            System.exit(0);}
    }

    public static void playerTwowins(){
        if(PLAYER_TWO.equalsIgnoreCase(BOARD[0][0])&&PLAYER_TWO.equalsIgnoreCase(BOARD[0][1])&&
                PLAYER_TWO.equalsIgnoreCase(BOARD[0][2])){
            System.out.println("Player Two wins");
            System.exit(0);}

        else if (PLAYER_TWO.equalsIgnoreCase(BOARD[1][0])&&PLAYER_TWO.equalsIgnoreCase(BOARD[1][1])&&
                PLAYER_TWO.equalsIgnoreCase(BOARD[1][2])) {
            System.out.println("Player Two wins");
            System.exit(0);}

        else if (PLAYER_TWO.equalsIgnoreCase(BOARD[2][0])&&PLAYER_TWO.equalsIgnoreCase(BOARD[2][1])&&
                PLAYER_TWO.equalsIgnoreCase(BOARD[2][2])) {
            System.out.println("Player Two wins");
            System.exit(0);}

        if(PLAYER_TWO.equalsIgnoreCase(BOARD[0][0])&&PLAYER_TWO.equalsIgnoreCase(BOARD[1][0])&&
                PLAYER_TWO.equalsIgnoreCase(BOARD[2][0])){
            System.out.println("Player Two wins");
            System.exit(0);}

        else if (PLAYER_TWO.equalsIgnoreCase(BOARD[0][1])&&PLAYER_TWO.equalsIgnoreCase(BOARD[1][1])&&
                PLAYER_TWO.equalsIgnoreCase(BOARD[2][1])) {
            System.out.println("Player Two wins");
            System.exit(0);}

        else if (PLAYER_TWO.equalsIgnoreCase(BOARD[0][2])&&PLAYER_TWO.equalsIgnoreCase(BOARD[2][2])&&
                PLAYER_TWO.equalsIgnoreCase(BOARD[2][0])) {
            System.out.println("Player Two wins");
            System.exit(0);}

        else if (PLAYER_TWO.equalsIgnoreCase(BOARD[0][0])&&PLAYER_TWO.equalsIgnoreCase(BOARD[1][1])&&
                PLAYER_TWO.equalsIgnoreCase(BOARD[2][2])) {
            System.out.println("Player Two wins");
            System.exit(0);}

        else if (PLAYER_TWO.equalsIgnoreCase(BOARD[0][2])&&PLAYER_TWO.equalsIgnoreCase(BOARD[1][1])&&
                PLAYER_TWO.equalsIgnoreCase(BOARD[2][0])) {
            System.out.println("Player Two wins");
            System.exit(0);}


    }
}
