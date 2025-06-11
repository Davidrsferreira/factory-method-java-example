package refactoredversion;

import initialversion.EmailNotification;
import initialversion.Notification;

public class EmailNotificationFactory implements NotificationFactory{
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
