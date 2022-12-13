package Practice;

public class KudaBank {
    private String name;
    private double balance;

    private double transfer;

    public KudaBank(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

   public void setBalance(double balance) {
        this.balance = balance;
    }

    public String transfer (double amount){
        balance = balance - amount;
        return "transfer successful";
    }

    public double deposit (double amount){
        balance = balance + amount;
        return balance;

    }

}
