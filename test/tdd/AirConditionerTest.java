package tdd;

import org.junit.jupiter.api.Test;

import javax.management.ObjectName;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {


    @Test
    public void AcOn() {
        //Given that I have an AC
        AirConditioner josh = new AirConditioner();
        //I turn it is off and i turned it on
       josh.setOn(true);
       // assertTrue(true);
        boolean joshstate = josh.getstate();
        assertEquals(true,joshstate);
    }
    @Test
    public void AcOff() {
        //Given that I have an AC
        AirConditioner josh = new AirConditioner();
        //I turn it is off and i turned it on
        josh.setOn(true);
        //i turn it off
        josh.setOff(true);
        boolean joshstate = josh.getstate();
        assertEquals(true,joshstate);
    }
    @Test
    public void increaseTemperature() {
        //Given that I have an AC
        AirConditioner josh = new AirConditioner();
        //I turn it is off and i turned it on
        josh.setOn(true);
        //increase temperature
        josh.setTemperature(25);
        josh.increaseTemperature();
        assertEquals(26, josh.getTemperature());

    }

    @Test
    public void decreaseTemperature() {
        //Given that I have an AC
        AirConditioner josh = new AirConditioner();
        //I turn it is off and i turned it on
        josh.setOn(true);
        //increase temperature
        josh.setTemperature(22);
        josh.decreaseTemperature();
        assertEquals(21, josh.getTemperature());

    }
    @Test
    public void increaseStaticTemperature() {
        //Given that I have an AC
        AirConditioner josh = new AirConditioner();
        //I turn it is off and i turned it on
        josh.setOn(true);
        //increase temperature
        josh.setTemperature(30);
        //when i increase temperature beyond 30
        josh.increaseTemperature();
        assertEquals(30, josh.getTemperature());

    }
    @Test
    public void decreaseStaticTemperature() {
        //Given that I have an AC
        AirConditioner josh = new AirConditioner();
        //I turn it is off and i turned it on
        josh.setOn(true);
        //increase temperature
        josh.setTemperature(16);
        //when i increase temperature beyond 30
        josh.decreaseTemperature();
        assertEquals(16, josh.getTemperature());

    }
    }
