package ChapterTwo;

import java.util.Scanner;

public class SumDifference {

	public static void main (String [] args) {

	Scanner scanner = new Scanner(System.in);

System.out.print("Enter number: ");
	
	int number1 = scanner.nextInt();

System.out.print("Enter number: ");
	
	int number2 = scanner.nextInt();


int Sum = number1 + number2;

int Difference = number1 - number2;

int Product = number1 * number2;

int Average = (number1 + number2) / 2;

int Distance = number1 - number2;



System.out.printf("Sum is %d%n Difference is %d%n Product is %d%n Average is %d%n Distance is %d%n", Sum, Difference, Product, Average, Distance);


if (number1 > number2) {

System.out.printf("%d is max %n", number1);
}

if (number2 > number1) {

System.out.printf("%d is max", number2);
}


if (number1 < number2) {

System.out.printf("%d is smaller", number1);
}

if (number2 < number1) {

System.out.printf("%d is smaller", number2);
}



}
}