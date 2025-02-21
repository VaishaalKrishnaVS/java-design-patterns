package designprinciples.delegationprinciple;

class Kakashi implements Ninja {
    private final Naruto naruto = new Naruto();

    @Override
    public void executeMission(String mission) {
        naruto.executeMission(mission);
    }
}
