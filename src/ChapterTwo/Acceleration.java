package ChapterTwo;

import java.util.Scanner;

public class Acceleration {

	public static void main (String [] args) {

	Scanner input = new Scanner(System.in);

System.out.println("Enter Initial Velocity: ");

double v0 = input.nextDouble();


System.out.println("Enter Ending Velocity: ");

double v1 = input.nextDouble();


System.out.println("Enter Time: ");

double Minutes = input.nextDouble();

double t = Minutes; 

double a = v1 - v0 / t;

System.out.printf("The average acceleration is %.2f", a);



}



}