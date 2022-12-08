package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RiderTest {
    @Test
    public void RiderGetFiftyPercentBonus(){
        Rider rider = new Rider();
       double bonus = rider.sales(50);
        assertEquals(10000, bonus);


    }
    @Test
    public void RiderGetSixtyPercentBonus(){
        Rider rider = new Rider();
        double bonus = rider.sales(60);
        assertEquals(15000, bonus);


    }
    @Test
    public void RiderGetSeventyPercentBonus(){
        Rider rider = new Rider();
        double bonus = rider.sales(70);
        assertEquals(35000, bonus);


    }
    @Test
    public void RiderBelowfifttyPercentBonus(){
        Rider rider = new Rider();
        double bonus = rider.sales(49);
        assertEquals(0, bonus);


    }
}
