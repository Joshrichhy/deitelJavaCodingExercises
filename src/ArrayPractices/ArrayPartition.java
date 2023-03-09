package ArrayPractices;

import java.util.Arrays;

public class ArrayPartition {
    public static void main(String[] args) {
        int [] numbers = {3,1,6,7,4,6};
        int count = 1;
        int sum = 0;
        for (int i = 0; i < numbers.length; i+=2) {if(numbers[i] < numbers[count]){sum += numbers[i];}
            else if(numbers[count] < numbers[i]){sum+= numbers[count];}
            count+=2;
        }
        System.out.println(sum);

    }
}
