package Java8.StreamAPI;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayStream {
    public static void main(String[] args) {
        int[] arr = {3,5,6,2,8,7};
        
        Arrays.stream(arr)
        .sorted()
        .forEach(n-> System.out.println(n));
    }
}
