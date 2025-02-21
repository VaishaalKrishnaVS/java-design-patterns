package designprinciples.interfacesegregation.badexample;

public class Robot implements Worker{
    @Override
    public void work() {
        System.out.println("Robot works");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void sleep() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
