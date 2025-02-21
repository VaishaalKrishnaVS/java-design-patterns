package designprinciples.pi;

public class ProgrammingToAnInterfaceSample {

    public static void main(String[] args) {
        PaymentGateway stripePaymentGateway = new StripeGateway();
        PaymentGateway paypalPaymentGateway = new PaypalGateway();

        PaymentService stripePaymentService = new PaymentService(stripePaymentGateway);
        PaymentService paypalPaymentService = new PaymentService(paypalPaymentGateway);

        stripePaymentService.makePayment("Payment 01");
        paypalPaymentService.makePayment("Payment 02");
    }
}
