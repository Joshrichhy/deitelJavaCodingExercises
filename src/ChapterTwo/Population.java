package ChapterTwo;

import java.util.Scanner;

public class Population {

	public static void main(String[] arg) {

	Scanner input = new Scanner(System.in);



double worldPopulation = 8000000000.0;
double worldPopulationGrowth = 0.01;
double currentWorldPopulation = worldPopulation + (0.01 * worldPopulation);

double year2023 = currentWorldPopulation + (0.01 * currentWorldPopulation);
double year2024 = year2023 + (0.01 * year2023);
double year2025 = year2024 + (0.01 * year2024);
double year2026 = year2025 + (0.01 * year2025);

System.out.print("Enter year between 2023 and 2026: ");
int year = input.nextInt();
	

	if (year == 2023) {
	System.out.printf("estimated world population is %.0f", year2023);
}  
	if (year == 2024) {
	System.out.printf("estimated world population is %.0f", year2024);

}  
	if (year == 2025) {
	System.out.printf("estimated world population is %.0f", year2025);
}   
	if (year == 2026) {
	System.out.printf("estimated world population is %.0f", year2026);
}

}



}