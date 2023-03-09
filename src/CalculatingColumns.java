import java.util.Arrays;

public class CalculatingColumns {
    public static void main(String[] args) {
        int [][] numbers = new int [4][3];
        int [] sum = new int[3];

        numbers[0][0] = 6;
        numbers[0][1] = 56;
        numbers[0][2] = 64;
        numbers[1][0] = 78;
        numbers[1][1] = 45;
        numbers[1][2] = 32;
        numbers[2][0] = 6;
        numbers[2][1] = 96;
        numbers[2][2] = 44;
        numbers[3][0] = 98;
        numbers[3][1] = 50;
        numbers[3][2] = 23;

        for (int [] row: numbers) {System.out.println(Arrays.toString(row));}

        for (int index = 0; index < numbers[index].length; index++) {
            for (int secondIndex = 0; secondIndex < numbers.length; secondIndex++) {
                sum[index]  += numbers[secondIndex][index];


            }

        }
        System.out.println(Arrays.toString(sum));

        }





}
