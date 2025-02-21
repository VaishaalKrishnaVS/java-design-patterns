package designprinciples.liskovsubstitution;

public class LiskovSubstitutionSample {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5,10);
        Shape square = new Square(5);
        System.out.println("Area of rectangle is " + rectangle.getArea());
        System.out.println("Square of rectangle is " + square.getArea());
    }
}
