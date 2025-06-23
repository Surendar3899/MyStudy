package Java8.StreamAPI.codeLogicTamil;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperation {
   public static void main(String[] args) {
    //1
    //filter() - filters elements based on the conditions
    List<String> names = Arrays.asList("edam","Eve","Romeo");
    List<String> filterNames =  names.stream().filter(name -> name.toUpperCase().startsWith("E")).collect(Collectors.toList());
    System.out.println(filterNames);

    

    //2
    //map() - Transform each elements in the stream
    List<String> listNames = Arrays.asList("edam","Eve","Romeo");
    Stream<String> streamnames = listNames.stream().map(String::toUpperCase);
    //streamnames.forEach(System.out::println);
    List<String> li =  streamnames.collect(Collectors.toList());
    System.out.println("li is "+li);


    //3
    //sorted() - sorts element in natural order or using comparator
    List<Integer> numbers = Arrays.asList(2,5,6,88,5);
    List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
    System.out.println(sortedNumbers);

    List<Integer> sortedDescending = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    System.out.println(sortedDescending);


    //4
    // distinct() - to remove duplicate elements in the stream
    List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());
    System.out.println(distinctNumbers);



   }
}
