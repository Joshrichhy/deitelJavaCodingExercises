package LeetCode;

import java.util.Arrays;

public class RotateTheArray {
    public static void main(String[] args) {
        int [][] num = {{1,2,3,6,7}, {4,5,6,9,4}, {7,8,9,0,1},{5,9,4,3,1},{3,4,5,6,7} };
        int [][] rotatedArray = new int[num.length][num.length];
        for (int i = 0; i < num.length; i++) {
            int counter = 0;
            for (int j = num[i].length - 1; j >= 0; j--) {
                rotatedArray[i][counter] = num[j][i];
                        counter++;          }
        }
        System.out.println(Arrays.deepToString(rotatedArray));
    }
}
