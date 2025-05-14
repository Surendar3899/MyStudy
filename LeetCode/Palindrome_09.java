package LeetCode;
/*
 * Given an integer x, return true if x is a 
palindrome
, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */

public class Palindrome_09 {

    public static void main(String[] args) {
        int num = 121;
        boolean result = isPalindrome(num);
        System.out.println("result is "+result);
                
    }
        
    private static boolean isPalindrome(int x) {
        int temp = x;
        if(x < 0){
            return false;
        }
        boolean isPalindrome = false;
        int num2 = 0;
        while(x != 0){
            int module = x%10;
            num2 = num2*10+module;
            x = x/10;
        }

        if(temp == num2){
            return true;
        }
        System.out.println("num2 is "+num2);
        return isPalindrome;
    }

}
