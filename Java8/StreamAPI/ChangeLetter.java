package Java8.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ChangeLetter {
    public static void main(String[] args) {
        //List<String> words = Arrays.asList("cat", "dog", "elephant", "rat", "rhinoceros");
        //System.out.println("Original list: " + words);

        String[] words = {"cat", "dog", "elephant", "rat", "rhinoceros"};
        System.out.println("Arrays "+Arrays.toString(words));


        words = Arrays.stream(words)
                                         .map(n -> n.length() > 4 ? "aaa" : n)
                                         //.toArray(String[]::new);
                                         .toArray(String[]::new);

        //words = new java.util.ArrayList<>(modifiedWords);

        System.out.println("Modified list: " + Arrays.toString(words));
    }
}
