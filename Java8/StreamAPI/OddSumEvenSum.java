package Java8.StreamAPI;

import java.util.Arrays;
import java.util.stream.Stream;

public class OddSumEvenSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        int oddsum = Arrays.stream(arr).filter(n -> n%2 != 0).sum();

        System.out.println("oddsum is "+oddsum);
    }
}
