package Java8.StreamAPI;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//https://medium.com/@mehar.chand.cloud/java-stream-coding-interview-questions-part-1-dc39e3575727

public class Practice {
    public static void main(String[] args) {


        //Find the longest string in a list of strings using Java streams:
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "grapefruit");
        String longesString = strings.stream().max(Comparator.comparingInt(String::length)).orElse("");
        System.out.println(longesString);

        //Calculate the average age of a list of Person objects using Java streams:
        List<Person> persons = Arrays.asList(new Person("Alice", 25),new Person("Bob", 30),new Person("Charlie", 35));
        double avgAge = persons.stream().mapToInt(n->n.age).average().orElse(0);
        System.out.println("avgAGe is "+avgAge);

        //Q. Check if a list of integers contains a prime number using Java streams:
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 12, 14, 15);
        boolean containsPrime = numbers.stream().anyMatch(n->isPrime(n));
        System.out.println("contains prime is "+containsPrime);

        //Merge two sorted lists into a single sorted list using Java streams:
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> mergedList = Stream.concat(list1.stream(),list2.stream()).distinct().sorted().collect(Collectors.toList());
        System.out.println("mergedList is "+mergedList);

        //Find the intersection of two lists using Java streams:
        List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list4 = Arrays.asList(3, 4, 5, 6, 7);
        List<Integer> intersection = list3.stream().filter(list4::contains).collect(Collectors.toList());
        System.out.println("intersection is "+intersection);

        //Remove duplicates from a list while preserving the order using Java streams:
        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);
        List<Integer> uniqueNumbers = numbersWithDuplicates.stream().distinct().collect(Collectors.toList());
        System.out.println("uniqueNumbers is "+uniqueNumbers);

        //Given a list of transactions, find the sum of transaction amounts for each day using Java streams:
        List<Transaction> transactions = Arrays.asList(
            new Transaction("2022-01-01", 100),
            new Transaction("2022-01-01", 200),
            new Transaction("2022-01-02", 300),
            new Transaction("2022-01-02", 400),
            new Transaction("2022-01-03", 500)
        );

        Map<String,Integer> sumByDay = transactions.stream().collect(Collectors.groupingBy(n->n.date,TreeMap::new,Collectors.summingInt(n->n.amount)));
        System.out.println("sumByDay is "+sumByDay);


        //Find the kth smallest element in an array using Java streams:
        int[] array = {4, 2, 7, 1, 5, 3, 6};
        int k = 3;
        int kthSmallest = Arrays.stream(array).sorted().skip(k-1).findFirst().orElse(-1);
        System.out.println("kthSmallest is "+kthSmallest);

        //Given a list of strings, find the frequency of each word using Java streams
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", 
                                    "banana", "apple");
        Map<String,Long> wordFrequency = words.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("wordFrequency is "+wordFrequency);
        
        
        //Implement a method to partition a list into two groups based on a predicate using Java streams:
        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<Boolean,List<Integer>> partitioned = numbers2.stream().collect(Collectors.partitioningBy(n->n%2==0));
        System.out.println("partitioned >>>> "+partitioned);
        System.out.println(partitioned.get(true));
        


        //part-2
        //https://medium.com/@mehar.chand.cloud/java-stream-coding-interview-questions-part-2-9f3aad0025f3


        //Implement a method to calculate the Fibonacci sequence using Java streams
        








    }

    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }

}

class Person{
    String name;
    int age;

    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
}


class Transaction{
    String date;
    int amount;

    public Transaction(String date,int amount){
        this.date = date;
        this.amount = amount;
    }
}
