package Java8.StreamAPI;

import java.util.Arrays;
import java.util.List;

//Question 1: Find the Sum of Squares of All Numbers Divisible by 3
public class SumOfSquaresDivisibleByThree {
   public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 3, 6, 7, 9, 12, 15);

        int sumOfSquares = numbers.stream()
                                 .filter(n -> n % 3 == 0)
                                 .mapToInt(m -> m * m)
                                 .sum();

        System.out.println("Sum of squares of numbers divisible by 3: " + sumOfSquares); // Output: 315
   }
}
