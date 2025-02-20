package designprinciples.openclosed;

class PremiumCustomer implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price * 0.5;
    }
}
