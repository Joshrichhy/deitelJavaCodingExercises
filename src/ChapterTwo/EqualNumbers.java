package ChapterTwo;

import java.util.Scanner;

public class EqualNumbers {

	public static void main (String [] args) {

	Scanner scanner = new Scanner(System.in);

System.out.print("Enter numbers: ");
	
	int number1 = scanner.nextInt();
	
	int number2 = scanner.nextInt();

	int number3 = scanner.nextInt();
	
	int number4 = scanner.nextInt();

if (number1 == number2 & number2 == number3 & number3 == number4) {

System.out.print("All numbers are equal");
}

if (number1 != number2 & number2 != number3 & number3 != number4) {

System.out.print("All numbers are not equal");
}

}
}