package Java8.StreamAPI.interviewproblemschatgpt;

import java.util.HashMap;
import java.util.*;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
// TCS Question
public class GroupEmployess {
    public static void main(String[] args) {
        Map<String,String> employees = new HashMap<>();
        employees.put("surendar","dev");
        employees.put("prem","dev");
        employees.put("bala","dev");
        employees.put("praveen","seniordev");
        employees.put("prakasam","tl");


        Map<String,List<String>> strEmployee = employees.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue,Collectors.mapping(Map.Entry::getKey,Collectors.toList())));
        System.out.println(strEmployee);
    }
    
    

}
