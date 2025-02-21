package designprinciples.dependencyinversion;

public class EmailNotification implements NotificationSender {
    @Override
    public void sendNotification() {
        System.out.println("Sending email...");
    }
}
