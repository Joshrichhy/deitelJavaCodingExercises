package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClockTest {
    @Test
    public void hourTest(){
        Clock clock = new Clock(00,00,00);
        clock.setHour(22);
        assertEquals(22, clock.getHour());

    }
    @Test
    public void minuteTest(){
        Clock clock = new Clock(00,00,00);
        clock.setMinute(54);
        assertEquals(54, clock.getMinute());

    }
    @Test
    public void secondTest(){
        Clock clock = new Clock(00,00,00);
        clock.setSecond(20);
        assertEquals(20, clock.getSecond());

    }
    //@Test
    //public void clockDisplayTest(){
        //Clock clock = new Clock(00,00,00);
      //  clock.display(23, 23,54);
       // assertEquals(23, 23,54, clock.getdisplay());

    //}
}
