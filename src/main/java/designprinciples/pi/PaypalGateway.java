package designprinciples.pi;

public class PaypalGateway implements PaymentGateway {
    @Override
    public void processPayment(String paymentId) {
        System.out.println("Payment processed via Paypal: " + paymentId);
    }
}
