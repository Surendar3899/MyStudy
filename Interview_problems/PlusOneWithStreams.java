package Interview_problems;

//Capgemini question

import java.util.*;
import java.util.stream.*;

public class PlusOneWithStreams {
    public static int[] plusOne(int[] digits) {
        List<Integer> result = new ArrayList<>();
        int carry = 1;
        int sum = 0;

        // Process digits from end to start
        for (int i = digits.length - 1; i >= 0; i--) {
            sum = digits[i] + carry;
            result.add(sum % 10);
            carry = sum / 10;
        }

        if (carry > 0) {
            result.add(carry);
        }

        System.out.println(carry+"   "+sum);

        // Reverse and convert to int array using streams
        Collections.reverse(result);
        System.out.println(result);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 0}; // Equivalent to 123
        int[] result = plusOne(digits);

        System.out.print("Result: ");
        Arrays.stream(result).forEach(d -> System.out.print(d));
        // Output: 124
    }
}
