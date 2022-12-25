package Array.Practices;

import java.util.Arrays;
import java.util.Scanner;

public class SevenBinaryDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Binary number");
        String binary = scanner.nextLine();

        int[] binaryArray = new int[8];

        int index;
        for (index = 0; index < binaryArray.length; index++) {
            binaryArray[index] = Integer.parseInt(String.valueOf(binary.charAt(index)));
        }
        String[][] arrayInBinaryArray = new String[8][5];


        String[] a = new String[5];
        String[] b = new String[5];
        for (int i = 0; i < arrayInBinaryArray.length; i++) {
            if (i == 0){
                for (int j = 0; j < a.length; j++) {
                    a[j] = "#";

                    arrayInBinaryArray[j] = a;
                }
                }


                }


//            for (int j = 0; j < b.length; j++) {
//                    if (j == 0 || j == 4)
//                    {a[j] = "#";}
//                    else {b[j] = " ";}
//                    arrayInBinaryArray[j] = b;
//                    }
//









        System.out.println(Arrays.deepToString(arrayInBinaryArray));

    }
}
