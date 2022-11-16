package ChapterTwo;

import java.util.Scanner;

public class Negative {

	public static void main (String [] args){

	Scanner scanner = new Scanner (System.in);
	System.out.println("Enter digit: ");
	int digit = scanner.nextInt();
	

	System.out.println("Enter digit: ");
	int digit2 = scanner.nextInt();

	System.out.println("Enter digit: ");
	int digit3 = scanner.nextInt();

	System.out.println("Enter digit: ");
	int digit4 = scanner.nextInt();

	System.out.println("Enter digit: ");
	int digit5 = scanner.nextInt();

	int negcount = 0; 
	int poscount = 0;
	int zerocount = 0;
	


	System.out.printf("%d %d %d %d %d%n", digit, digit2, digit3, digit4, digit5);

if (digit < 0)
	negcount = negcount +1;
else if ( digit > 0)
	poscount = poscount +1;
else if (digit == 0)
	zerocount = zerocount +1;


if (digit2 < 0)
	negcount = negcount +1;
else if ( digit2 > 0)
	poscount = poscount +1;
else if (digit2 == 0)
	zerocount = zerocount +1;


if (digit3 < 0)
	negcount = negcount +1;
else if ( digit3 > 0)
	poscount = poscount +1;
else if (digit3 == 0)
	zerocount = zerocount +1;


if (digit4 < 0)
	negcount = negcount +1;
else if ( digit4 > 0)
	poscount = poscount +1;
else if (digit4 == 0)
	zerocount = zerocount +1;

if (digit5 < 0)
	negcount = negcount +1;
else if ( digit5 > 0)
	poscount = poscount +1;
else if (digit5 == 0)
	zerocount = zerocount +1;


System.out.printf("The number of negative numbers are %d%nThe numbers of positive numbers are %d%nThe numbers of zero are %d%n", negcount, poscount, zerocount);

}


}