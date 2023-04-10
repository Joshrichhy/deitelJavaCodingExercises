import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println(isPalindrome(userInput));
    }
    public static boolean isPalindrome(String input){
        int count = 0;
        for (int i = input.length()-1; i >= 0; i--) {
            if(input.charAt(i) != input.charAt(count)){
                return false;}count++;}
        return true;}
}
