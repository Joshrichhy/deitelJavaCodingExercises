package xmasChicken;


public class SemicolonMall {

    private  String CustomersName;
    private String cashierName;
    private double discountedPrice;
    private final String storeName;
    private final String location;
    private final String telephoneNumber;


    public SemicolonMall(String storeName, String location, String telephoneNumber) {
        this.storeName = storeName;
        this.location = location;
        this.telephoneNumber = telephoneNumber;
    }

    public String getCustomersName() {
        return CustomersName;
    }

    public void setCustomersName(String customersName) {
        CustomersName = customersName;
    }


    public String getStoreName() {
        return storeName;
    }

    public String getLocation() {
        return location;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getCashierName() {
        return cashierName;
    }

    public void setCashierName(String cashierName) {
        this.cashierName = cashierName;
    }

    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(double discountedPrice) {

        this.discountedPrice = discountedPrice;
    }


}