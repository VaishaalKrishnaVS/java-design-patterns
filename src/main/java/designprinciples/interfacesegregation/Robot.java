package designprinciples.interfacesegregation;

class Robot implements Workable{
    @Override
    public void work() {
        System.out.println("Robot works");
    }
}
