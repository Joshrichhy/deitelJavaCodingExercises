import java.util.*;

public class HCF {
    public static void main(String[] args) {
        System.out.println(hcfFinder(90, 6, 4, 270));
    }
    public static List<Integer> hcfFinder(int ... number){
        List<List<Integer>> numbers = new ArrayList<>();
        List<Integer> n = new ArrayList<>();
        for (int nums: number) {
            List<Integer> num = new ArrayList<>();
            for (int i = 2; i <= nums; i++) {
                if (nums % i == 0) {
                    num.add(i);
                    nums /= i;
                    i = 1;}}
            numbers.add(num);
        }

        int min = Integer.MAX_VALUE;
        int index = 2;
        for (int i = 0; i < numbers.size(); i++) {
            if(min > numbers.get(i).size()){
                min = numbers.get(i).size();
                index = i;
            }
        }

        for (List<Integer> integers : numbers) {
            numbers.get(index).retainAll(integers);}

        return numbers.get(index);

    }
}
