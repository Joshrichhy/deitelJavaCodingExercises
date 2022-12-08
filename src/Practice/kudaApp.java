package Practice;

import java.util.Scanner;

public class kudaApp {
    public static void main(String[] args) {
        KudaBank kuda = new KudaBank("Josh", 1000);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = input.nextLine();
        kuda.setName(name);

        System.out.println("amount to transfer");
        double amountToTransfer = input.nextDouble();

        System.out.println(kuda.getName() + "\n " + kuda.transfer(amountToTransfer) + "\n " + kuda.getBalance());


    }
}
