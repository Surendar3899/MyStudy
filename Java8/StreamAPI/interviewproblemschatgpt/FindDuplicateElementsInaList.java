package Java8.StreamAPI.interviewproblemschatgpt;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateElementsInaList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "cherry", "banana","apple");
        Map<String,Long> ma = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(ma);

        List<String> res = ma.entrySet().stream().filter(e -> e.getValue()>1).map(Map.Entry::getKey).filter(n->n.startsWith("a")).collect(Collectors.toList());
        System.out.println(res);
    }

}
