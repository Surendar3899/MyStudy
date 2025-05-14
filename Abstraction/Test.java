package Abstraction;

public class Test extends AbstrMy {
    public static void main(String[] args) {
        Test ts= new Test();
        ts.func1();
        ts.func2();
        ts.func4();

        AbstrMy.func2();
    }

    @Override
    void func4() {
        System.out.println("func4 called");
    }
}
