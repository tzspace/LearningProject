package com.tz.learning.april.Pattern;

public class Fruits {
    int price;
    int weight;
    Fruits(){}
    Fruits(int price, int weigth){
        this.price = price;
        this.weight = weigth;
    }
}

class Apple extends Fruits{
    Apple(){};
    Apple(int price, int weight){
        super(price, weight);
    }

    @Override
    public String toString() {
        return "Apple";
    }
}

class Banana extends Fruits{
    Banana(){};
    Banana(int price, int weight){
        super(price, weight);
    }

    @Override
    public String toString() {
        return "Banana";
    }
}


