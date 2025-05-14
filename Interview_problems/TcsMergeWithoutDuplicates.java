package Interview_problems;

import java.util.ArrayList;
import java.util.List;

public class TcsMergeWithoutDuplicates {

    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("xyz");
        a.add("surendar");
        a.add("susi");
        a.add("dinesh");
        

        List<String> b = new ArrayList<>();
        b.add("abc");
        b.add("susi");
        b.add("xyz");
        b.add("xyz");
        

        System.out.println(a);
        for(String s:b){
            boolean isthere = false;
            for(String t:a){
              if(s==t){
                isthere = true;
              }
            }
            if(!isthere){
                a.add(s);
            }
        }
        System.out.println(a);


    
    }
    
    


}
