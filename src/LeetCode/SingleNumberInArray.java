package LeetCode;

public class SingleNumberInArray {
    public static void main(String[] args) {
      int [] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));

    }
    public static int singleNumber(int[] nums) {
        int appearedOnce = 0;
        for (int num : nums) {
            int count = 0;
            for (int i : nums) {
                if (num == i) {count++; }}
            if (count == 1) {appearedOnce = num;}
        }
        return appearedOnce;
}

}
