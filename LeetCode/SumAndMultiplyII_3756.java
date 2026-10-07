import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumAndMultiplyII_3756 {

    public static void main(String[] args) {
       String s = "9876543210";
       int[][] queries = {{0,9}};
       int[] result = sumAndMultiply(s, queries);
       System.out.println(Arrays.toString(result)); 
    }

    public static int[] sumAndMultiply(String s, int[][] queries) {
        Map<Integer,Integer> indexMap = new HashMap<>();
        int[] result = new int[queries.length];
        for(int i=0;i<s.length();i++){
            int num = Integer.parseInt(String.valueOf(s.charAt(i)));
            if(num > 0){
                indexMap.put(i, num);
            }
        }
        int j = 0;
        for(int[] a:queries){
            int sum = 0;
            int num = 0;
            for(int i=a[0];i<=a[1];i++){
              if(indexMap.containsKey(i)){
                int value = indexMap.get(i);
                num = num * 10 + value;
                sum = sum + value;
              }
            }
            result[j] = num * sum;
            j++;
        }

        System.out.println("indexmap is "+indexMap);
        return result;
    }

}
