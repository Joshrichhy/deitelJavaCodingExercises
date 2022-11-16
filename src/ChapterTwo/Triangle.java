package ChapterTwo;

import java.util.Scanner;

public class Triangle {

	public static void main (String [] args) {

	Scanner scanner = new Scanner(System.in);

System.out.println("Enter Triangle Points");

System.out.println("Side A1");
	
	Double A1 = scanner.nextDouble();

System.out.println("Side B1");

	Double B1 = scanner.nextDouble();

System.out.println("Side A2");

	Double A2 = scanner.nextDouble();

System.out.println("Side B2");

	Double B2 = scanner.nextDouble();

System.out.println("Side A3");

	Double A3 = scanner.nextDouble();

System.out.println("Side B3");

	Double B3 = scanner.nextDouble();


Double A = A1 * (B2 - B3);

Double B = A2 * (B3 - B1);

Double C = A3 * (B1 - B2);

Double Area = 0.5 * (A + B + C);

if (Area < 0){

System.out.printf("The Area of the Triangle is %.2f", Area *(-1));

}

if (Area >= 0) {

System.out.printf("The Area of the Triangle is %.2f", Area);

}
}


}