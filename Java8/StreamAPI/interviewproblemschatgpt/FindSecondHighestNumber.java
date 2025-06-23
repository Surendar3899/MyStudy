package Java8.StreamAPI.interviewproblemschatgpt;

import java.util.Arrays;
import java.util.*;

public class FindSecondHighestNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(87,1,2,3,4,5,76,89,100,200);
        int secondHighest = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
        System.out.println("second highest "+secondHighest);
        
    }

}
