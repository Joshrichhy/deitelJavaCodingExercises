package DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitCountTest {
    @Test
    public void countDigitTest(){
        String [] letters = {"Ab1396", "? Q2RBS", "G381ac "};
        assertEquals(8, DigitCount.countDigit(letters));
    }

}