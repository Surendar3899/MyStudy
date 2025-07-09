package Java8.StreamAPI.interviewproblemschatgpt;

import java.util.Arrays;
import java.util.List;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
        int result = nums.stream().filter(n->(n%2==0)).mapToInt(Integer::new).sum();
        System.out.println(result);
    }

}
