package Java8.StreamAPI;

import java.util.Arrays;

public class SumOfElements {

    public static void main(String[] args) {
        //int[] arr = {1,2,3,4};

        String[] arr = {"1","2","3"};

        int result = Arrays.stream(arr).mapToInt(Integer::new).sum();
        System.out.println(result);
    }

}
