package designprinciples.dependencyinversion;

class NotificationService {
    private final NotificationSender notificationSender;
    NotificationService(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }
    public void notifyCustomer() {
        notificationSender.sendNotification();
    }
}
