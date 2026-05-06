import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExample {
    private final Map<String, String> map = new HashMap<>();
    private final ReadWriteLock lock = new ReentrantReadWriteLock();

    // Write operation
    public void put(String key, String value) {
        lock.writeLock().lock();   // acquire write lock
        try {
            System.out.println(Thread.currentThread().getName() + " writing...");
            map.put(key, value);
        } finally {
            lock.writeLock().unlock(); // always release lock
        }
    }

    // Read operation
    public String get(String key) {
        lock.readLock().lock();   // acquire read lock
        try {
            System.out.println(Thread.currentThread().getName() + " reading...");
            return map.get(key);
        } finally {
            lock.readLock().unlock(); // release lock
        }
    }

    public static void main(String[] args) {
        ReadWriteLockExample obj = new ReadWriteLockExample();

        // Writer thread
        Runnable writer = () -> {
            for (int i = 0; i < 3; i++) {
                obj.put("key" + i, "value" + i);
                try { Thread.sleep(100); } catch (Exception e) {}
            }
        };

        // Reader thread
        Runnable reader = () -> {
            for (int i = 0; i < 3; i++) {
                obj.get("key" + i);
                try { Thread.sleep(100); } catch (Exception e) {}
            }
        };

        // Multiple threads
        new Thread(writer, "Writer-1").start();
        new Thread(reader, "Reader-1").start();
        new Thread(reader, "Reader-2").start();
    }
}
