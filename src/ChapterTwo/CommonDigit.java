package ChapterTwo;

import java.util.Scanner;

public class CommonDigit {

	public static void main (String [] args) {

	Scanner scanner = new Scanner(System.in);

System.out.println("Enter number between 25 and 75");


System.out.print("Enter number: ");
	
	int number1 = scanner.nextInt();

System.out.print("Enter number: ");
	
	int number2 = scanner.nextInt();



int Digit1a = number1 / 10 % 10;

int Digit1b = number1 / 1 % 10;


int Digit2a = number2 / 10 % 10;

int Digit2b = number2 / 1 % 10;




if (Digit1a == Digit2a) {

System.out.printf("True, same digit is %d ", Digit1a );
}

if (Digit1b == Digit2b) {

System.out.printf("True, same digit is %d", Digit1b);
}

if (Digit1a == Digit2b) {

System.out.printf("True, same digit is %d ", Digit1a );
}

if (Digit1b == Digit2a) {

System.out.printf("True, same digit is %d ", Digit2a );
}

}
}