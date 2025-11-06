package Java8.StreamAPI;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.*;
import java.util.function.Function;

public class MyTry {
   public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1,2,3,4,5,6);
    //List<Integer> filterList = list.stream().filter(n -> n%2==0).collect(Collectors.toList);
    //List<String> filterList = list.stream().map(String::toUpperCase).collect(Collectors.toList());

    List<String> list1 = Arrays.asList("surendar", "susi", "Aravind");
    List<String> filterList1 = list1.stream().map(String::toUpperCase).filter(n -> n.length()>4).collect(Collectors.toList());
    System.out.println(filterList1);

    List<List<String>> list2 = Arrays.asList(Arrays.asList("A","X","P"),Arrays.asList("B","X","D","L"," "),Arrays.asList("O","2","3"));
    List<String> filterList2 = list2.stream().flatMap(n -> n.stream()).filter(s -> s.matches("\\d+")).collect(Collectors.toList());
    System.out.println("filterList2 "+filterList2);

    List<String> filterList3 = list2.stream().flatMap(n -> n.stream()).distinct().collect(Collectors.toList());
    System.out.println("filterList3 is "+filterList3);


    List<Integer> list3 = Arrays.asList(1,2,3,4,5,6);

    int sum = list3.stream().reduce(10,(a,b) -> a+b);
    System.out.println("sum is "+sum);

    List<String> list4 = Arrays.asList("java","python","go");
    String result = list4.stream().reduce((a,b) -> a.length()>b.length()?a:b).orElse("");

    System.out.println("result is "+result);


    List<String> letters = Arrays.asList("A","B","C","E");
    String result1 = letters.stream().reduce((a,b) -> a+b).orElse("");
    System.out.println("result1 is "+result1);


    Map<Integer,List<String>> resultMap = list4.stream().collect(Collectors.groupingBy(String::length));

    System.out.println("resultMap is "+resultMap);

    System.out.println("lsit5>>>>>");
  
    
    List<Integer> list5 = Arrays.asList(1, 2, 3, 4, 8, 9, 10, 11, 12,13,0,14,-1,7,7);
    int target = 14;

    Set<List<Integer>> pairs = list5.stream()
            .flatMap(i -> list5.stream()
                .filter(j -> i < j && i + j == target)
                .map(j -> Arrays.asList(i, j)))
            .collect(Collectors.toSet());

    System.out.println("Pairs: " + pairs);


    List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David","durai");
    String resultstartwithc = names.stream().filter(n -> n.startsWith("C")).findFirst().orElse("");
    System.out.println("resultstartwithc "+resultstartwithc);

    Map<Character,List<String>> mapWithStatLetter = names.stream().collect(Collectors.groupingBy(n -> Character.toLowerCase(n.charAt(0))));

    System.out.println("mapWithStatLetter "+mapWithStatLetter.toString());

    Map<Boolean,List<String>> mapWithStatLetter2 = names.stream().collect(Collectors.partitioningBy(n -> n.startsWith("A")));
    System.out.println("mapWithStatLetter2 "+mapWithStatLetter2.toString());


    List<Integer> num = Arrays.asList(1,2,3,4);

    int sumOfSquares = num.stream().map(n -> n*n).reduce(0,(a,b) -> a+b);
    System.out.println("sumOfSquares "+sumOfSquares);

    List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date");
    List<String> reverseOrderFruits = fruits.stream().map(String::toUpperCase).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    System.out.println("reverseOrderFruits "+reverseOrderFruits);
    
    
    List<String> words = Arrays.asList("one", "two", "three", "four", "five");
    Map<Integer,List<String>> groupWordsByLength = words.stream().collect(Collectors.groupingBy(String::length));
    System.out.println("groupWordsByLength "+groupWordsByLength);

    List<Integer> numbers = Arrays.asList(10,5, 20, 5, 80, 30);
    int maxResult = numbers.stream().max((a,b) -> a-b).orElse(0);
    System.out.println("maxResult is "+maxResult);


   // Q8: Count how many strings start with "A". 
   List<String> names1 = Arrays.asList("Alice", "Arnold", "Bob", "Charlie", "Andrew","aravind");
   long Count = names1.stream().filter(n -> n.startsWith("A") || n.startsWith("a")).count();
   System.out.println("Count is "+Count);


   //Q9: Given a list of strings, group them by anagram sets. 
   List<String> words1 = Arrays.asList("listen", "silent", "enlist", "rat", "tar", "art");
   Map<String,List<String>> groupByAnagram = words1.stream().collect(Collectors.groupingBy(n -> n.chars().sorted().mapToObj(c -> String.valueOf((char)c)).collect(Collectors.joining())));
   System.out.println("groupByAnagram is "+groupByAnagram);

   //Q10: Convert a list of lists into a single list. 
   List<List<String>> nestedList = Arrays.asList( Arrays.asList("a", "b"), Arrays.asList("c", "d"), Arrays.asList("e", "f") );
   List<String> convertintolist = nestedList.stream().flatMap(Collection::stream).collect(Collectors.toList());
   System.out.println("convertintolist is "+convertintolist);

   //Q11: Given a list of integers, return a list of strings "even" or "odd" depending on whether the number is even or odd. 
   List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5,7);
   List<String> oddeven = numbers1.stream().map(n -> n%2 ==0 ? "even":"odd").collect(Collectors.toList());
   System.out.println("oddeven is "+oddeven);

   //Q12: Given a list of sentences, count the frequency of each word (case-insensitive). 
   List<String> sentences = Arrays.asList("Java is fun", "Streams are powerful", "Java is powerful");
   
   Map<String,Long> countfreq = sentences.stream().flatMap(n -> Arrays.stream(n.toLowerCase().split(" "))).collect(Collectors.groupingBy(word -> word,Collectors.counting()));
   System.out.println("countfreq is "+countfreq);

   //Q13: From a list of integers, find the duplicate numbers and how many times they occur. 
    List<Integer> nums = Arrays.asList(1, 2, 3, 2, 3, 4, 5, 3);

    Map<Integer,Long> dupnum = nums.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(n -> n.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    System.out.println("dupnum is "+dupnum);


    //Q14: Flatten a Map<String, List<List<Integer>>> into a List<Integer>. 
    Map<String, List<List<Integer>>> map = new HashMap<>();

    map.put("a", Arrays.asList(Arrays.asList(1, 2),Arrays.asList(3)));
    map.put("b", Arrays.asList(Arrays.asList(4),Arrays.asList(5, 6)));
    
    List<Integer> flattenList = map.entrySet().stream().flatMap(n -> n.getValue().stream()).flatMap(n->n.stream()).collect(Collectors.toList());
    System.out.println("flattenlist is "+flattenList);

    List<Integer> flattenList2 = map.values().stream().flatMap(List::stream).flatMap(Collection::stream).collect(Collectors.toList());
    System.out.println("flattenlist2 is "+flattenList2);

    //Q15: Return the common elements between two lists using streams.
    List<Integer> numlist1 = Arrays.asList(1,2,3,4,5);
    List<Integer> numlist2 = Arrays.asList(5,6,7,8,9);

    List<Integer> common = numlist1.stream().filter(numlist2::contains).collect(Collectors.toList());
    System.out.println("common is "+common);
    List<Integer> common2 = numlist1.stream().filter(n -> numlist2.contains(n)).collect(Collectors.toList());
    System.out.println("common2 is "+common2);

    //Q17: Given "hello world", count the frequency of each character.
    String str = "hello world";
    Map<Integer,Long> countcharfreq = str.chars().collect(Collectors.groupingBy(n->n,Collectors.counting()));

    System.out.println("countcharfreq "+countcharfreq);


}
}
