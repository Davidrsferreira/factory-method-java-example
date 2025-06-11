package initialversion;

public class NotificationService {
    public void notify(String type, String message) {
        Notification notification;

        switch (type.toLowerCase()) {
            case "email":
                notification = new EmailNotification();
                break;
            case "sms":
                notification = new SmsNotification();
                break;
            case "push":
                notification = new PushNotification();
                break;
            default:
                throw new IllegalArgumentException("Unknown notification type: " + type);
        }

        notification.send(message);
    }
}