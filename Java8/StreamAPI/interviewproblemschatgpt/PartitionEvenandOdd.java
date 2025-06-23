package Java8.StreamAPI.interviewproblemschatgpt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class PartitionEvenandOdd {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(87,1,2,3,4,5,76,89,100,200);
        Map<Boolean,List<Integer>> map = list.stream().collect(Collectors.partitioningBy(n->n%2==0));
        System.out.println(map);
        
    }

}
