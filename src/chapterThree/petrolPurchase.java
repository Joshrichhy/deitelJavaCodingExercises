package chapterThree;

import java.util.Scanner;

public class petrolPurchase {
private String stationLocation;
private String typeOfPetrol;
private int quantityOfPurchaseInLitres;
private double pricePerLitre;
private double percentageDiscount;

    public petrolPurchase(String stationLocation, String typeOfPetrol, int quantityOfPurchaseInLitres, double pricePerLitre, double percentageDiscount) {
        this.stationLocation = stationLocation;
        this.typeOfPetrol = typeOfPetrol;
        this.quantityOfPurchaseInLitres = quantityOfPurchaseInLitres;
        this.pricePerLitre = pricePerLitre;
        this.percentageDiscount = percentageDiscount;



    }

    Scanner input = new Scanner(System.in);

    public String getStationLocation() {
        return stationLocation;
    }

    public void setStationLocation(String stationLocation) {
        System.out.println("Enter Petrol Station Location: ");
        this.stationLocation = input.nextLine();
    }

    public String getTypeOfPetrol() {
        return typeOfPetrol;
    }

    public void setTypeOfPetrol(String typeOfPetrol) {
        System.out.println("What type of Petrol did you purchase: ");
        this.typeOfPetrol = input.nextLine();
    }

    public int getQuantityOfPurchaseInLitres() {
        return quantityOfPurchaseInLitres;
    }

    public void setQuantityOfPurchaseInLitres(int quantityOfPurchaseInLitres) {
        System.out.println("Enter the quantity of litres you purchased: ");
        this.quantityOfPurchaseInLitres = input.nextInt();
    }

    public double getPricePerLitre() {
        return pricePerLitre;
    }

    public void setPricePerLitre(double pricePerLitre) {
        //System.out.println("What is the price per litre");
        //double price = input.nextDouble();
        this.pricePerLitre = pricePerLitre;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        System.out.println("What is the percentage discount: ");
        this.percentageDiscount = input.nextDouble();
    }
public double getPurchaseAmount () {

       double amount = (quantityOfPurchaseInLitres * pricePerLitre);
                double discountedprice = ((percentageDiscount/100) * (amount));
        return amount =  amount - discountedprice;
}

public void petrolinformation(){
    System.out.println("Fuel Station Location: " + getStationLocation());
    System.out.println("The Type of petrol you purchased:  " + getTypeOfPetrol());
    System.out.println("Price per Litre: " + getPricePerLitre());
    System.out.println("Quantity: " + getQuantityOfPurchaseInLitres());
    System.out.println("Discount percentage: " + getPercentageDiscount());
    System.out.println("Total Amount: " + getPurchaseAmount());

}
public void information(){
    setStationLocation("Enter location");
   setTypeOfPetrol("type of Petrol");
    setPricePerLitre(0.0);
    setQuantityOfPurchaseInLitres(0);
    setPercentageDiscount(0);
}

}
