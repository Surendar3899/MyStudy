import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StramPracticeJuly17 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream().filter(n -> n%2 == 0).forEach(System.out::print);

        List<Integer> numbers2 = Arrays.asList(2, 5, 7, 8, 10, 13);
        List<Integer> squareOfOnlyEvenNums = numbers2.stream().filter(n -> n%2 == 0).map(n->n*n).collect(Collectors.toList());
        System.out.println(squareOfOnlyEvenNums);

        List<String> names = Arrays.asList("Alice", "Bob", "Andrew", "David", "Alex", "John");
        List<String> startsWithA = names.stream().filter(n->n.startsWith("A")).map(n->n.toUpperCase()).collect(Collectors.toList());
        System.out.println("startsWithA  "+startsWithA);

        List<Integer> numbers3 = Arrays.asList(1, 2, 3, 2, 5, 4, 5, 6, 7, 6);
        Map<Integer,Long> duplicateElements = numbers3.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                                          .entrySet().stream().filter(n -> n.getValue() > 1).collect(Collectors.toMap(entry -> entry.getKey(),n->n.getValue()));
        System.out.println(duplicateElements);

        List<Integer> duplicateElements1 = numbers3.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                                          .entrySet().stream().filter(n -> n.getValue() > 1).map(n->n.getKey()).collect(Collectors.toList());
        System.out.println("duplicateElements1  "+duplicateElements1);


        List<Integer> numbers4 = Arrays.asList(10, 20, 30, 40, 50);
        int secondHighest = numbers4.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(-1);
        System.out.println("secondHighest is "+secondHighest);

        List<String> names2 = Arrays.asList("Alice","Bob","Andrew","David","Alex","John");
        Map<Character,List<String>> groupByFirstCharacter = names2.stream().collect(Collectors.groupingBy(n->n.charAt(0)));
        System.out.println(groupByFirstCharacter);


        List<String> words = Arrays.asList("apple","banana","apple","orange","banana","grape");
        Map<String,Long> findFreq = words.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(findFreq);

        List<Employee> employees = Arrays.asList(
    new Employee(1, "John", "IT", 50000),
    new Employee(2, "Alice", "HR", 40000),
    new Employee(3, "Bob", "IT", 70000),
    new Employee(4, "David", "Finance", 65000),
    new Employee(5, "Eva", "HR", 55000)
);

// Employee highestSalary = employees.stream()
//         .max(Comparator.comparingDouble(Employee::getSalary))
//         .orElse(null);

    Employee highestSalary = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).findFirst().orElse(null);
    System.out.println(highestSalary);

    Employee secondHighestSalary = employees.stream().distinct(Comparator.comparingDouble(Employee::getSalary))
            .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst().orElse(null);
    System.out.println(secondHighestSalary);        


    }

}

class Employee {

    private int id;
    private String name;
    private String department;
    private double salary;

    // Default Constructor
    public Employee() {
    }

    // Parameterized Constructor
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
