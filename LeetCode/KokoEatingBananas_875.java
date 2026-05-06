import java.util.Arrays;

public class KokoEatingBananas_875 {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11}; 
        int h = 8;
        int result = minEatingSpeed(piles,h);
        System.out.println("result is "+result);
    }

    public static int minEatingSpeed2(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();

        while (l < r) {
        final int m = (l + r) / 2;
        if (eatHours(piles, m) <= h)
            r = m;
        else
            l = m + 1;
        }

        return l;
    }

    // Returns the hours to eat all the piles with speed m.
    private static int eatHours(int[] piles, int m) {
        return Arrays.stream(piles).reduce(
            0, (subtotal, pile) -> subtotal + (pile - 1) / m + 1); // ceil(pile / m)
    }

    public static int minEatingSpeed(int[] piles, int h) {
        
        Arrays.sort(piles);

        int min = 1;
        int max = Arrays.stream(piles).max().getAsInt();
       
        while(min<max){
            System.out.println("min is "+min);
            int mid = (min+max)/2;
            System.out.println("mid is "+mid);        
            int maxHours = 0;
            for (int i = 0; i < piles.length; i++) {
                maxHours += (int) Math.ceil((double) piles[i] / mid);
            }

            System.out.println("maxhours "+maxHours);

            if(maxHours <= h){
                max = mid;
            }else{
                min = mid+1;
            }

        }

        return min;
    }

}
