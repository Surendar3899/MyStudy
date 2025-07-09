package Java8.StreamAPI.interviewproblemschatgpt;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String input = "swiss";
        Optional<Character> cr = input.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet().stream()
                        .filter(n->n.getValue()==1).map(Map.Entry::getKey).findFirst();

        System.out.println(cr);                
    }

}
