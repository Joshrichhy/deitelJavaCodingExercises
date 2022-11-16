package ChapterTwo;

import java.util.Scanner;

public class sumDigits {

	public static void main (String [] args) {

	Scanner scanner = new Scanner(System.in);

System.out.print("Enter number between 0 and 1000: ");
	
	int digits = scanner.nextInt();

int digit1 = digits / 1000 % 10;
int digit2 = digits / 100 % 10;
int digit3 = digits / 10 % 10;
int digit4 = digits / 1 % 10;

int Sum = digit1 + digit2 + digit3 + digit4;



System.out.printf("The sum of the digits is %d", Sum);


}


}