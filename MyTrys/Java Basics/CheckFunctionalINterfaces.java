import java.util.function.Function;
import java.util.function.Predicate;

public class CheckFunctionalINterfaces {

    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x%2 == 0;
        System.out.println(predicate.test(4));

        Function<String,Integer> function = x -> x.length();
        System.out.println(function.apply("surendar"));

        
    }

}
