package ChapterTwo;

import java.util.Scanner;

public class Average {

	public static void main (String [] args) {

	Scanner scanner = new Scanner(System.in);

System.out.print("Enter number: ");
	
	int number1 = scanner.nextInt();

System.out.print("Enter number: ");
	
	int number2 = scanner.nextInt();

System.out.print("Enter number: ");
	
	int number3 = scanner.nextInt();


int Average = (number1 + number2 + number3) / 3;





System.out.printf("The average of the numbers is %d", Average);





}
}