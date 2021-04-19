package com.tz.practice.desingpatterns.AbstractFactory;

public class AbstractFactoryTesting {
    public static void main(String[] args) {
        AbstractFactory colorFactory = FactoryProducer.GetFactory("Color");
        Color color = colorFactory.getColor("Red");
        color.fill();

        Color color1 = colorFactory.getColor("Black");
        color1.fill();

        AbstractFactory shapeFactory = FactoryProducer.GetFactory("Shape");
        Shape shape = shapeFactory.getShape("Square");
        shape.draw();

        Shape shape1 = shapeFactory.getShape("Circle");
        shape1.draw();
    }
}
