package ChapterTwo;

import java.util.Scanner;

	public class ClassWork{ 

	public static void main (String [] args) {
	
	Scanner scanner = new Scanner (System.in);

	System.out.println("What is your name?");
	String Name = scanner.nextLine();

	System.out.printf("Welcome %s%n, so happy to have you here", Name); 


}
}