package Java8.StreamAPI.interviewproblemschatgpt;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupEmployeesByDepartment {
    public static void main(String[] args) {
        List<Employee1> employees = Arrays.asList(
            new Employee1("Alice", "HR", 40000),
            new Employee1("Bob", "Engineering", 60000),
            new Employee1("Charlie", "HR", 42000),
            new Employee1("David", "Engineering", 65000),
            new Employee1("Eve", "Finance", 55000)
        );


        // Map<String, Map<String, List<Employee>>> ma = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.groupingBy(Employee::getName)));
        // System.out.println(ma);

        Map<String, List<Employee1>> grouped = employees.stream()
            .collect(Collectors.groupingBy(Employee1::getDepartment));

            System.out.println("gr");
            System.out.println(grouped);

    }

}


class Employee1 {
    private String name;
    private String department;
    private int salary;

    public Employee1(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() { return name; }
    public String getDepartment() { return department; }
    public int getSalary() { return salary; }

    @Override
    public String toString() {
        return name + " (" + salary + ")";
    }
}
