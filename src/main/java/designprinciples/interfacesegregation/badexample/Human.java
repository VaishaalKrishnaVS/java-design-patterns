package designprinciples.interfacesegregation.badexample;

class Human implements Worker {

    @Override
    public void work() {
        System.out.println("Human works");
    }

    @Override
    public void eat() {
        System.out.println("Human eats");
    }

    @Override
    public void sleep() {
        System.out.println("Human sleeps");
    }
}
