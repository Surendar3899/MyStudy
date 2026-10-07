public class SmallestPalindromicReArrangementI_3517 {

    public static void main(String[] args) {
        String s = "aabbbcc";
        String result = smallestPalindrome(s);
        System.out.println("result is "+result);
    }

    public static String smallestPalindrome(String s) {
        int[] count = new int[26];
        
        for(char ch:s.toCharArray()){
            count[ch-'a']++;
        }

        StringBuilder left = new StringBuilder();
        char middle = 0;

        for(int i=0;i<26;i++){

            for(int j=0;j<count[i]/2;j++){
                left.append((char)('a'+i));
            }

            if(count[i]%2 == 1){
                middle = (char) ('a'+i);
            }
        }

        StringBuilder result = new StringBuilder();
        result.append(left);
        if(middle != 0){
            result.append(middle);
        }

        result.append(new StringBuilder(left).reverse());

        return result.toString();
    }

}
