package tdd;


public class CarApp {
    public static void main(String[] args) {
        Car bmw = new Car ("A5", "2021", 3_000_000.00);
        Car toyota = new Car ("Camry", "2021", 5_000_000.00);

        toyota.setDiscount(5);
        bmw.setDiscount(7);

        toyota.applyDiscountedPrice();
        bmw.applyDiscountedPrice();
        System.out.printf("Black friday Discount on Toyota is %.2f%n", + toyota.getDiscount() );
        System.out.printf("Black friday Discount on BMW is %.2f%n%n", + bmw.getDiscount()  );

       System.out.println("The Slashed price for the Toyota car is " + toyota.getprice());
        System.out.println("The Slashed price for the BMW car is " + bmw.getprice());

        System.out.println("The new price of the Toyota car is " + toyota.getdiscountedPrice());
        System.out.println("The new price of the BMW car is " + bmw.getdiscountedPrice());




    }
}
