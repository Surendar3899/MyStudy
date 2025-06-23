package LeetCode.arraystring;

public class FindIndexFirstOccurance_28 {
    public static void main(String[] args) {
       String haystack = "a", needle = "a";
       int result = strStr(haystack,needle);
       System.out.println("result is "+result);

    }

    public static int strStr(String haystack, String needle) {
        boolean completed = true;
        if(!haystack.contains(needle)){
           return -1;
        }
        
        for(int i=0;i<=haystack.length()-needle.length();i++){
            int j = 0;
            if(needle.charAt(j) == haystack.charAt(i)){
                completed = true;
                int k =i;
                int result = i;
                while(j<needle.length()-1){
                    j++;
                    k++;
                    if(needle.charAt(j) != haystack.charAt(k)){
                       completed = false;
                       break;
                    }                   
                }
                if(completed){
                    return result;
                }
            }
        }
        return -1;
    }
}
