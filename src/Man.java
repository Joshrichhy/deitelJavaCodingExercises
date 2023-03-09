import java.util.Arrays;

public class Man extends Human {
    public static void main(String[] args) {
    int [] numbers = {5,6,4,3,2,3,4,55,6,7};
    int target = 5;
        for (int index = 0; index < numbers.length; index++) {
            for (int i = index+1
                 ; i < numbers.length; i++) {
                if(numbers[index] + numbers[i] == target && index != i){
                    System.out.println(index + " " + i);
                }
            }


        }
        System.out.println(Arrays.toString(numbers));
    }
}
