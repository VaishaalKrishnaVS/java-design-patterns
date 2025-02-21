package designprinciples.interfacesegregation;

public class InterfaceSegregationSample {
    public static void main(String[] args) {
        Human human = new Human();
        human.eat();
        human.sleep();
        human.work();
        Robot robot = new Robot();
        robot.work();
    }
}
