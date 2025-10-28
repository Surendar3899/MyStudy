import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class One {
    //Find the second largest number in an array without sorting
//[10, 5, 8, 20, 2]
public static void main(String[] args) {
    // int[] arr = {10, 5, 8, 20,2};

    // int max = 0;
    // int secondmax = 0;
    // for(int i=0;i<arr.length;i++){
    //     if(arr[i] > max){
    //         secondmax = max;
    //         max = arr[i];
            
    //     }
    //     else if(arr[i] < max && arr[i] > secondmax){
    //         secondmax = arr[i];
    //     }


    // }

    // System.out.println(secondmax);






//     2 - Given a list of words, group words that are anagrams of each other.
// words = ["eat", "tea", "tan", "ate", "nat", "bat"]
// # Expected output: [["eat","tea","ate"], ["tan","nat"], ["bat"]]


      String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};

      Map<String,List<String>> result = new HashMap<>();

      for(int i=0;i<words.length;i++){
         String word = words[i].chars().mapToObj(n->(char)n).sorted().collect(Collectors.toList()).toString();
         if(result.containsKey(word)){
            List<String> g = result.get(word);
            g.add(words[i]);
            result.put(word, g);
         }else{
            List<String> g = new ArrayList<>();
            g.add(words[i]);
            result.put(word, g);
         }
         
      }

      System.out.println("result is "+result);

      //db.employees.find({"salary":5000})
      

}

}
