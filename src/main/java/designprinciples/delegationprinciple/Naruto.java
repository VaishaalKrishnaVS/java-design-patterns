package designprinciples.delegationprinciple;

class Naruto implements Ninja{
    @Override
    public void executeMission(String mission) {
        System.out.println("Mission[Naruto]: " + mission);
    }
}
