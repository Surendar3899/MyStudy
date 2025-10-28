public class Deadlock {


    public static void main(String[] args) {
        A a = new A(); 
        B b = new B();
        new Thread(() -> a.methodA(b)).start();
        new Thread(() -> b.methodB(a)).start();
    }

}

class A {
    synchronized void methodA(B b) {
        System.out.println("Thread-1: Holding A, waiting for B");
        try { 
            Thread.sleep(100); 
        } catch (Exception e) {

        }
        b.last();
    }
    synchronized void last() { 
        System.out.println("Inside A.last()"); 
    }
}

class B {
    synchronized void methodB(A a) {
        System.out.println("Thread-2: Holding B, waiting for A");
        try { 
            //Thread.sleep(100); 
        } catch (Exception e) {

        }
        a.last();
    }
    synchronized void last() { 
        System.out.println("Inside B.last()"); 
    }
}
