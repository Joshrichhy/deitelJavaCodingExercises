package LeetCode;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] num1 = {1, 6, 3, 1, 4, 0, 0};
        int[] num2 = {1, 4, 3};
        int [] srt = new int[8];

        System.out.println(Arrays.toString(merge(num1, num1.length, num2, num2.length)));









//        for (int i = 0; i < num1.length; i++) {
//            if (srt.get(srt.size() - 1) >= num1[i] && srt.size() <= 2) {
//                srt.add(srt.size() - 1, num1[i]);
//            } else if (srt.get(srt.size() - start) >= num1[i]) {
//                srt.add(srt.size() - start, num1[i]);
//                start++;
//            }
//
//
//            System.out.println(start);
//
//        }
        System.out.println(Arrays.toString(srt));


    }
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        return nums1;
    }


}
