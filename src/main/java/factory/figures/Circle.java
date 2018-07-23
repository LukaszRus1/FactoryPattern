package factory.figures;

import factory.design.Shape;


//class with implements Shape

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("this is shape of circle");
    }
}
