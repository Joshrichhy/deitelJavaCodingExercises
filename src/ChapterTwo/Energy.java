package ChapterTwo;

import java.util.Scanner;

public class Energy {

	public static void main (String [] args) {

	Scanner scanner = new Scanner(System.in);

System.out.print("Enter the amount of water in Kilogram: ");
	
	double M = scanner.nextDouble();


System.out.print("Enter the initial temperature(celsius): ");
	
	double initialTemperature = scanner.nextDouble();


System.out.print("Enter the final temperature(celsius): ");
	
	double finalTemperature = scanner.nextDouble();

double Q = M * (finalTemperature - initialTemperature) * 4184;


System.out.printf("The energy needed is %.2f joules", Q);


}


}