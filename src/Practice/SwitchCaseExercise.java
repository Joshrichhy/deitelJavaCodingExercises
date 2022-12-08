package Practice;

import java.util.Scanner;

public class SwitchCaseExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Player Number");
        int number = input.nextInt();


        switch(number){
            case 1: System.out.println("Goalkeeper");
            break;
            case 2: System.out.println("Defender 1");
            break;
            case 3: System.out.println("Defender 2");
                break;
            case 4: System.out.println("Defender 3");
                break;
            case 5: System.out.println("Defender 4");
                break;
            case 6: System.out.println("Striker 1");
                break;
            case 7: System.out.println("Striker 2");
                break;
            case 8: System.out.println("Striker 3");
                break;
            case 9: System.out.println("Attacker 1");
                break;
            case 10: System.out.println("Attacker 2");
                break;
            case 11: System.out.println("Attacker 3");
                break;
            default:
             System.out.println("Fellow Onlooker, whatsup man, we gather no sabi ball");


        }

      ;
        int student = 1;
        int sum = 0;

        while(student <= 10){

            System.out.println("Enter grade");
            int grade = input.nextInt();
          //  if (grade < 0 || grade > 100) System.exit(1);
            if (grade < 0 || grade > 100) terminateAbruptly();
            sum  += grade;
            student += 1;

        }
        int average = sum/10;
        System.out.println(average);
    }
    private static void terminateAbruptly(){
        System.out.println("you entered a wrong grade");
        System.exit(1);
    }
}
