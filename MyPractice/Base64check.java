package MyPractice;

import java.util.Base64;

public class Base64check {
    public static void main(String[] args) {
        String a = null;
        byte[] privateKeyBytes = Base64.getDecoder().decode(a);
        
        // Optionally, print the decoded byte array
        System.out.println(java.util.Arrays.toString(privateKeyBytes));

    }
}
