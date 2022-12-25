package Array.Practices;

import java.util.Arrays;

public class arrayConstant {

    public static void main(String[] args) {

//       double [] numbers = new double[ARRAY_SIZE];
//        System.out.println(numbers[3]);
//       numbers [8] = 1.667;
//       numbers[5] = 3.333;
//
//       double sum = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
//             sum += numbers[i];
//
//        }
//        System.out.println(sum);
        final int ARRAY_SIZE = 3;
        int [][] table = new int [ARRAY_SIZE][3];
        for (int rows = 0; rows < table.length; rows++) {
            for (int column = 0; column < table[rows].length; column++) {
                table[rows][column] = rows + 1;
            }

        }
        System.out.println(Arrays.deepToString(table));
    }
}
