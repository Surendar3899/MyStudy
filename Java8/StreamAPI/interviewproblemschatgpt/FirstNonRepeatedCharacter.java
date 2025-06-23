package Java8.StreamAPI.interviewproblemschatgpt;

import java.util.LinkedHashMap;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {
        String input = "rogrammingO";
        IntStream instr = input.chars();
        Stream<Character> stChar = instr.mapToObj(c->(char)c);
        Map<Character,Long> mapstr = stChar.collect(Collectors.groupingBy(c -> c,LinkedHashMap::new,Collectors.counting()));

        //stChar.forEach(System.out::println);
        System.out.println(mapstr);

        //mapstr.entrySet().stream().forEach(n->System.out.println(n.getValue()));
        Stream<Character> c = mapstr.entrySet().stream().filter(n -> n.getValue() == 1).map(Map.Entry::getKey);
        char result = c.findFirst().orElse('-');
        char result1 = c.findFirst().orElse('-');
        System.out.println("result is "+result);
        System.out.println("result1 is "+result1);
    }

}
