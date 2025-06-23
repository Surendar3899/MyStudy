package Java8;

/**
 * InnercheckLambda
 */
 interface MyInterface {
   // void rr();
    void rr1();
    
}

interface NewInterface{
    void rr();
}

public class checkLambda {
    public static void main(String[] args) {
        MyInterface obj = () ->
            {
                System.out.println("explicit call");
            };
        
        obj.rr1();

        NewInterface ob = () ->
                           {
                            System.out.println("new interface");
                           };
        ob.rr();                   
 
    }
}
