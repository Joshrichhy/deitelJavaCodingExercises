package Regex;

import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String userInput = "email@gmail.com";
        System.out.println(userInput.matches("[a-z]+@[a-z]+\\.[a-z]{2,}"));
        System.out.println(Pattern.matches("[a-z]+@[a-z]+\\.[a-z]{2,}", userInput));

        Pattern pattern = Pattern.compile("[a-z]+@[a-z]+\\.[a-z]{2,}");
        Matcher matcher = pattern.matcher(userInput);
        System.out.println(matcher.matches());

        String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "September", "November", "December"};
        String dob = "01/01/1970";
        String[] d = dob.split("/");
        String mo = d[1];
        int m = Integer.parseInt(mo) - 1;
    StringBuilder newDate = new StringBuilder(Arrays.toString(d));

       newDate.replace(4, 7, months[m]);
       newDate.replace(3, 4, " ");

        System.out.println(newDate);
        DateTimeFormatter userDate = DateTimeFormatter.ofPattern(dob);
        System.out.println(userDate );

        }




    }

