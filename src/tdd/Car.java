package tdd;

public class Car {
    private String model;
    private String year;
    private double price;

    private double discount;
    private double dPrice;

    public Car(String model, String year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getmodel() {
        return model;
    }

    public String getyear() {
        return year;
    }

    public double getprice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setprice(double price) {
        if (price > 0){
            this.price = price;}
        //applyDiscount(10);}



    }


    public void setDiscount(double discountRate) {
      discount = (discountRate/100) * price;
     // price = price - discount;


    }

    public double getDiscount() {
        return discount;
    }

    public void applyDiscountedPrice() {
         dPrice = price - discount;
    }

    public double getdiscountedPrice() {
        return dPrice;
    }
}
