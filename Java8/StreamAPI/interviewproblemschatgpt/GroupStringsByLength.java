package Java8.StreamAPI.interviewproblemschatgpt;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringsByLength {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("aa","bbb","ccc","bbb","cc","ccc","eeeee");
        Map<Integer, List<String>> grouped = list.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(grouped);
    }

}
