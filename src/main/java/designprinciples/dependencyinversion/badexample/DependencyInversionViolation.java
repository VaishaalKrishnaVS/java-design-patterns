package designprinciples.dependencyinversion.badexample;

public class DependencyInversionViolation {
    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        NotificationService notificationService = new NotificationService(emailService);
        notificationService.sendNotification();
    }
}
