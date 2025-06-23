package Java8.StreamAPI.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class S1 {

    public static void main(String[] args) {
        List<String> flist = new ArrayList<>();
        flist.add("apple");
        flist.add("banana");
        flist.add("orange");

        List<String> newlist = flist.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(newlist);

        List<String> newlist1 = flist.stream().filter(n -> n.length() > 5).map(String::toUpperCase).collect(Collectors.toList());
         System.out.println(newlist1);






        
    }

}
