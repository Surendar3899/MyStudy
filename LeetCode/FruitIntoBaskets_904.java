import java.util.HashMap;
import java.util.Map;

public class FruitIntoBaskets_904 {
    public static void main(String[] args) {
      int[] fruits = {2, 2, 1,3, 2, 2,3};
      int result = totalFruit(fruits); 
      System.out.println("result is "+result); 
    }

    public static int totalFruit(int[] fruits) {
        int ans = 0 ;
        Map<Integer, Integer> count = new HashMap<>();
        for (int l = 0, r = 0; r < fruits.length; ++r) {
            count.merge(fruits[r], 1, Integer::sum);
            System.out.println("count is "+count);
            while (count.size() > 2) {
                System.out.println("while >>>");
                count.merge(fruits[l], -1, Integer::sum);
                count.remove(fruits[l], 0);
                ++l;
                System.out.println("after deleting "+count);
            }
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
        
    }

     public static int totalFruitNew(int[] fruits) {
        int ans = 0 ;
        int l = 0;
        Map<Integer,Integer> countMap = new HashMap<>();
        for(int i=0;i<fruits.length;i++){
           countMap.put(fruits[i], countMap.getOrDefault(fruits[i], 0)+1);
           System.out.println("countma "+countMap);
           while(countMap.size() > 2){
                countMap.put(fruits[l], countMap.getOrDefault(fruits[l], 0)-1);
                if(countMap.get(fruits[l]) == 0){
                    countMap.remove(fruits[l]);
                }
                l++;
           }
           ans = Math.max(ans, i-l+1);
        }
        return ans;
        
    }

}
