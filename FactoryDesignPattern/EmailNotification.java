class SMSNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending SMS Notification");
    }
}

public class EmailNotification implements Notification {
    public EmailNotification(){
        System.out.println("EmailNotification constructor called");
    }
   public void notifyUser() {
        System.out.println("Sending Email Notification");
    }
}



class PushNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending Push Notification");
    }
}
