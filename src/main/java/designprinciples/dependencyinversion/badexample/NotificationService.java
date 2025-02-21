package designprinciples.dependencyinversion.badexample;

public class NotificationService {
    private final EmailService emailService;
    public NotificationService(EmailService emailService) {
        this.emailService = emailService;
    }
    public void sendNotification() {
        emailService.sendEmail();
    }
}
