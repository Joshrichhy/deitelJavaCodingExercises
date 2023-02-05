package TicTacToe;

import java.util.Arrays;

import static TicTacToe.TicTacToe.BOARD;

public class TicTacToeMain {
    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();

        for (int i = 0; i < BOARD.length; i++) {
            for (int j = 0; j < BOARD.length; j++) {
                BOARD[i][j] = " ";
            }


        }

        for (int j = 0; j < 9; j++) {
            String play = TicTacToe.selectPlayer();
            int numberOnBoard = TicTacToe.chooseNumber();
            TicTacToe.movePlayer(numberOnBoard, play);
//
            TicTacToe.playerOnewins();
//
            TicTacToe.playerTwowins();
//        }


        }
    }
}
