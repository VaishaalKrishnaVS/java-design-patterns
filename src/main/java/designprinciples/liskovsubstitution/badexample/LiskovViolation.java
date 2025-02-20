package designprinciples.liskovsubstitution.badexample;

public class LiskovViolation {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(10);
        System.out.println("Area of Rectangle: "+rectangle.getArea());

        Rectangle square = new Square();
        square.setWidth(10);
        square.setHeight(15);
        System.out.println("Area of Square: "+square.getArea()); // This is breaking the expected output
    }
}
