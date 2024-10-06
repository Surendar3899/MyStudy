package MyPractice;

public class Environ {
    public static void main(String[] args) {
         // Get all environment variables
         System.out.println("environments");
         System.getenv().forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });
    }
    
}
