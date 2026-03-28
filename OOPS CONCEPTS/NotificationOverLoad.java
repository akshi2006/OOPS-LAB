class Notifier {

    public void send(String message) {
        System.out.println("General Alert: " + message);
        logNotification(message); 
}
    protected void send(String message, String email) {
        System.out.println("Email sent to " + email + ": " + message);
    }

    void send(String message, long phoneNumber) {
        System.out.println("SMS sent to " + phoneNumber + ": " + message);
    }

    private void logNotification(String message) {
        System.out.println("Logging notification: " + message);
    }
}

class AppNotifier extends Notifier {

    public void testMethods() {
        send("Welcome Akshithaa!");

        send("Your OTP is 5020", "user@email.com");

        send("Your package arrived", 9876543210L);

    }
}


public class NotificationOverLoad {
    public static void main(String[] args) {

        AppNotifier app = new AppNotifier();

        app.send("This file is created by Akshithaa"); 
        app.send("Verify Email:", "akshi006@gmail.com"); 
        app.send("Delivery Update", 9123456780L); 

        System.out.println("\n--- From Subclass ---");
        app.testMethods();
    }
}