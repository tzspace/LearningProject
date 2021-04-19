package com.tz.learning.march.designpatterns.TemplatePattern;

public abstract class Game {

    public void Play(){
        InitGame();
        PlayGame();
        FinishGame();
    }

    public abstract void InitGame();
    public abstract void PlayGame();
    public abstract void FinishGame();

}
