import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
       

        Notification sms = NotificationFactory.createNotification("sms");
        sms.notifyUser();

        Notification notification = NotificationFactory.createNotification("email");
        notification.notifyUser();

        Supplier<String> su = ()->"java is";
        System.out.println(su.get());
    }
}
