package Java8.StreamAPI.interviewproblemschatgpt;

import java.util.*;

public class FindMaxElement {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("bala","aravind","dinesh","surendar","susi");
        int maxLength = list.stream().mapToInt(String::length).max().orElseThrow(null);
        System.out.println("maxlength is "+maxLength);

        List<Integer> list1 = Arrays.asList(1,2,56,3,4,5);
        int max1 = list1.stream().max(Integer::compareTo).orElseThrow(null);
        System.out.println("max1 is "+max1);

        
        
        
        
    }

}
