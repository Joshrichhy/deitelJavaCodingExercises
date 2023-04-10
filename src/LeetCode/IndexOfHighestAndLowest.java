package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class IndexOfHighestAndLowest {
    public static void main(String[] args) {
        int[] numbers = {5, 9, 12, -12, -98, 234, 54};
        System.out.println(Arrays.toString(lowestAndHighest(numbers)));
    }

        private static int[] lowestAndHighest(int [] nums){
            List<Integer> summedNumbers = new ArrayList<>();
            int[] indexOfHighestAndLowestSum = new int[2];
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;


            for (int i = 0; i < nums.length; i++) {
                int sum = 0;
                for (int j = 0; j < nums.length; j++) {
                    sum += nums[j];}
                sum -= nums[i];
                summedNumbers.add(sum);}

            for (int i = 0; i < summedNumbers.size(); i++) {
                int equal = summedNumbers.get(i);
                if(max < summedNumbers.get(i) ){
                    max = summedNumbers.get(i);
                    indexOfHighestAndLowestSum[0] = i;}


                else if(min > summedNumbers.get(i)){
                    min = summedNumbers.get(i);
                    indexOfHighestAndLowestSum[1] = i;}
            else if(summedNumbers.equals(summedNumbers.get(i)))
            break;}
                      return indexOfHighestAndLowestSum;
        }
   }
