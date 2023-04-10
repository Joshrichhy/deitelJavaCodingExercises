import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LcmArrayTest {
    @Test
    public void numbersOfDivisibleTest(){
        LcmArray lcmArray = new LcmArray();
        int num = 200;
        int numbersOfDivisible = lcmArray.numbersOfDivible(num);
        assertEquals(5, numbersOfDivisible);
    }

    @Test
    public void arrayOfDivisibleTest(){
        LcmArray lcmArray = new LcmArray();
        int num = 12;
        int [] divisibles = {2,2,3};
        assertEquals(Arrays.toString(divisibles), Arrays.toString(lcmArray.divisible(num)));
    }
}