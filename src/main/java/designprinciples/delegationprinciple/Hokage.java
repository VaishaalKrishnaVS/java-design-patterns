package designprinciples.delegationprinciple;

class Hokage {
    private Ninja squadLeader = new Kakashi();
    void assignMission(String mission){
        squadLeader.executeMission(mission);
    }
}
