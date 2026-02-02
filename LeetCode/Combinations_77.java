package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Combinations_77 {
    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        List<List<Integer>> result = combine(n,k);
        System.out.println("result is "+result);
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> li = new ArrayList<>();
        backTrack(1,n,k,li,new ArrayList<>());
        return li;
    }

    private static void backTrack(int i, int n, int k, List<List<Integer>> li,List<Integer> l) {

        if(l.size() == k){
            li.add(new ArrayList<>(l));
            return;
        }

       for(int j=i;j<=n;j++){
         
          l.add(j);
          backTrack(j+1,n,k,li,l);
          l.remove(l.size()-1);
          
         
       }
    }

}
