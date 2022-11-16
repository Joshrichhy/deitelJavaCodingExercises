package ChapterFour;

import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int count = 1;
        int counter = 0;
        System.out.println("Enter number: ");
        int userInput = input.nextInt();
        while (count <= userInput){
            if (userInput % count == 0){
                counter += 1;
            }
            count += 1;
        }System.out.println(userInput + "has" + counter + " factors");
    }
}