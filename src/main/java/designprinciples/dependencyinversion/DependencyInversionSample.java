package designprinciples.dependencyinversion;

public class DependencyInversionSample {
    public static void main(String[] args) {
        EmailNotification emailNotification = new EmailNotification();
        SMSNotification smsNotification = new SMSNotification();

        NotificationService emailNotificationService = new NotificationService(emailNotification);
        NotificationService smsNotificationService = new NotificationService(smsNotification);

        emailNotificationService.notifyCustomer();
        smsNotificationService.notifyCustomer();
    }
}
