package Java8.StreamAPI.codeLogicTamil;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TerminalOperation {
   public static void main(String[] args) {
    //1 
    //forEach() - Performs an action on each element
    List<String> names = Arrays.asList("kishore","kalai","Madhan");
    names.stream().forEach(System.out::println);


    // 2
    // collect() - collects elements into a collection like a list or set
    List<Integer> numbers = Arrays.asList(1,4,5,7,5);
    List<Integer> collectedNumbers = numbers.stream().collect(Collectors.toList());
    System.out.println(collectedNumbers);
    Set<Integer> collectedSet = numbers.stream().collect(Collectors.toSet());
    System.out.println(collectedSet);


    // 3
    // count() - Returns the number of elements in the stream
    long count = numbers.stream().count();
    System.out.println(count);

    // 4
    // reduce() - Combine elements into a single value
    int sum = numbers.stream().reduce(0,Integer::sum);
    System.out.println("sum is "+sum);

   }
}
