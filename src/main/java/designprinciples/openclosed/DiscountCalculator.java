package designprinciples.openclosed;

class DiscountCalculator {
    private final DiscountStrategy discountStrategy;
    public DiscountCalculator(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
    public double calculateDiscount(double price) {
        return discountStrategy.applyDiscount(price);
    }
}
