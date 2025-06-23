package Java8.StreamAPI.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindAllDuplicateElements {
   public static void main(String[] args) {
      List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        Set<String> duplicates = list.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet()
            .stream()
            .filter(e -> e.getValue() > 1)
            .map(Map.Entry::getKey)
            .collect(Collectors.toSet());

        System.out.println("duplicates is "+duplicates);    

   }
}
