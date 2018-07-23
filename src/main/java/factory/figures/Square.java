package factory.figures;

import factory.design.Shape;


//class with implements Shape

public class Square implements Shape {

    @Override
    public void draw(){
        System.out.println("This is shape od square");
    }
}
