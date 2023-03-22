package LeetCode;

import java.util.Arrays;

public class firstOccurenceInString {
    public static void main(String[] args) {
      int []  nums = {10, 12, 3, 4};
      int[] newNum = new int [nums.length];
        for (int i = 0; i < nums.length; i++) {
            int nu =  nums.length - (i + 1) ;
            newNum[i] = nums[nu];}
        System.out.println(Arrays.toString(newNum));





//        System.out.println(strStr("sadbutsad", "d"));
//       threeSumClosest(nums, 1);

    }
        public static int strStr(String haystack, String needle) {
            if(haystack.contains(needle)) return haystack.indexOf(needle);
            return -1;}

    public static int threeSumClosest(int[] nums, int target) {
        int closestSum = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                }
                if (sum < target) {
                    right--;
                } else if (sum > target) {
                    left++;
                } else {
                    return target;
                }
            }
        }
        return closestSum;}



    
}
