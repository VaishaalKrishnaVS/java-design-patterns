package designprinciples.dependencyinversion;

public class SMSNotification implements NotificationSender {

    @Override
    public void sendNotification() {
        System.out.println("ending sms notification....");
    }
}
