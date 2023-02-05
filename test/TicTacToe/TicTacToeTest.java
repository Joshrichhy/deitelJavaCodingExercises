package TicTacToe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static TicTacToe.TicTacToe.BOARD;
import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    TicTacToe ticTacToe;

    @BeforeEach
    void setUp() {ticTacToe = new TicTacToe();}

    @Test
    public void playersExistTest() {
        assertEquals("O", ticTacToe.PLAYER_TWO);
        assertEquals("X", ticTacToe.PLAYER_ONE);
    }
    @Test
    public void ticTacToeBoardOfNinePostionsTest(){
        assertEquals(3, BOARD.length);
    }

    @Test
    public void playerOneIsOnBoard(){

        BOARD[0][0] = ticTacToe.PLAYER_ONE;
        BOARD[0][1] = ticTacToe.PLAYER_TWO;
        assertEquals(ticTacToe.PLAYER_ONE, BOARD[0][0]);
        assertEquals(ticTacToe.PLAYER_TWO, BOARD[0][1]);
    }
    @Test
    public void playersCanMoveOnTheBoardTest(){

        System.out.println(Arrays.deepToString(BOARD));
        assertEquals(ticTacToe.PLAYER_ONE, BOARD[0][0]);

    }

}
