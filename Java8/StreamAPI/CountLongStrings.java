package Java8.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Question 2: Count the Number of Strings Longer Than a Given Length
public class CountLongStrings {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat", "dog", "elephant", "rat", "rhinoceros", "bird");
        words.stream().forEach(str->System.out.println(str));
        List<String> result = words.stream().filter(n -> n.length()>3).map(n->"aaa").collect(Collectors.toList());
        words.stream().forEach(str->System.out.println(str));

    }

}
