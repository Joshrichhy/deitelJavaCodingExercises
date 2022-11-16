package ChapterTwo;

import java.util.Scanner;

public class Feet {

	public static void main (String [] args) {

	Scanner scanner = new Scanner(System.in);

System.out.print("Enter value for feet: ");
	
	double feet = scanner.nextDouble();


double meters = feet * 0.305;


System.out.printf("%.3f feet is %.3f meters", feet, meters);


}


}