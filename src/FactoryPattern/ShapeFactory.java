package FactoryPattern;

public class ShapeFactory {

    Shape getShape(String Input){
        switch (Input) {
            case  "CIRCLE":
                return new Circle();
            case "RECTANGLE" :
                return new Rectangle();
            default:
                return null;
        }
    }
}
