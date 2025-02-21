package designprinciples.interfacesegregation;

public class Human implements Sleepable,Eatable,Workable{
    @Override
    public void eat() {
        System.out.println("Human eat");
    }

    @Override
    public void sleep() {
        System.out.println("Human sleep");
    }

    @Override
    public void work() {
        System.out.println("Human work");
    }
}
