package com.tz.learning.march.accesslevel;

public class SwordsMan extends Role{
    @Override
    public void fight(){
        System.out.println("挥剑攻击");
    }

    public String toString(){
        return "骑士" + super.toString();
    }
}
