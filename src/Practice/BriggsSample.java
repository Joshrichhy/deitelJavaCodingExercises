package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class BriggsSample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] answers = new String[3];
        System.out.println("""
               1
               A. GHOST
               B. NIKE
               
               2
               A. BIKE
               B. JOSH
               
               3
               A. GAY
               B. LESBIAN""");
        String answer = input.nextLine();

        for (int i = 0; i < answers.length; i++) {

            answers[i] = String.valueOf(answer.charAt(i));

        }

        int A = 0;
        int B = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i].equals("A")){
                System.out.println(i + answers[i]);
                A++;
            }
            else {B++;
                System.out.println(i);}

        }
        System.out.printf("A has %d while B is %d%n", A, B);

        System.out.println(Arrays.deepToString(answers));
    }
}
