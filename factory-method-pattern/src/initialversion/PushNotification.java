package initialversion;

public class PushNotification implements Notification {
    public void send(String message) {
        System.out.println("Sending PUSH: " + message);
    }
}