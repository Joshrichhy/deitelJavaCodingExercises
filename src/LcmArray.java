import java.util.Arrays;

public class LcmArray {
    public static void main(String[] args) {
        int number = 20;
    }

    public static int numbersOfDivible(int numbers) {
        int counter = 0;
        for (int i = 2; i <= numbers; i++) {
            if (numbers%i == 0){
                counter++;
                  numbers/=i;
                i = 1;}}
        return counter;
    }

    public int[] divisible(int number) {
        int counter = 0;
        int [] divisibles = new int[numbersOfDivible(number)];
        for (int i = 2; i <= number; i++) {
            if (number%i == 0){
                divisibles[counter] = i;
                counter++;
                number/=i;
                i = 1;}}
        return divisibles;
    }
}
