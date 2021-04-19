package com.tz.practice.desingpatterns.AbstractFactory;

public class ShapeFactory extends AbstractFactory{
    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        if(shape == null) return null;
        if(shape.equalsIgnoreCase("Square")){
            return new Square();
        }
        if(shape.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        return null;
    }
}
