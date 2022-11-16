package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class utmeTest {
    @Test
    public void price0fOneToFourCopiesTest(){
        Driller driller = new Driller();
       int price = driller.price(4, 2000);
        assertEquals(8000, price);
    }

    @Test
    public void price0fFiveToNineCopiesTest(){
        Driller driller = new Driller();
        int price = driller.price(7, 1800);
        assertEquals(12600, price);
    }
    @Test
    public void price0fTenToTwentyNineCopiesTest(){
        Driller driller = new Driller();
        int price = driller.price(12, 1600);
        assertEquals(19200, price);
    }
    @Test
    public void price0fThirtyToFortyNineCopiesTest(){
        Driller driller = new Driller();
        int price = driller.price(35, 1500);
        assertEquals(52500, price);
    }
    @Test
    public void price0fFiftyToNinetyNineCopiesTest(){
        Driller driller = new Driller();
        int price = driller.price(55, 1300);
        assertEquals(71500, price);
    }
    @Test
    public void price0fHundredToHundredAndNinetyNineCopiesTest(){
        Driller driller = new Driller();
        int price = driller.price(100, 1200);
        assertEquals(120000, price);
    }
    @Test
    public void price0fTwoHundredToFourHundredAndNinetyNineCopiesTest(){
        Driller driller = new Driller();
        int price = driller.price(200, 1100);
        assertEquals(220000, price);
    }
    @Test
    public void price0fAboveFiveHundredCopiesTest(){
        Driller driller = new Driller();
        int price = driller.price(500, 1000);
        assertEquals(500000, price);
    }
}
