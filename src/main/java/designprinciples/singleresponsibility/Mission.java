package designprinciples.singleresponsibility;

class Mission {
    public void assignMission(Ninja ninja) {
        System.out.println("Assigning mission to ninja " + ninja.getName());
    }
}
