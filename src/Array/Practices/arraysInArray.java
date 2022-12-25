package Array.Practices;

import java.util.Arrays;

public class arraysInArray {
    public static void main(String[] args) {
        int [][] numbers = new int [4][]; // the first square brace represent the length of the outter array which is 3
         numbers [0] = new int [4];
         numbers [1] = new int [8];
         numbers [2] = new int [3];

         numbers [0][1] = 7;
        System.out.println(Arrays.toString(numbers[0]));

        System.out.println(Arrays.deepToString(numbers));

        int [][] num = {{1,2,3,4}, {1,2,3},{1,2}};

        for (int [] row: num) {
            System.out.println(Arrays.toString(row));}

        int [][] number = new int [3][3];

        number [0][0] = 1;
        number [0][1] = 2;
        number [0][2] = 3;
        number [1][0] = 4;
        number [1][1] = 5;
        number [1][2] = 6;
        number [2][0] = 7;
        number [2][1] = 8;
        number [2][2] = 9;
        for (int [] rows : number) {
            System.out.println(Arrays.toString(rows));

        }


    }
}
