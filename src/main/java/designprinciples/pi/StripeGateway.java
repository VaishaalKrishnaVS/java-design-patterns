package designprinciples.pi;

public class StripeGateway implements PaymentGateway {
    @Override
    public void processPayment(String paymentId) {
        System.out.println("Payment processed via Stripe: " + paymentId);
    }
}
