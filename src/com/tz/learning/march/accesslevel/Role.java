package com.tz.learning.march.accesslevel;

public abstract class Role {
    protected String name;
    protected int blood;
    protected int level;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public int getBlood() {
        return blood;
    }

    public abstract void fight();

    @Override
    public String toString(){
        return String.format ( "( %s，%d, %d)%n",
                this.name,
                this.level,
                this.blood);
    }
}
