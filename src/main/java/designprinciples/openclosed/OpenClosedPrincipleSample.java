package designprinciples.openclosed;

public class OpenClosedPrincipleSample {
    public static void main(String[] args) {
        DiscountCalculator premiumDiscountCalculator = new DiscountCalculator(new PremiumCustomer());
        System.out.println("Discount for premium customer: "+ premiumDiscountCalculator.calculateDiscount(100d));
        DiscountCalculator regularDiscountCalculator = new DiscountCalculator(new RegularCustomer());
        System.out.println("Discount for regular customer: "+ regularDiscountCalculator.calculateDiscount(100d));
        DiscountCalculator noDiscountCalculator = new DiscountCalculator(new NoDiscount());
        System.out.println("Discount for noDiscount customer: "+ noDiscountCalculator.calculateDiscount(100d));
    }
}
