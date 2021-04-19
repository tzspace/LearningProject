package com.tz.practice.desingpatterns.AbstractFactory;

public class FactoryProducer {
    public static AbstractFactory GetFactory(String choice){
        if(choice.equalsIgnoreCase("Color")){
            return new ColorFactory();
        }else if(choice.equalsIgnoreCase("Shape")){
            return new ShapeFactory();
        }
        return null;
    }
}
