package refactoredversion;

import initialversion.Notification;
import initialversion.SmsNotification;

public class SmsNotificationFactory implements NotificationFactory{
    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }
}
