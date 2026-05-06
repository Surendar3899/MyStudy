import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Check4 {

    public static void main(String[] args) {
        
  
    List<String> words =  new ArrayList<>(Arrays.asList("hello", "world", "hello"));

    
    
    // for(int i=0;i<words.size();i++){
    //     String word = words.get(i);
    //     int firstindex = words.indexOf(word);
    //     int lastindex = words.lastIndexOf(word);

    //     System.out.println(firstindex+"   "+lastindex);

    //     if(firstindex != lastindex){
    //         words.remove(lastindex);
    //     }
    // }

    Iterator<String> li = words.iterator();
    while(li.hasNext()){
        String word = li.next();
        int firstindex = words.indexOf(word);
         int lastindex = words.lastIndexOf(word);

        System.out.println(firstindex+"   "+lastindex);

         if(firstindex != lastindex){
            li.remove();
         }
    }

    System.out.println(words);

      }

}
