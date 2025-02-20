package designprinciples.liskovsubstitution.badexample;

class Square extends Rectangle {
    @Override
    public void setWidth(double width) {
        this.width = width;
        this.height = width;  // Ensuring both sides remain equal
    }

    @Override
    public void setHeight(double height) {
        this.width = height;
        this.height = height;  // Ensuring both sides remain equal
    }
}
