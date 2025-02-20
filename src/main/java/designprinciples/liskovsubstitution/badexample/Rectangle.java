package designprinciples.liskovsubstitution.badexample;

import lombok.Setter;

@Setter
class Rectangle {
    protected double width;
    protected double height;

    public double getArea(){
        return width * height;
    }

}
