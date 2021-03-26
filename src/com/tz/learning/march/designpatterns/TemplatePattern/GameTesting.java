package com.tz.learning.march.designpatterns.TemplatePattern;

public class GameTesting {
    public static void main(String[] args){
        Game football  = new Football();
        football.Play();

        Game basketball = new Basketball();
        basketball.Play();
    }
}
