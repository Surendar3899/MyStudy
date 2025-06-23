package Java8.StreamAPI.interviewproblemschatgpt;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.*;

public class CountWordOccurances {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("aa","bb","cc","dd","aa","cc");
        Map<String,Long> mlist= list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        //Map<String,Long> mlist= list.stream().collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()));
        System.out.println(mlist);

        
    }

}
