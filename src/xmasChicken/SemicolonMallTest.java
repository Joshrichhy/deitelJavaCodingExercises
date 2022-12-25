package xmasChicken;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class SemicolonMallTest {
    static ArrayList<Double> amount = new ArrayList<>();
    static ArrayList<String> itemsPurchased = new ArrayList<>();
    static ArrayList<Integer> quantities = new ArrayList<>();
    static ArrayList<Double> pricePerItems = new ArrayList<>();

    static SemicolonMall semicolonMall = new SemicolonMall("SEMICOLON STORES MAIN BRANCH",
            "312, HERBERT MACAULEY WAY, SABO YABA, LAGOS", "07033456743");

    static double subTotal = 0.0;
    static double totalAmount = 0.0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        System.out.println("What is the Customer's Name?");
        String customersName = input.nextLine();
        semicolonMall.setCustomersName(customersName);
        String items;
        int quantity;
        int counter = 0;

        double pricePerItem;
        String moreItems = "yes";

        while (!moreItems.equalsIgnoreCase("no")) {
            System.out.println("What did the user buy?");
            items = input.next();
            itemsPurchased.add(counter, items);

            System.out.println("How many pieces");
            quantity = input.nextInt();
            quantities.add(counter, quantity);

            System.out.println("How much per unit");
            pricePerItem = input.nextDouble();
            pricePerItems.add(counter, pricePerItem);
            System.out.println("Add more items?");
            moreItems = input.next();
            counter++;}

            Amount(quantities, pricePerItems);

        for (double price: amount) {
            subTotal += price;}

        System.out.println("What is your name?");
        String cashier = input.next();
        semicolonMall.setCashierName(cashier);
        System.out.println("How much discount?");
        double discount = input.nextDouble();
        semicolonMall.setDiscountedPrice(discount/100 * subTotal);
        totalAmount = subTotal - (discount/100 * subTotal) + (17.50/100 * subTotal);


        cartDisplay();

        System.out.println(" THIS IS NOT A RECEIPT, KINDLY PAY " + totalAmount);
        System.out.printf("%n%n%n%n%n%n");
        System.out.println("How much did the customer give to you?");
        double amountPaidByCustomer = input.nextDouble();


        cartDisplay();

        System.out.printf("Bill Total: %s  %n Amount Paid %s%n Balance:%s%n", totalAmount,
                amountPaidByCustomer, ( amountPaidByCustomer - totalAmount) );

        lines();

        System.out.println("THANK YOU FOR YOUR PATRONAGE");

        lines();


    }

    public static void Amount(ArrayList<Integer> quantities, ArrayList<Double> pricePerItems) {


        for (int i = 0; i < quantities.size(); i++) {
            amount.add(i, quantities.get(i) * pricePerItems.get(i));}

    }

    public static void cartDisplay(){
        System.out.printf("%s%n%s%n%s%n%s%n%s%n", semicolonMall.getStoreName(), semicolonMall.getLocation(),
                semicolonMall.getTelephoneNumber(), semicolonMall.getCashierName(), semicolonMall.getCustomersName());

        lines();

        System.out.println("ITEM        OTY          PRICE        TOTAL(NGN)");

        for (int i = 0; i < 50; i++) {
            System.out.print("-");}
        System.out.println();

        for (int i = 0; i < quantities.size(); i++) {
            System.out.printf("%-12s%-15s%-18s%-18s%n",
                    itemsPurchased.get(i), quantities.get(i), pricePerItems.get(i),
                    amount.get(i));}

        for (int i = 0; i < 50; i++) {
            System.out.print("-");}
        System.out.println();


        System.out.printf("Sub Total: %s%n Discount: %s%n VAT 17.50: %.2f%n", subTotal, semicolonMall.getDiscountedPrice(),
                (17.50/100 * subTotal));

        lines();

        System.out.printf("Bill Total: %.2f %n", totalAmount );

        lines();

    }

    private static void lines(){
        for (int i = 0; i < 50; i++) {
            System.out.print("=");}
        System.out.println();

    }
}