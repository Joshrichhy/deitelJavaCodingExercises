package chapterEight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {
    @Test
    public void timeValidationTest(){
        assertThrows(IllegalArgumentException.class, ()->new Time(12, 45,87));
    }

}