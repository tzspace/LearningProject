package com.tz.learning.march.serialization;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private String description;
    private int age;
    private int score;

    public String GetName(){
        return name;
    }

    public void SetName(String name){
        this.name = name;
    }

    public String GetDescription(){
        return description;
    }

    public void SetDescription(String description){
        this.description = description;
    }

    public int GetAge(){
        return age;
    }

    public void SetAge(int age){
        this.age = age;
    }

    public int GetScore(){
        return score;
    }

    public void SetScore(int score){
        this.score = score;
    }

    public String toString(){
        return "Student:" + '\n' +
                "name:" + this.name + '\n' +
                "age:" +  this.age + '\n' +
                "score:" + this.score + '\n' +
                "description:" + this.description;
    }
}
