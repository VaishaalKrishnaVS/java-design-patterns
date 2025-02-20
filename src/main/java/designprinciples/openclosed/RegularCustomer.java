package designprinciples.openclosed;

class RegularCustomer implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price * 0.3;
    }
}
