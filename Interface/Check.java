package Interface;

public class Check implements Intermy {
   

    @Override
    public void add() {
        System.out.println("add called");
    }

  

    @Override
    public void sum() {
        System.out.println("sum called");
    }

    public static void main(String[] args) {
        Check ch = new Check();
        System.out.println(ch.name);
        Intermy.test();
        

    }
}
