package designprinciples.singleresponsibility;

public class SingleResponsibility {
    public static void main(String[] args) {
        Ninja ninja = new Ninja("Naruto");
        Mission mission = new Mission();
        NinjaAcademy ninjaAcademy = new NinjaAcademy();

        ninjaAcademy.enrollNinja(ninja);
        mission.assignMission(ninja);
    }
}
