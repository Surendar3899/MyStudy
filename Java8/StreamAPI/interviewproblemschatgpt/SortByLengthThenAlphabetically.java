package Java8.StreamAPI.interviewproblemschatgpt;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

public class SortByLengthThenAlphabetically {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("surendar","susi","dinesh","aravind","bala");
        List<String> sorted = list.stream().sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).collect(Collectors.toList());
        System.out.println("sorted is "+sorted);
    }

}
