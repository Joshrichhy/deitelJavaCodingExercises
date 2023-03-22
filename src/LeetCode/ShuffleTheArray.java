package LeetCode;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int [] number = {2, 5, 1, 3, 4, 7};
        int [] shuffle = new int[number.length];
         Arrays.sort(number);

         int start = 0;
         int stop = 1 ;
        System.out.println(Arrays.toString(number));
        int count = number.length/2;
        for (int i = 0; i < 3; i+=1) {
            shuffle[start] = number[i];
            shuffle[stop] = number[count++];
            System.out.println(number[i]);
            start+=2;
            stop+=2;
        }
        System.out.println(Arrays.toString(shuffle));
    }
}
