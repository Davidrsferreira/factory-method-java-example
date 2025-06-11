package refactoredversion;

import initialversion.Notification;
import initialversion.PushNotification;

public class PushNotificationFactory implements NotificationFactory{
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
