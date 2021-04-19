package com.tz.learning.march.accesslevel;

public class RPG {
    public static void main(String[] args){
        SwordsMan swordsMan = new SwordsMan();
        swordsMan.setName("骑士");
        swordsMan.setBlood(100);
        swordsMan.setLevel(10);
        ShowBlood(swordsMan);

        System.out.println(swordsMan);


        Magician magician = new Magician();
        magician.setName("魔法师");
        magician.setBlood(90);
        magician.setLevel(9);
        ShowBlood(magician);

        System.out.println(magician);


        drawFight(swordsMan);
        drawFight(magician);
    }

    public static void drawFight(Role role){
        System.out.print(role .getName());
        role.fight();
    }

    public static void ShowBlood(Role role){
        System.out.printf("%s 血量 %d%n", role.getName(), role.getBlood());
    }
}
