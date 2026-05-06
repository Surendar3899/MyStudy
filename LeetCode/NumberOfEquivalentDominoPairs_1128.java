import java.util.HashMap;
public class NumberOfEquivalentDominoPairs_1128 {
    public static void main(String[] args) {
        int[][] dominoes = {{1,2},{1,2},{1,1},{1,2},{2,2}};
        int result = numEquivDominoPairs2(dominoes);
        System.out.println("result is "+result);

    }

    //O(n) time complexity
    public static int numEquivDominoPairs2(int[][] dominoes) {
        int count = 0;

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int[] a:dominoes){
            int min = Math.min(a[0],a[1]);
            int max = Math.max(a[0],a[1]);
            int key = min * 10 + max;
            count = count+map.getOrDefault(key,0);
            map.put(key,map.getOrDefault(key,0)+1);


        }

        return count;
    }




    // 0(n2) time complexity
    public static int numEquivDominoPairs(int[][] dominoes) {
        int ans = 0;

        HashMap<Integer,Integer> ma = new HashMap<>();

        

        for(int i=0;i<dominoes.length;i++){
            int a = dominoes[i][0];
            int b = dominoes[i][1];
            for(int j=i+1;j<dominoes.length;j++){
                int num1 = dominoes[j][0];
                int num2 = dominoes[j][1];

                if((a == num1 && b == num2) || (a==num2 && b == num1)){
                    ans++;
                }
            }


            ma.clear();


        }

        return ans;
    }

}
