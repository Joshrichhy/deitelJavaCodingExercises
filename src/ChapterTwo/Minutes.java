package ChapterTwo;

import java.util.Scanner;

public class Minutes {

	public static void main (String [] args) {

	Scanner scanner = new Scanner(System.in);

System.out.print("Enter the number of minutes: ");
	
	int Minutes = scanner.nextInt();

int Year = Minutes / 525600;

int Days = Minutes / 1440 % 365;







System.out.printf("%d years and %d days", Year, Days);


}


}