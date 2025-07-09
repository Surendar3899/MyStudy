package Java8.StreamAPI.interviewproblemschatgpt;

import java.util.*;

public class SecondHighestSalary {
    // TCS Question
    public static void main(String[] args) {
        System.out.println("aaa");
        List<Integer> list = Arrays.asList(10000,20000,15000,22000,11000,9000);
        int result = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
        System.out.println(result);

    }

}
