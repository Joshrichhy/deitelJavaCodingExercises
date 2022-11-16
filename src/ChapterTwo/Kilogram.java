package ChapterTwo;

import java.util.Scanner;

public class Kilogram {

	public static void main (String [] args) {

	Scanner scanner = new Scanner(System.in);

System.out.print("Enter number in pounds: ");
	
	double Number = scanner.nextDouble();

	double kilogram = Number * 0.454;

System.out.printf("%.3f pounds is %.3f kilogram", Number, kilogram);
}


}