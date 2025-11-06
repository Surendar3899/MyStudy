package Java8.StreamAPI;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Hello {
    public static void main(String[] args) {
        System.out.println("hello");
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        List<Integer> filterList = list.stream().filter(n -> n%2==0).collect(Collectors.toList());
        System.out.println(filterList);
    }

}
