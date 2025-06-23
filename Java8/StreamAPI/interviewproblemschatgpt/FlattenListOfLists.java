package Java8.StreamAPI.interviewproblemschatgpt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenListOfLists {
    public static void main(String[] args) {
        List<List<String>> nestedList = Arrays.asList(Arrays.asList("ba", "cd"),Arrays.asList("ef", "zzz"));
        List<String> flat = nestedList.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(flat);
    }

}
