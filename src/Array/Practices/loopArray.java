package Array.Practices;

import java.util.Arrays;

public class loopArray {
    public static void main(String[] args) {
        int [][] number = new int [3][3];
        int numbers = 1;
        for (int row = 0; row < number.length; row++) {

            for (int column = 0; column < number.length; column++) {
                number[row][column] = numbers;
                numbers++;
            }
        }
        System.out.print(Arrays.deepToString(number));
    }
}
