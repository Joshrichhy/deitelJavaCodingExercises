package Array.Practices;

import java.util.Arrays;

public class RemigArray {
    public static void main(String[] args) {
        int [] myNumber = new int[5];

        for(int i = 0; i < myNumber.length; i+= 1){

            myNumber[i] = i + 1;
            System.out.println(myNumber[i]);
        }


    }
}
