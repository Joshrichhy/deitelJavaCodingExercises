package ChapterTwo;

import java.util.Scanner;

public class Larger {

	public static void main (String [] args) {

	Scanner scanner = new Scanner(System.in);

System.out.print("Enter number: ");
	
	int number1 = scanner.nextInt();

System.out.print("Enter number: ");
	
	int number2 = scanner.nextInt();

int RemA = number1 % 6;

int RemB = number2 % 6;




if (number1 > number2) {

System.out.printf("%d is the larger number %n", number1);
}

if (number2 > number1) {

System.out.printf("%d is the larger number", number2);
}


if (number1 == number2) {

System.out.printf("0");
}

if (RemA == RemB & number1 < number2) {
	


System.out.printf("The Smaller value is %d", number1);
}

if (RemA == RemB & number2 < number1) {
	


System.out.printf("The Smaller value is %d", number2);
}


}
}