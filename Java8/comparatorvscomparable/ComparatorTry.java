package Java8.comparatorvscomparable;

import java.util.Arrays;
import java.util.List;

public class ComparatorTry {
    public static void main(String[] args) {
        List<Employee2> employees = Arrays.asList(
            new Employee2("Alice", "HR", 40000),
            new Employee2("Bob", "Engineering", 60000),
            new Employee2("Charlie", "HR", 42000),
            new Employee2("David", "Engineering", 65000),
            new Employee2("Eve", "Finance", 55000),
            new Employee2("Billa", "Gangster", 65000)
        );
    }

}
