package com.tz.learning.march.designpatterns.TemplatePattern;

public class Basketball extends Game{
    @Override
    public void InitGame(){
        System.out.println("初始化篮球游戏中");
    }

    @Override
    public void PlayGame(){
        System.out.println("我在玩篮球游戏");
    }

    @Override
    public void FinishGame(){
        System.out.println("我已经玩完篮球游戏了");
    }
}
