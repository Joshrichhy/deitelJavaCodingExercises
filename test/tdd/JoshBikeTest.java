package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JoshBikeTest {
    @Test
    public void powerOn(){
        //given that i have a bike
        JbBike jb = new JbBike();
        //when it is on
        jb.setpowerOn(true);
        //check that it is on
        assertEquals(true, jb.getpower());


    }
    @Test
    public void powerOff(){
        //given i have a bike
        JbBike jb = new JbBike();
        //given that it is on
        jb.setpowerOn(true);
        //check that it is on
        assertEquals(true, jb.getpower());
        //when it is off
        jb.setpowerOff(true);
        //check that it is off
        assertEquals(true, jb.getpower());


    }
    @Test
    public void accelerate(){
        //given that i have a bike
        JbBike jb = new JbBike();
        //given that i turrned it on
        jb.setpowerOn(true);
        //check that it is on
        assertEquals(true, jb.getpower());
        //when i set the speed/gear
        jb.setGear(14);
        //check that the gear is at the said gear
        assertEquals( 1, jb.getgear());
        //when i accelerate
        jb.setacceleration(14);
        //check that it accelerated
        assertEquals(15, jb.getacceleration());

    }
    @Test
    public void decelerate(){
        //given that i have a bike
        JbBike jb = new JbBike();
        //given that i turrned it on
        jb.setpowerOn(true);
        //check that it is on
        assertEquals(true, jb.getpower());
        //when i set the speed/gear
        jb.setGear(20);
        //check that the gear is set
        assertEquals( 1, jb.getgear());
        //when i decelerate
        jb.setdeceleration(30);
        //check that it decelerated
        assertEquals(28, jb.getdeceleration());

    }
}
