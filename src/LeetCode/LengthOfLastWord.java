package LeetCode;

import java.util.Arrays;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello World Josh ";
        int index = s.lastIndexOf(" ");
        String newString = s.substring(index+1);
        System.out.println(newString.length());
       char lastIndex =  s.charAt(s.length()-1);
        String[]  newTokenized = s.split(" ");
            System.out.println(Arrays.toString(newTokenized));
            String theWord = "";
        for (String n: newTokenized) {
            theWord = n;
             }
        System.out.println(theWord.length());








    }

}
