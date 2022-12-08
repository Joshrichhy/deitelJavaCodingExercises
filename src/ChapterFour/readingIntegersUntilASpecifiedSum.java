package ChapterFour;

import java.util.Scanner;

public class readingIntegersUntilASpecifiedSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int firstNumber = input.nextInt();
        //int secondNumber = input.nextInt();
      //  int thirdNumber = input.nextInt();
        int sum = 0;
        while (sum < firstNumber ){
            System.out.println("Enter Number");
            sum +=  input.nextInt();
            if (firstNumber == sum){
                System.out.println("The sum of the numbers after the first Number you inputed is equal to " + firstNumber);
            }
            else if (sum > firstNumber){
                System.out.println("The sum of the numbers after the first Number you inputed is greater than" + firstNumber);
            }
        }
        System.out.println("The first Number is " + firstNumber);
    }
}
