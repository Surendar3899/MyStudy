package Java8.StreamAPI.interviewproblemschatgpt;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class FindDuplicatesInList {
   public static void main(String[] args) {
    List<String> list = Arrays.asList("surendar","susi","aravind","susi","aa","susi","aa");
    Set<String> slist = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(e->e.getValue()>1)
                           .map(Map.Entry::getKey).collect(Collectors.toSet());
    System.out.println(slist);
    
    Map<String,Long> smap = list.stream().collect(Collectors.groupingBy(c -> c,LinkedHashMap::new,Collectors.counting()));

    Set<String> lset = smap.entrySet().stream().filter(n->n.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toSet());
    System.out.println("smap is "+smap);
    System.out.println("lset is "+lset);

    
   }
}
