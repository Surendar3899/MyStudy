import java.security.MessageDigest;
import java.util.Arrays;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

//import org.apache.commons.codec.binary.Base64;

// import org.apache.commons.codec.binary.Base64;


public class App {
    private static Cipher cipher;
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String plainText = "koxzz4k5IiSUOsnDLpijZg==";
        String key = "9fuWrpXElx4XDN/FjPvvsA==LDGER";

        String result = decrypt(plainText,key);
		System.out.println("result is "+result);
		
    }


      public static String decrypt(String value, String secretKeyValue) throws Exception {
		KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
		keyGenerator.init(128);
		byte[] key = (secretKeyValue).getBytes("UTF-8");
		MessageDigest sha = MessageDigest.getInstance("SHA-1");
		key = sha.digest(key);
		key = Arrays.copyOf(key, 16); // use only first 128 bit

		SecretKeySpec secretKeySpec = new SecretKeySpec(key, "AES");
		cipher = Cipher.getInstance("AES");

		return decrypt(value, secretKeySpec);
	}


    protected static String decrypt(String encryptedText, SecretKey secretKey) throws Exception {
		// byte[] encryptedTextByte = Base64.decodeBase64(encryptedText);
		byte[] encryptedTextByte = null;
		cipher.init(Cipher.DECRYPT_MODE, secretKey);
		byte[] decryptedByte = cipher.doFinal(encryptedTextByte);
		String decryptedText = new String(decryptedByte);
		return decryptedText;
	}
}
