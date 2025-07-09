package Java8.StreamAPI.interviewproblemschatgpt;

import java.util.*;

public class LongestNameList {
    // TCS Question
    public static void main(String[] args) {
        List<String> list = Arrays.asList("susi","surendar","aravind");
        String result = list.stream().sorted(Comparator.comparing(String::length).reversed()).findFirst().orElse("");
        System.out.println(result);
        
    }

}
