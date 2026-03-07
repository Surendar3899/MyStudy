public class Test1 {
    public static void main(String[] args) {
        W a = new W();
    
    }

}

class W extends A{
    W(){
        // super();
        System.out.println("W");
        super();
    }
}

class A{
    A(){
        System.out.println("A");
    }
}
