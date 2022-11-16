package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class kataTest {
    @Test
    public void squareTest(){
    Kata kata = new Kata();

    int result = kata.squareOf(5);
    assertEquals(25, result);
    }
    @Test
    public void addTest(){
        Kata kata = new Kata();

        int result = kata.add(5, 23);
        assertEquals(28, result);
    }
    @Test
    public void maxTest(){
        Kata kata = new Kata();

        int result = kata.add(5, 23);
        assertEquals(28, result);
    }

}
