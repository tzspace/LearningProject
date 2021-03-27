package com.tz.learning.march.enumtesting.simpletesting;

public class PlayBalls {
    public static void main(String[] args){
        Play(Balls.BallsType.Basketball);
        Play(Balls.BallsType.Football);
        Play(Balls.BallsType.PingPang);

    }

    public static void Play(Balls.BallsType type){
        switch (type){
            case Basketball:
                System.out.println("Let's play Basketball");
                break;
            case Football:
                System.out.println("Let's play Football");
                break;
            case PingPang:
                System.out.println("Let's play PingPang");
                break;
        }
    }
}
