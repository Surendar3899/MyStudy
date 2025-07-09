package Java8.StreamAPI.interviewproblemschatgpt;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindHighestPaidEmplyeeinEachDepartment {
    public static void main(String[] args) {
        List<Employee1> employees = Arrays.asList(
            new Employee1("Alice", "HR", 40000),
            new Employee1("Bob", "Engineering", 60000),
            new Employee1("Charlie", "HR", 42000),
            new Employee1("David", "Engineering", 65000),
            new Employee1("Eve", "Finance", 55000),
            new Employee1("Sure", "HR", 41000)
        );

        Map<String, Optional<Employee1>> highestPaid = employees.stream()
            .collect(Collectors.groupingBy(
                Employee1::getDepartment,
                Collectors.maxBy(Comparator.comparing(Employee1::getSalary))
            ));

        System.out.println(highestPaid);    


    }

}
