package ChatGptquestions.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * Given a list of integers,
return a new list containing only the even numbers,
each multiplied by 2,
and sorted in descending order.

Example:

Input:

List<Integer> nums = Arrays.asList(5, 2, 8, 3, 10, 7);


Output:

[20, 16, 4]
 */

public class First_01 {

    public static void main(String[] args) {
        /*List<Integer> nums = Arrays.asList(5, 2, 8, 3, 10, 7);
        List<Integer> result = processNumbers(nums);
        System.out.println("result is "+result);

        List<String> names = Arrays.asList("sam", "John", "Steve", "sara", "mike", "Sophia");

        List<String> result1 = names.stream().filter(n->n.toLowerCase().startsWith("s")).map(n->n.toUpperCase()).sorted().collect(Collectors.toList());
        System.out.println(result1);

        List<String> fruits = Arrays.asList("Apple", "Banana", "apple", "Orange", "banana", "APPLE");
        Map<String,Long> result2 = fruits.stream().map(n->n.toLowerCase()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(result2);

        Map<String, Integer> employees = new HashMap<>();
        employees.put("John", 50000);
        employees.put("John", 80000);
        employees.put("Bob", 45000);
        employees.put("Diana", 80000);

        Map<String,Integer> result3 = employees.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
                                                         collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(a,b)->b,LinkedHashMap::new));
        System.out.println(result3);


        List<String> tasks = Arrays.asList("Alice", "Bob", "Alice", "John", "Bob", "Alice", "Diana", "Bob");
        Map<String,Long> result4 = tasks.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                                                .entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                                                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(a,b)->a,LinkedHashMap::new));
        System.out.println(result4);

        List<Employee> employees1 = Arrays.asList(
            new Employee("Alice", "HR", 40000),
            new Employee("Bob", "IT", 60000),
            new Employee("John", "IT", 80000),
            new Employee("Diana", "HR", 50000),
            new Employee("Mike", "Finance", 70000)
        );

        Map<String,Double> result5 = employees1.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingInt(Employee::getSalary)));
        System.out.println(result5);



        List<Employee> employees2 = Arrays.asList(
            new Employee("Alice", "HR", 40000),
            new Employee("Bob", "IT", 60000),
            new Employee("John", "IT", 80000),
            new Employee("Diana", "HR", 50000),
            new Employee("Mike", "Finance", 70000)
        );
        Map<String,Employee> result6 = employees2.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors
                                        .collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getSalary)),Optional::get)));
        System.out.println(result6);  
        

        //7
        List<Employee> employees3 = Arrays.asList(
            new Employee("Alice", "HR", 40000),
            new Employee("Bob", "IT", 60000),
            new Employee("John", "IT", 80000),
            new Employee("Diana", "HR", 50000),
            new Employee("Mike", "Finance", 70000)
        );

        Map<String,Integer> result7 = employees3.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.summingInt(Employee::getSalary)))
                                                          .entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(a,b)->a,LinkedHashMap::new));
        System.out.println(result7);


        //8
        List<Student> students = Arrays.asList(
            new Student("Alice", Arrays.asList("Math", "Physics")),
            new Student("Bob", Arrays.asList("Biology", "Math", "Chemistry")),
            new Student("John", Arrays.asList("History", "Physics", "Biology"))
        );

        List<String> allsubjects = students.stream().flatMap(n->n.getSubjects().stream()).distinct().sorted().collect(Collectors.toList());
        System.out.println(allsubjects);


        //9
        // List<Classroom> classes = Arrays.asList(
        //     new Classroom("Math", Arrays.asList("Alice","Bob","Alice")),
        //     new Classroom("Physics", Arrays.asList("Bob","Charlie")),
        //     new Classroom("Chemistry", Arrays.asList("Alice","Charlie","Charlie"))
        // );

        // Map<String,Long> result8 = classes.stream(Classroom::getStudentNames.stream).flatMap().collect(Collectors.groupingBy(Collectors.counting()));
        // System.out.println("result8 is "+result8);


        //10
        List<Integer> nums1 = Arrays.asList(5, 12, 7, 3, 18, 20, 1);
        List<Integer> result9 = nums1.stream().filter(n->n>10).collect(Collectors.toList());
        System.out.println("result9 is "+result9);


        List<String> words = Arrays.asList("apple", "mango", "banana", "kiwi", "orange", "avocado");
        List<String> result10 = words.stream().filter(n->n.startsWith("a")).map(n->n.toUpperCase()).sorted().collect(Collectors.toList());
        System.out.println("result10 "+result10);


        List<Integer> numbers = Arrays.asList(3, 5, 7, 2, 8, 10);
        int result11 = numbers.stream().reduce((1), (a,b)->(a*b));
        System.out.println("result11 is "+result11);


        List<String> names1 = Arrays.asList("apple", "banana", "apricot", "blueberry","apple", "avocado", "blackberry");
        Map<Character,List<String>> result12 = names1.stream().collect(Collectors.groupingBy(n->n.charAt(0)));
        System.out.println("result12 is "+result12);

        List<String> names2 = Arrays.asList("sam", "sara", "john", "jenny", "james", "steve", "maya");
        Map<Integer,List<String>> result13 = names2.stream().collect(Collectors.groupingBy(n->n.length()));
        System.out.println("result13 "+result13);


        List<String> cities = Arrays.asList("London", "Paris", "Delhi", "Dubai", "Lisbon", "Lagos", "Doha");
        Map<Character,Long> result14 = cities.stream().collect(Collectors.groupingBy(n->n.charAt(0),Collectors.counting()));
        System.out.println("result14 is "+result14);

        List<String> words1 = Arrays.asList("bat", "ball", "cat", "car", "dog", "doll", "apple");
        Map<Character,List<String>> result15 = words1.stream().filter(n->n.length()>3).collect(Collectors.groupingBy(n->n.charAt(0)));
        System.out.println("result15 is "+result15);


        List<String> countries = Arrays.asList("India", "China", "Chile", "Canada", "France", "Finland", "Italy");
        Map<Character,List<String>> result16 = countries.stream().filter(n->n.toLowerCase().startsWith("c")||n.toLowerCase().startsWith("f")).
                                          collect(Collectors.groupingBy(n->n.charAt(1)));
        System.out.println("result16 is "+result16);
        
        
        List<String> vehicles = Arrays.asList("car", "cycle", "truck", "train", "tram", "cab", "cargo", "taxi");
        Map<Character,List<String>> result17 = vehicles.stream().filter(n->n.contains("a")).collect(Collectors.groupingBy(n->n.charAt(n.length()-1)));
        System.out.println("resukt17 "+result17);


        List<String> items = Arrays.asList("apple", "ant", "banana", "ball", "cat", "car", "dog", "doll");
        Map<Integer,Long> result18 = items.stream().filter(n->n.length()>=4).collect(Collectors.groupingBy(n->n.length(),Collectors.counting()));
        System.out.println("result18 "+result18);*/

        List<String> words2 = Arrays.asList("java", "spring", "boot", "api", "rest", "soap", "micro");

        Map<Boolean,List<String>> result19 = words2.stream().filter(n->n.length()>=4).collect(Collectors.groupingBy(n->n.contains("o")));
        Map<Boolean,List<String>> result20 = words2.stream().filter(n->n.length()>=4).collect(Collectors.partitioningBy(n->n.contains("o")));
        System.out.println("result19 "+result19);
        System.out.println("result20 "+result20);









        
        
    }


    public static List<Integer> processNumbers(List<Integer> nums) {
        // your code using streams

        List<Integer> li = nums.stream().filter(n->n%2==0).map(n->n*2).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        return li;
    }

}

class Employee{
    String name;
    String department;
    int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String name,String department,int salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String toString(){
        return ("name="+this.name+", "+"department="+this.department+", "+"salary="+this.salary);
    }
    

}

class Student{
    String name;
    List<String> subjects;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public Student(String name,List<String> subjects){
      this.name = name;
      this.subjects = subjects;
    }
}

class Classroom{
    String subject;
    List<String> studentNames;

    public Classroom(String subject,List<String> studentnames){
        this.subject = subject;
        this.studentNames = studentnames;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public List<String> getStudentNames() {
        return studentNames;
    }
    public void setStudentNames(List<String> studentNames) {
        this.studentNames = studentNames;
    }
}

