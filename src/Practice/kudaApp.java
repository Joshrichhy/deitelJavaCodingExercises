package Practice;

import java.util.Scanner;

public class kudaApp {
    public static void main(String[] args) {
        KudaBank kuda = new KudaBank("Josh", 10000);
        KudaBank spencerKuda = new KudaBank("Spencer", 1000);
        Scanner input = new Scanner(System.in);



       // System.out.println("Enter name of Account: ");
        //String name = input.nextLine();
        //kuda.setName(name);

        System.out.println("amount to transfer");
        double amountToTransfer = input.nextDouble();


       double spencer = spencerKuda.deposit(amountToTransfer);

        System.out.println("Amount transferred " + kuda.transfer(amountToTransfer) +
                "\n Spencer new balance is: " + spencerKuda.getBalance()+
        "\n Your current balance is :" + kuda.getBalance());


    }
}
