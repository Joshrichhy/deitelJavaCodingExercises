package ChapterTwo;

import java.util.Scanner;

public class Comparison{

	public static void main (String [] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("Enter integer: ");

	int A = input.nextInt();

	
	if (A + (A * A) > 100) {

	System.out.printf("%d > 100", A);

}
}

}