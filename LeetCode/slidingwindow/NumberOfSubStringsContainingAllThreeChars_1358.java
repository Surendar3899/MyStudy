public class NumberOfSubStringsContainingAllThreeChars_1358 {

    public static void main(String[] args) {
        String s = "aaabc";
        int result = numberOfSubstrings(s);
        System.out.println("result is "+result);
    }

    public static int numberOfSubstrings(String s) {
        int ans = 0;
        int left = 0;
        int n = s.length();
        int[] count = new int[3];

        for(int right = 0 ; right < n;right++){
            count[s.charAt(right) - 'a']++;
            while(count[0] > 0 && count[1] > 0 && count[2] > 0){
                ans = ans + (n-right);
                count[s.charAt(left) - 'a']--;
                left++;
            }
        }


        return ans;
    }

}
