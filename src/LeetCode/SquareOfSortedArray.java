package LeetCode;

import java.util.Arrays;

public class SquareOfSortedArray {
    public static void main(String[] args) {
        int [] numbers = {-4,-1,0,3,10};
        int [] squaredNumbers = new int[numbers.length];
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            squaredNumbers[i] = numbers[i] * numbers[i];
        }
Arrays.sort(squaredNumbers);
        System.out.println(Arrays.toString(squaredNumbers));



    }
    }

