package LeetCode;

import java.util.Arrays;

public class DivideArrayIntoEqualPairs {
    public static void main(String[] args) {
        int [] nums = {1,3,3,3};
        Arrays.sort(nums);
        int [] num = new int[2];
        int start = 0;
        for (int i = 0; i < nums.length-2; i++) {

            nums[start++] = nums[i];
            if(nums[0] != nums[1]){
                System.out.println("=)");
                return false;
            break;}
            else {
               start = 0;
            }


        }
        return true;
    }
}
