package com.tz.practice.desingpatterns.SimpleFactory;

public class SimpleFactoryTesting {
    public static void main(String[] args) {
        //FruitFactory fruitFactory = new FruitFactory();
        FruitFactory.getFruit(FruitEnum.Orange).showFruit();
        //fruit1.showFruit();
        IFruit fruit2 = FruitFactory.getFruit(FruitEnum.Apple);
        fruit2.showFruit();
        IFruit fruit3 = FruitFactory.getFruit(FruitEnum.Banana);
        fruit3.showFruit();
    }
}
