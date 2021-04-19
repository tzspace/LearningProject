package com.tz.practice.desingpatterns.SimpleFactory;

public class FruitFactory {
        public static IFruit getFruit(FruitEnum fruitEnum){
        switch (fruitEnum){
            case Apple:
                return new Apple();
                //break;
            case Orange:
                return new Orange();
                //break;
            case Banana:
                return new Banana();
                //break;

            default:
                return null;
        }
    }
}
