import java.util.*;

public class DistributeCandies_575 {

    public static void main(String[] args) {
       int[] candyType = {1,1,2,2,3,3};
       int result = distributeCandies(candyType);
       System.out.println("result is "+result);
    }

    public static int distributeCandies(int[] candyType) {
        Map<Integer,Integer> ma = new HashMap<>();
        for(int i=0;i<candyType.length;i++){
            int count = ma.getOrDefault(candyType[i],0);
            ma.put(candyType[i],count+1);
        }

        int max = candyType.length/2;
        
        int totalcandytype = 0;

        for(int a:ma.keySet()){
            totalcandytype++;
        }



        return Math.min(max,totalcandytype);
    }

     public static int distributeCandies2(int[] candyType) {
       Set<Integer> set = new HashSet<>();
       for(int i=0;i<candyType.length;i++){
        set.add(candyType[i]);
       }

       return Math.min(set.size(),candyType.length/2);
    }

}
