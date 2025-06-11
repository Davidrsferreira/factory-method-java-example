package initialversion;

public class Initialversion {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        service.notify("email","Hello via Email!");
        service.notify("sms","Hello via SMS!");
        service.notify("push","Hello via push!");
    }
}
