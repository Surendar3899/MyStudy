import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThread extends Thread {

    public void run() {
        System.out.println("Running...");
    }
    public static void main(String[] args) {
        MyThread m = new MyThread();
        m.start();

        ExecutorService service = Executors.newFixedThreadPool(3);
        service.submit(() -> System.out.println("Task"));
    }

}
