package tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarTest {
    @Test
    public void testThatCarExistTest() {
        Car benz = new Car("G-990", "2022", 50.00);
        assertNotNull(benz);
    }

    @Test
    public void testThatCarAttributesAreProperlyInitializedTest() {
        Car benz = new Car("G-990", "2022", 50.00);
        assertEquals("G-990", benz.getmodel());
        assertEquals("2022", benz.getyear());
        assertEquals(50.00, benz.getprice());

    }

    @Test
    public void testThatOnlyPositiveAmountAreAlloweAsCarPrice() {
        Car benz = new Car("G-990", "2022", 50.00);
        benz.setprice(-200000);
        assertEquals(50.00, benz.getprice());


    }

    @Test
    public void testDiscount() {
        Car benz = new Car("G-990", "2022", 100.00);
        benz.setDiscount(10);
        assertEquals(10, benz.getDiscount());

    }

    @Test
    public void testSetPriceAppliesDiscount() {
        Car benz = new Car("G-990", "2022", 100.00);
        benz.setprice(1000.00);
        benz.setDiscount(10);
        assertEquals(100, benz.getDiscount());

    }
    @Test
    public void testAllPricesAndDiscount() {
      Car benz = new Car("G-990", "2022", 100.00);
      assertEquals(100, benz.getprice());
    benz.setDiscount(10);
    assertEquals(10, benz.getDiscount());
    benz.applyDiscountedPrice();
    assertEquals(90, benz.getdiscountedPrice());


    }
}