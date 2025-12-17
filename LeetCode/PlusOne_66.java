package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlusOne_66 {
    public static void main(String[] args) {
        int[] digits = {1,9,8,9};
        int[] result = plusOne(digits);
        System.out.println(Arrays.toString(result));

    }

    public static int[] plusOne(int[] digits) {


        List<Integer> li = new ArrayList<>();

        int carry = 1;

        for(int i=digits.length-1;i>=0;i--){
            int sum = digits[i] + carry;
            li.add(sum%10);
            carry = sum/10;
        }

        if(carry > 0){
            li.add(carry);
        }
        Collections.reverse(li);
        return li.stream().mapToInt(Integer::new).toArray();
    }


    // this is from leetcode best time complexity
    public static int[] plusOne2(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            // if current digit < 9, just increment and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // if digit == 9, set it to 0 and continue
            digits[i] = 0;
        }

        // if all digits were 9 (e.g., [9,9,9]), we need a new array
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

}
