package com.tz.learning.march.accesslevel;

public class Magician extends Role {
    @Override
    public void fight() {
        System.out.println("魔法攻击");
    }

    public void cure() {
        System.out.println("魔法治疗");
    }

    public String toString(){
        return "魔法师" + super.toString();
    }
}
