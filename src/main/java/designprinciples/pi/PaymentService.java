package designprinciples.pi;

class PaymentService {
    private final PaymentGateway paymentGateway;

    public PaymentService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }
    public void makePayment(String paymentId) {
        paymentGateway.processPayment(paymentId);
    }
}
