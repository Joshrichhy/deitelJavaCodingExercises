package ChapterTwo;

import java.util.Scanner;

public class Hexagon {

	public static void main (String [] args) {

	Scanner scanner = new Scanner(System.in);

System.out.print("Enter number: ");
	
	int Side = scanner.nextInt();
	
	double P = (Math.PI/6);

	double Area = (6*Side*Side)/(4 * Math.tan(P));


System.out.printf("Area of the hexagon is %.3f", Area);



}
}