package ChapterTwo;

import java.util.Scanner;

public class SumMultiply {

	public static void main (String [] args) {

	Scanner scanner = new Scanner(System.in);

System.out.print("Enter number: ");
	
	int number1 = scanner.nextInt();

System.out.print("Enter number: ");
	
	int number2 = scanner.nextInt();


int Sum = number1 + number2;

int Multiply = number1 * number2;

int Subtract = number1 - number2;

int Divide = number1 / number2;

int Remainder = number1 % number2;



System.out.printf("Sum = %d%n Multiply = %d%n Subtract = %d%n Divide is %d%n Remainder = %d%n", Sum, Multiply, Subtract, Divide, Remainder);





}
}