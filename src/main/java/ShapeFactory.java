import factory.design.Shape;
import factory.figures.Circle;
import factory.figures.Rectangle;
import factory.figures.Square;


//Created Factory to generate object of concrete class based on given information.

public class ShapeFactory {
    public Shape getShape(String shapeType){
        if (shapeType ==null){
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
