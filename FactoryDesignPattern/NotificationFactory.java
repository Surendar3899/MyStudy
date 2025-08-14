import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class NotificationFactory {

    // private static final Map<String, Supplier<Notification>> registry = new HashMap<>();

    // static {
    //     registry.put("EMAIL", EmailNotification::new);
    //     registry.put("SMS", SMSNotification::new);
    //     registry.put("PUSH", PushNotification::new);
    // }

    // public static Notification createNotification(String type) {
    //     Supplier<Notification> supplier = registry.get(type.toUpperCase());
    //     if (supplier != null) {
    //         return supplier.get();
    //     }
    //     throw new IllegalArgumentException("Unknown notification type: " + type);
    // }

    // // Optionally allow dynamic registration
    // public static void registerNotification(String type, Supplier<Notification> supplier) {
    //     registry.put(type.toUpperCase(), supplier);
    // }


    private static Map<String,Notification> registry = new HashMap<>();
    static {
        registry.put("EMAIL", new EmailNotification());
        registry.put("SMS", new SMSNotification());
        registry.put("PUSH", new PushNotification());
    }

     public static Notification createNotification(String type) {
        Notification supplier = registry.get(type.toUpperCase());
        if (supplier != null) {
            return supplier;
        }
        throw new IllegalArgumentException("Unknown notification type: " + type);
    }
    

}
