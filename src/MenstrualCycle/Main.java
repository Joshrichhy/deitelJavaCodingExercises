package MenstrualCycle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your dripping day in this format...  \"01/02/2023\"");
        String menstrualDate = scanner.nextLine();
        System.out.println("Enter the numbers of days you drip:: ");
        int flowDays = scanner.nextInt();
        System.out.println("Enter your cycle days:: ");
        int cycle = scanner.nextInt();

        YearlyCycle yearlyCycle = new YearlyCycle(cycle, flowDays, menstrualDate);
        System.out.println(yearlyCycle);
}
}
