package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class DivideArrayIntoEqualPairs {
    public static void main(String[] args) {
        int [] nums = {1,3,4,3};
        System.out.println(divideArray(nums));

    }

    public static boolean divideArray(int[] nums) {
        ArrayList <Integer> num = new ArrayList<>();
        int min =  nums.length/2;
        Arrays.sort(nums);
        int start = 0;
        int start2 = 1;
        for (int i = 0; i < nums.length/2; i++) {
            if(nums[start] == nums[start2] ){
                num.add(nums[start]);
                start+=2;
                start2+=2;}
        }

        return num.size() == min;
    }
}
