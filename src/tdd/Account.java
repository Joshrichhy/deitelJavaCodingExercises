package tdd;

public class Account {
    private int balance;
    private String userPin = "1234";
    public void deposit(int amount) {
        if(amount>0) {
            balance = balance + amount;
        }
    }

    public int getBalance() {
        return balance;
    }


    public void withdraw(int amount, String Pin) {

        if (amount > 0 && amount <= balance) {

            balance = balance - amount;
        }
        if (userPin.equals("Pin")){
            userPin = Pin;
        }

        }

    public String pin(String userPin) {
        return userPin;
    }
}

