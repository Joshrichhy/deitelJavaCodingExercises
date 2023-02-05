package Pauline;

import java.util.Arrays;
import java.util.Scanner;

public class TheSpencer {
    public static void main(String[] args) {
        int [] number = new int[10];
        int [] numberTwo = {1,42,33,54,758,96,67,48,100};
        number[0] = 1;
        number[1] = 41;
        number[3] = 15;
        number[6] = 31;
        number[9] = 14;
        System.out.println(Arrays.toString(number));
        for (int index = 0; index < number.length; index++) {
            if( number[index]== 0){
                number[index] = 5;
                }else{
               System.out.println("No one gets the money");
            }
            System.out.println(Arrays.toString(number));
        }

DamianPuff puff = new DamianPuff();
        puff.setNumber(50);
        puff.setNumberTwo(50);
        System.out.println(puff.getSum());


    }
}
