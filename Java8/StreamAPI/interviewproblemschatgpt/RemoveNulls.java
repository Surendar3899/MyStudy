package Java8.StreamAPI.interviewproblemschatgpt;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNulls {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("aa","bbb","ccc","bbb"," ","cc","ccc",null,"eeeee");
        System.out.println(list);

        List<String> cleanedList = list.stream().filter(Objects::nonNull).collect(Collectors.toList());
        System.out.println(cleanedList);
    }

}
