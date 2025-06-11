package initialversion;

import refactoredversion.NotificationFactory;

public class NotificationService {

    private final NotificationFactory factory;

    public NotificationService(NotificationFactory factory) {
        this.factory = factory;
    }

    /* Initial version
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
     */

    public void notify(String message) {
        Notification notification = factory.createNotification();
        notification.send(message);
    }
}