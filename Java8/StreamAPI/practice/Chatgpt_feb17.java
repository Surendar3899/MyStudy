package Java8.StreamAPI.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Chatgpt_feb17 {
    //https://chatgpt.com/share/69946afd-2320-8011-9093-55934a1f18ef
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3, 10, 7, 4, 9, 12, 5);
        List<Integer> evenNums = nums.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println("evenNums is "+evenNums);

        List<Integer> nums2 = Arrays.asList(2, 3, 4, 5);
        List<Integer> sqNums = nums2.stream().map(n->n*n).collect(Collectors.toList());
        System.out.println("sqNums "+sqNums);

        List<String> names = Arrays.asList("java", "stream", "api", "practice");
        List<String> upperNames = names.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
        System.out.println("upperNames "+upperNames);

        List<Integer> nums3 = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 1);
        List<Integer> removeDuplicates = nums3.stream().distinct().collect(Collectors.toList());
        System.out.println("removeDuplicates "+removeDuplicates);

        List<Integer> nums4 = Arrays.asList(5, 10, 15, 20);
        int sum = nums4.stream().collect(Collectors.summingInt(n->n));
        System.out.println("sum "+sum);

        List<Integer> nums5 = Arrays.asList(8, 3, 15, 6, 2);
        int maxNum = nums5.stream().mapToInt(n->n).max().orElse(-1);
        System.out.println("maxNum is "+maxNum);

        List<Integer> nums6 = Arrays.asList(8, 3, 15, 6, 2);
        int minNum = nums6.stream().mapToInt(Integer::intValue).min().orElse(-1);
        System.out.println("minNum "+minNum);

        List<String> words = Arrays.asList("cat", "lion", "dog", "tiger", "ox");
        long lengthgreaterthanthree = words.stream().filter(n->n.length() > 3).count();
        System.out.println("lengthgreaterthanthree is "+lengthgreaterthanthree);

        List<Integer> nums7 = Arrays.asList(9, 3, 7, 1, 5);
        List<Integer> ascOrder = nums7.stream().sorted().collect(Collectors.toList());
        System.out.println("ascOrder "+ascOrder);

        List<Integer> nums8 = Arrays.asList(9, 3, 7, 1, 5);
        List<Integer> descOrder = nums8.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("descOrder "+descOrder);

        List<Integer> nums9 = Arrays.asList(10, 20, 30, 40);
        double avg = nums9.stream().mapToInt(Integer::intValue).average().orElse(-1);
        System.out.println("avg "+avg);

        List<String> words1 = Arrays.asList("Java", "Stream", "API");
        String joinedwithcomma = words1.stream().collect(Collectors.joining(","));
        System.out.println("joinedwithcomma "+joinedwithcomma);

        List<String> names1 = Arrays.asList("Alex", "Bob", "Ankit", "John", "Arun");
        List<String> startsWithA = names1.stream().filter(n->n.startsWith("A")).collect(Collectors.toList());
        System.out.println("startsWithA is "+startsWithA);

        List<Integer> nums10 = Arrays.asList(4, 12, 7, 20, 3, 15);
        List<Integer> greaterthanten = nums10.stream().filter(n->n>10).collect(Collectors.toList());
        System.out.println("greaterthanten "+greaterthanten);

        List<Integer> nums11 = Arrays.asList(1, 2, 3, 4);
        List<Integer> cubenum = nums11.stream().map(n->n*n*n).collect(Collectors.toList());
        System.out.println("cubenum "+cubenum);

        List<Integer> nums12 = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> skipfirsttwo = nums12.stream().skip(2).collect(Collectors.toList());
        System.out.println("skipfirsttwo "+skipfirsttwo);


        List<Integer> nums13 = Arrays.asList(5, 10, 15, 20, 25);
        List<Integer> firstThree = nums13.stream().limit(3).collect(Collectors.toList());
        System.out.println("firstThree is "+firstThree);

        List<Integer> nums14 = Arrays.asList(10, 25, 60, 30);
        boolean greaterthan50exists = nums14.stream().anyMatch(n->n>50);
        System.out.println("greaterthan50exists "+greaterthan50exists);

        List<Integer> nums15 = Arrays.asList(5, 12, 7, 20);
        boolean allPositive = nums15.stream().allMatch(n->n>0);
        System.out.println("allPositive is "+allPositive);

        boolean nonumberisnegative = nums15.stream()
                                   .noneMatch(n -> n < 0);
        System.out.println("nonumberisnegative "+nonumberisnegative);
        
        List<Integer> nums16 = Arrays.asList(100, 200, 300);
        int firstElement = nums16.stream().findFirst().orElse(-1);
        System.out.println("firstElement "+firstElement);

        List<Integer> nums17 = Arrays.asList(9,10, 20, 30, 40);
        int findAny = nums17.stream().findAny().orElse(-1);
        System.out.println("findAny "+findAny);

        List<String> words2 = Arrays.asList("Java", "Stream", "API", "Programming");
        String longest = words2.stream().max(Comparator.comparingInt(n->n.length())).orElse("");
        System.out.println("longest  "+longest);

        Optional<String> shortest = words2.stream().min(Comparator.comparingInt(String::length));
        System.out.println(shortest.get());

        List<String> words3 = Arrays.asList("Java", "", "Stream", "", "API");
        long emptyCount = words3.stream().filter(n->n.isEmpty()).count();
        System.out.println("emptyCount "+emptyCount);

        List<Integer> nums18 = Arrays.asList(10, null, 20, null, 30);
        List<Integer> removedNull = nums18.stream().filter(n->n!=null).collect(Collectors.toList());
        System.out.println("removedNull "+removedNull);

        List<Integer> nums19 = Arrays.asList(10, null, 20, null, 30);
        List<Integer> replaceNull = nums19.stream().map(n->n!=null?n:0).collect(Collectors.toList());
        System.out.println("replaceNull "+replaceNull);

        List<Integer> nums20 = Arrays.asList(10, 40, 20, 50, 30);
        int secondHighest = nums20.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(-1);
        System.out.println("secondHighest "+secondHighest);


        List<String> words4 = Arrays.asList("Java", "Stream", "API", "Code");
        List<String> sorted = words4.stream().sorted(Comparator.comparingInt(n->n.length())).collect(Collectors.toList());
        System.out.println("sorted "+sorted);

        List<Integer> nums21 = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> convertedSet = nums21.stream().collect(Collectors.toSet());
        System.out.println("convertedSet "+convertedSet);


        List<Integer> nums22 = Arrays.asList(2, 9, 1, 5, 7);
        List<Integer> reverseList  = nums22.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("reverseList  "+reverseList);


        List<String> words5 = Arrays.asList("Hi", "Hello", "Stream", "Java");
        String longest1 = words5.stream().max(Comparator.comparingInt(n->n.length())).orElse("");
        System.out.println("longest1 "+longest1);

        String shortest1 = words5.stream().min(Comparator.comparingInt(n->n.length())).orElse("");
        System.out.println("shortest1 "+shortest1);


        List<Integer> nums23 = Arrays.asList(1, 2, 3, 4, 5);
        int[] listToArray = nums23.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(listToArray));


        String str = "programming";
        List<Character> distinctCharacter = str.chars().mapToObj(c->(char)c).distinct().collect(Collectors.toList());
        System.out.println("distinctCharacter is "+distinctCharacter);

        List<Integer> nums24 = Arrays.asList(1, 2, 2, 3, 3, 3, 4);
        Map<Integer, Long> freqMap = nums24.stream().collect(Collectors.groupingBy(n->n,Collectors.counting()));
        System.out.println("freqmap is "+freqMap);

        List<String> words6 = Arrays.asList("banana", "apple", "cherry", "date");
        List<String> reversealphabeticalorder = words6.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("reversealphabeticalorder "+reversealphabeticalorder);

        List<Integer> nums25 = Arrays.asList(10, 20, 30, 40);
        int lastElement = nums25.stream().reduce((a, b) -> b).orElse(-1);
        System.out.println("lastElement is "+lastElement);

        List<Integer> nums26 = Arrays.asList(1, 2, 3, 4, 2);
        boolean hasDuplicates = nums26.stream().distinct().count() != nums26.size();
        System.out.println("hasDuplicates  "+hasDuplicates);


        List<Integer> nums27 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> reversed = IntStream.range(0, nums27.size()).mapToObj(i -> nums27.get(nums27.size()-1-i)).collect(Collectors.toList());
        System.out.println("reversed is "+reversed);




        //#Internediate mapping,flatmap,optional,groupingby
        List<Employee> employees = Arrays.asList(new Employee(1, "A", 40000),new Employee(2, "B", 60000),new Employee(3, "C", 70000));
        List<Employee> salaryGreaterthan50000 = employees.stream().filter(n->n.getSalary() > 50000).collect(Collectors.toList());
        System.out.println("salaryGreaterthan50000  "+salaryGreaterthan50000);

        // List<String> namesFromEmployee = employees.stream().collect(Collectors.mapping(n->n.getName(), Collectors.toList()));
        List<String> namesFromEmployee = employees.stream().map(Employee::getName).collect(Collectors.toList());
        System.out.println("namesFromEmployee  "+namesFromEmployee);


        List<Employee> updatedSalaryPercentage = employees.stream().map(n -> new Employee(n.id, n.name, n.salary * (1.10))).collect(Collectors.toList());
        System.out.println("updatedSalaryPercentage  "+updatedSalaryPercentage);
        
        
        Map<String, List<String>> grouped = employees.stream()
                                         .collect(Collectors.groupingBy(n -> n.getSalary() >= 50000 ? "HIGH":"LOW",TreeMap::new,Collectors.mapping(n->n.getName(), Collectors.toList())));
        System.out.println("grouped  "+grouped);


        Map<String, Long> groupedByCount = employees.stream().collect(Collectors.groupingBy(n -> n.getSalary() >= 50000 ? "HIGH":"LOW",Collectors.counting()));
        System.out.println("groupedByCount  "+groupedByCount);


        Employee maxSalaryEmp = employees.stream().max(Comparator.comparingDouble(n->n.getSalary())).orElse(null);
        System.out.println("maxSalaryEmp  "+maxSalaryEmp);

        Employee maxSalaryEmpreducemethod = employees.stream().reduce((a, b) -> a.getSalary() > b.getSalary() ? a : b).orElse(null);
        System.out.println("maxSalaryEmpreducemethod "+maxSalaryEmpreducemethod);

        double avgSalary = employees.stream().mapToDouble(n->n.getSalary()).average().orElse(-1);
        System.out.println("avgSalary  "+avgSalary);


        List<String> salarygreaternames = employees.stream().filter(n->n.getSalary()>50000).map(n->n.getName()).collect(Collectors.toList());
        System.out.println("salarygreaternames  >> "+salarygreaternames);

        List<Employee> sortedBySalary =employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList()); 
        System.out.println("sortedBySalary >>> "+sortedBySalary);

        Map<Double, List<String>> groupedBySalary = employees.stream().collect(Collectors.groupingBy(n->n.getSalary(),Collectors.mapping(n->n.getName(), Collectors.toList())));
        System.out.println("groupedBySalary >> "+groupedBySalary);









    }

}

class Employee {
    int id;
    String name;
    double salary;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int id,String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
       return (this.name+" -> "+this.salary); 
    }
}
