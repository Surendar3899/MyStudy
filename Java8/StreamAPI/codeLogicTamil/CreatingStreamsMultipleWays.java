package Java8.StreamAPI.codeLogicTamil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreatingStreamsMultipleWays {
     public static void main(String[] args) {
        //1
        // From Collections(List,Set,Map)
        // Collections in java have a stream() method
        List<String> names = Arrays.asList("Adam","Eve","Madhan");
        names.stream().forEach(System.out::println);

        //2
        // From Arrays
        // Arrays.stream() to create a stream from an array
        int[] numbers = {2,4,56,76,9};
        IntStream numberStream = Arrays.stream(numbers);
        numberStream.forEach(System.out::println);

        //3
        //From individual elements or an array
        // Using Stream.of()
        Stream<String> fruitStream = Stream.of("Apple","Banana","Blueberry");
        fruitStream.forEach(System.out::println);

        //4
        // Generating Streams
        // Stream.generate() - to create an infinite stream of values
        Stream<String> helloStream = Stream.generate(() -> "Hello").limit(3);
        helloStream.forEach(System.out::println);

        //5
        // Creating a Stream with Stream.iterate()
        // Example : generating numbers starting from 5

        Stream<Integer> numbStream = Stream.iterate(5,n->n+1).limit(5);
        numbStream.forEach(System.out::println);

     }
} 
