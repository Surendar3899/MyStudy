package Java8;

/**
 * InnercheckLambda
 */
 interface MyInterface {
   abstract void rr();
    
}

public class checkLambda {
    public static void main(String[] args) {
        MyInterface obj = () ->
            {
                System.out.println("explicit call");
            };
        
        obj.rr();
    }
}
