package ChapterTwo;

import java.util.Scanner;

public class runWayLength {

	public static void main (String [] args) {

	Scanner scanner = new Scanner(System.in);

System.out.print("Enter speed(m/s): ");
	
	double v = scanner.nextDouble();


System.out.print("Enter acceleration: ");
	
	double a = scanner.nextDouble();

double length = (v * v) / (2 * a);


System.out.printf("The minimum runway length for the airplane is %.3f", length);


}


}