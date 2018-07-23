package factory.figures;

import factory.design.Shape;


//class with implements Shape

public class Rectangle implements Shape {

    @Override
    public void draw(){
        System.out.println("This is shape of rectangle");
    }
}