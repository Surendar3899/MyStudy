package Java8.StreamAPI.interviewproblemschatgpt;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionsBySalary {
    public static void main(String[] args) {
        List<Employee1> employees = Arrays.asList(
            new Employee1("Alice", "HR", 40000),
            new Employee1("Bob", "Engineering", 60000),
            new Employee1("Charlie", "HR", 42000),
            new Employee1("David", "Engineering", 65000),
            new Employee1("Eve", "Finance", 55000),
            new Employee1("Billa", "Gangster", 65000)
        );

        Map<Boolean,List<Employee1>> ma = employees.stream().collect(Collectors.partitioningBy(n->n.getSalary()>50000));

        List<String> li = ma.entrySet().stream().filter(n->n.getKey()==true).flatMap(e -> e.getValue().stream()).map(Employee1::getName).collect(Collectors.toList());


        System.out.println(ma);
        System.out.println(li);


    }

}
