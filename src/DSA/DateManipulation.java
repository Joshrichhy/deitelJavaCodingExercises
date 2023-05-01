package DSA;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class DateManipulation {
    public static void main(String[] args) {
        System.out.println(ageCalculator("12/05/2021"));


    }

    public static DayOfWeek dateChange(int day){
        LocalDate presentDay = LocalDate.of(2022, day,17);
        presentDay.withDayOfMonth(day);
        return presentDay.getDayOfWeek();
    }
    public static StringBuilder dateTaker(String date){
        String [] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "September", "November", "December"};

        String[] d = date.split("/");
        String mo = d[1];
       String day = d[0];
        int m = Integer.parseInt(mo) - 1;
        StringBuilder newDate = new StringBuilder(Arrays.toString(d));
        newDate.replace(3, 7," "+ months[m]);
        System.out.println( dateChange(Integer.parseInt(day)) + " " +newDate);
        return  newDate;
    }

    public static String convert(String date){
        String[] splitDate = date.split("/");
        LocalDate localDate = LocalDate.of(Integer.parseInt(splitDate[2]), Integer.parseInt(splitDate[1]), Integer.parseInt(splitDate[0]));
        return DateTimeFormatter.ofPattern("EEEE, d MMMM, yyyy").format(localDate);
    }
    public static String convert2(String date){
        return DateTimeFormatter.ofPattern("EEEE, d MMMM, yyyy").format(LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    public static int ageCalculator(String date){
        String[] splitDate = date.split("/");
        int age=  LocalDate.now().getYear() - Integer.parseInt(splitDate[2]);
       return age;
    }
}
