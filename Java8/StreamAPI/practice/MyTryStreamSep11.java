package Java8.StreamAPI.practice;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class MyTryStreamSep11 {
    public static void main(String[] args) {
        //Q1: Given a list of integers, return a list of only even numbers.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evennumbers =  numbers.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
        System.out.println(evennumbers);

        //Q2: From a list, find all pairs that sum to a given number (e.g., 10). 
        List<Integer> nums = Arrays.asList(1, 2, 3, 7, 5, 8, 6, 4); 
        int target = 10;
        List<List<Integer>> pair =  nums.stream().flatMap(n->nums.stream().filter(j-> j>n && j+n == target).map(j->Arrays.asList(j,n))).collect(Collectors.toList());
        System.out.println("pair is "+pair);

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        List<String> filternames = names.stream().filter(n->n.toLowerCase().startsWith("c")).collect(Collectors.toList());
        String findFirst = names.stream().filter(n->n.toLowerCase().startsWith("c")).findFirst().orElse("");
        System.out.println("filternames is "+filternames);
        System.out.println("findFirst is "+findFirst);

        //Q4: Find the sum of squares of numbers in a list. 
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> sqnumber = numbers1.stream().map(n-> n*n).collect(Collectors.toList());
        int totalsqnumber = numbers1.stream().map(n->n*n).reduce(0, (a,b)->a+b);
        System.out.println("sqnumber is "+sqnumber);
        System.out.println("totalsqnumber is "+totalsqnumber);

        //Q5: Sort a list of strings in descending (reverse alphabetical) order. 
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date");
        List<String> reverseOrderfruits = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("reverseOrderfruits is "+reverseOrderfruits);
        
        //Q6: Group words by their length. 
        List<String> words = Arrays.asList("one", "two", "three", "four", "five");
        Map<Integer,List<String>> groupWords = words.stream().collect(Collectors.groupingBy(n->n.length()));
        System.out.println("groupWords is "+groupWords);


        //Q7: Find the maximum number in a list. 
        List<Integer> numbers2 = Arrays.asList(10, 20, 5, 80, 30);
        int maxNumber = numbers2.stream().max((a,b) -> a.compareTo(b)).orElse(0);
        System.out.println("maxNumber is "+maxNumber);

        //Q8: Count how many strings start with "A".
        List<String> names1 = Arrays.asList("Alice", "Arnold", "Bob", "Charlie", "Andrew","charu");
        long countstartwitha =  names1.stream().filter(n->n.startsWith("A")).count();
        System.out.println("countstartwitha is "+countstartwitha);


        //Q9: Given a list of strings, group them by anagram sets. 
        List<String> words1 = Arrays.asList("listen", "silent", "enlist", "rat", "tar", "art");
        Map<String,List<String>> groupByAnagram = words1.stream().collect(Collectors.groupingBy(n->n.chars().sorted().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining(""))));
        System.out.println("groupByAnagram is "+groupByAnagram);


        //Q10: Convert a list of lists into a single list. 
        List<List<String>> nestedList = Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("c", "d"),Arrays.asList("e", "f"));
        List<String> singleList = nestedList.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println("singleList is "+singleList);


        //Q11: Given a list of integers, return a list of strings "even" or "odd" depending on whether the number is even or odd. 
        List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4, 5,7);
        List<String> evenorodd = numbers3.stream().map(n->n%2==0?"even":"odd").collect(Collectors.toList());
        System.out.println("evenorodd is "+evenorodd);

        //Q12: Given a list of sentences, count the frequency of each word (case-insensitive). 
        List<String> sentences = Arrays.asList("Java is fun", "Streams are powerful", "java is powerful"); 
        Map<String,Long> countfrequency =  sentences.stream().flatMap(n->Arrays.stream(n.toLowerCase().split("\\s+"))).collect(Collectors.groupingBy(o->o,Collectors.counting()));
        System.out.println("countfrequency is "+countfrequency);

        //Q13: From a list of integers, find the duplicate numbers and how many times they occur. 
        List<Integer> nums1 = Arrays.asList(1, 2, 3, 2, 3, 4, 5, 3); 
        Map<Integer,Long> findDuplicate = nums1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(e->e.getValue() >1)
                                             .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("findDuplicate is "+findDuplicate);

        //Q14: Flatten a Map<String, List<List<Integer>>> into a List<Integer>. 
        Map<String, List<List<Integer>>> map = new HashMap<>();
        map.put( "a", Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3),Arrays.asList(5)));
        map.put("b", Arrays.asList(Arrays.asList(4), Arrays.asList(5, 6)));
        map.put("c", Arrays.asList(Arrays.asList(11), Arrays.asList(15, 65)));

        List<Integer> intoalist = map.entrySet().stream().map(n->n.getValue()).flatMap(List::stream).flatMap(List::stream).collect(Collectors.toList());
        System.out.println("intoalist is "+intoalist);

        List<Integer> intoalist2 = map.entrySet().stream().map(n->n.getValue()).flatMap(n->n.stream()).flatMap(n->n.stream()).collect(Collectors.toList());
        System.out.println("intoalist2 is "+intoalist2);

        //Q15: Return the common elements between two lists using streams. 
        List<Integer> list1 = Arrays.asList(1,2,3,4);
        List<Integer> list2 = Arrays.asList(3,2,5,6);


        List<Integer> commonIntegers = list1.stream().filter(list2::contains).collect(Collectors.toList());
        System.out.println("commonIntegers is "+commonIntegers);


        //Q16: Remove duplicate integers from a list. 
        List<Integer> numbers4 = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> uniqueNumbers = numbers4.stream().distinct().collect(Collectors.toList());
        System.out.println("uniqueNumbers is "+uniqueNumbers);

        List<Integer> numbers5 = Arrays.asList(6, 2, 2, 7, 8, 8, 9);
        List<Integer> numbers6 = Arrays.asList(610, 2, 2, 7, 8, 8, 9);

        List<Integer> merge = Stream.concat(numbers4.stream(), numbers5.stream()).distinct().collect(Collectors.toList());
        List<Integer> merge1 = Stream.of(numbers4, numbers5,numbers6).flatMap(List::stream).distinct().collect(Collectors.toList());
       
        System.out.println("merge is "+merge);
        System.out.println("merge1 is "+merge1);

        //List<Integer> uuniqueNumbers2 = numbers4.stream().flatMap(numbers5.stream()).distinct()


        //Q17: Given "hello world", count the frequency of each character.
        String word = "hello world";
        Stream<Character> a = word.chars().mapToObj(c->(char)c);
        Map<Character,Long> countfreq = a.filter(n->n!=' ').collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("countfreq is "+countfreq);


        //Q18: Given a list of strings, find the element that occurs most frequently. 
        List<String> input = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        String mostoccurword = input.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
        System.out.println("mostoccurword is "+mostoccurword);

        //Q20: Reverse a list of elements using streams only.
        List<Integer> origList = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> reverseList = origList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("reverseList is "+reverseList);


        //partition queries
        //1. Partition numbers into even and odd
        List<Integer> numbers7 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("numbers7 is "+numbers7);

        Map<Boolean,List<Integer>> evenorodd1 = numbers7.stream().collect(Collectors.partitioningBy(n->n%2==0));
        System.out.println("evenorodd1 is "+evenorodd1);


        //2. Partition strings by length > 5
        List<String> words2 = Arrays.asList("java", "streams", "partitioningBy", "map", "code");
        Map<Boolean,List<String>> length5 = words2.stream().collect(Collectors.partitioningBy(n->n.length()>5));
        System.out.println("length5 is "+length5);










    }

}
