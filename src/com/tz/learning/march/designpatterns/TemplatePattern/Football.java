package com.tz.learning.march.designpatterns.TemplatePattern;

public class Football extends Game{

    @Override
    public void InitGame(){
        System.out.println("初始化足球游戏中");
    }

    @Override
    public void PlayGame(){
        System.out.println("我在玩足球游戏");
    }

    @Override
    public void FinishGame(){
        System.out.println("我已经玩完足球游戏了");
    }
}
