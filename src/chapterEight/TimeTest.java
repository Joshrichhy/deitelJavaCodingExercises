package chapterEight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TimeTest {
    static Scanner input = new Scanner(System.in);

    public static void main(String... args) {
        Time t = new Time(6,6,6);
        System.out.println("Enter MINUTE");
        int min = input.nextInt();
        t.setMinute(min);

        validateHour();
    }
    public static void validateHour(){
        System.out.println("Enter Hour");
        int hour = input.nextInt();
        try {
            boolean hourIsValid =  hour < 0 || hour > 24;
            if(hourIsValid) throw new IllegalArgumentException("invalid Hour");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            validateHour();

        }
}
}
