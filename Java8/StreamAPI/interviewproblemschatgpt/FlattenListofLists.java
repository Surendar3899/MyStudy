package Java8.StreamAPI.interviewproblemschatgpt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenListofLists {
    public static void main(String[] args) {
        List<List<String>> nested = Arrays.asList(Arrays.asList("a", "b"),Arrays.asList("c", "d"));
        System.out.println(nested);

        List<String> flat = nested.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(flat);
    }

}
