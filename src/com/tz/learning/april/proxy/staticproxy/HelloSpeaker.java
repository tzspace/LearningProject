package com.tz.learning.april.proxy.staticproxy;

public class HelloSpeaker implements HelloInterface{

    @Override
    public void Hello(String content) {
        System.out.println("你好: " + content);
    }
}
