package chapterThree;


public class Petrol {
    public static void main(String[] args) {
        petrolPurchase petrol = new petrolPurchase("JOSH", "DIESEL", 40, 200, 10);
       petrolPurchase petrol2 = new petrolPurchase("JOSH", "DIESEL", 40, 200, 10);

       petrol.information();
       petrol2.information();
       petrol.petrolinformation();
       petrol2.petrolinformation();
    }
}
