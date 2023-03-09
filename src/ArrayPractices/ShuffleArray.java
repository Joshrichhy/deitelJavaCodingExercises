package ArrayPractices;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int [] nums = {45,2,5,6,3,1,5,8};
        int n = nums.length/2;
        int [] newArray = new int[n];
        int [] firstArray = new int [n];
        int count = 0;
        for (int i = 0; i < n; i++) {firstArray[i] = nums[i];}
        for (int i = n; i < nums.length; i++) {newArray[count] = nums[i];count++;}
        int counter = 1;
        int newCounter = 0;
        for (int i = 0; i < n; i++) {
            nums[newCounter] = firstArray[i];
            nums[counter] = newArray[i];
            newCounter +=2;
            counter += 2;
        }

        System.out.println(Arrays.toString(nums));


    }
}
