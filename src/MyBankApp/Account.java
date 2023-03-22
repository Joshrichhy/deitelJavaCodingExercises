package MyBankApp;

import java.math.BigDecimal;

public class Account {

    private BigDecimal balance = BigDecimal.ZERO;
    private String pin;
    private String accountName;
    private int accountNumber;

    public Account(int accountNumber, String accountName, String accountPin) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        pin = accountPin;
    }

    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    public BigDecimal getBalance(String pin) {
        validatePin(pin);
        return balance;
    }

    private void validatePin(String pin) {
        if(!pin.equals(this.pin))throw new IllegalArgumentException("Invalid Pin");
    }

    public BigDecimal withdraw(BigDecimal amount, String pin) {
        var result = balance.compareTo(amount);
        if (result < 0) throw new IllegalArgumentException("Insufficient fund");
        validatePin(pin);
        balance = balance.subtract(amount);
        return balance;

}

    public String toString(){
        return String.format("""
                Account name: %s
                Account Number: %s
                Account Balance: %s""", accountName, accountNumber, balance.toPlainString());
    }

}