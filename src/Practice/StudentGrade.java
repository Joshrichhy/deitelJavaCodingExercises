package Practice;

import java.util.Scanner;

public class StudentGrade {
    static Scanner input = new Scanner(System.in);
    static int result;
    public static void main(String[] args) {

        int passed = 0;
        int failed = 0;
        int counter = 0;

        while (counter < 10) {
            System.out.println("Enter result");
             result = input.nextInt();

            if (result == 1){
                passed++;
                counter++;
            }else if (result == 2){failed++;counter++;}
            if (result != 1 && result !=2){
                System.out.println("invalid input");
                promptQuestionagain();
            }



        }
        System.out.println(passed+ " "+ failed);
    }

    private static void promptQuestionagain(){
        System.out.println("Enter result either 1 or 2");
        result = input.nextInt();
        if (result != 1 && result !=2){
            System.out.println("invalid input");

    }
}

}
