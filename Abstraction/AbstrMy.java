package Abstraction;

public abstract class AbstrMy {
    private static String name = "surendar";

    String name1 = "susi";

    


    public void func1(){
        System.out.println("func1 called");
    }

    public static void func2(){
        System.out.println("func2 static called");
    }

    protected void func3(){
        System.out.println("func3 private called");
    }

    abstract void func4();

}
