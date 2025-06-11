package refactoredversion;

import initialversion.NotificationService;

public class Main {
    public static void main(String[] args) {
        NotificationFactory factory = new EmailNotificationFactory();
        NotificationService service = new NotificationService(factory);
        service.notify("Hello via Email!");

        factory = new SmsNotificationFactory();
        service = new NotificationService(factory);
        service.notify("Hello via SMS!");
    }
}
