package LeetCode.arraystring;

public class MajorityElement_169 {
    public static void main(String[] args) {
        int[] nums = {1,2,4,3,3,5,4,3,2,3,3,3,3,3,3};
        int result = majorityElement(nums);
        System.out.println("result is "+result);

    }
    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            System.out.println("count is "+count);
            if (count == 0) {
                candidate = num;
            }

            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}
