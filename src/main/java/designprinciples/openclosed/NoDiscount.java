package designprinciples.openclosed;

class NoDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return 0;
    }
}
