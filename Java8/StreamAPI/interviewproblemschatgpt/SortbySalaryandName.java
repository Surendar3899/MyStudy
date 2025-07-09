package Java8.StreamAPI.interviewproblemschatgpt;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortbySalaryandName {
    public static void main(String[] args) {
        List<Employee1> employees = Arrays.asList(
            new Employee1("Alice", "HR", 40000),
            new Employee1("Bob", "Engineering", 60000),
            new Employee1("Charlie", "HR", 42000),
            new Employee1("David", "Engineering", 65000),
            new Employee1("Eve", "Finance", 55000),
            new Employee1("Billa", "Gangster", 65000)
        );


        List<Employee1> sort = employees.stream().sorted(Comparator.comparing(Employee1::getSalary).reversed().thenComparing(Employee1::getName)).collect(Collectors.toList());

        System.out.println(sort);


        List<Integer> in = Arrays.asList(4,1,2,3,5);
        List<Integer> sortInt = in.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortInt);


    }

}
