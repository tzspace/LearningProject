package com.tz.learning.april.proxy.staticproxy;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloProxy implements HelloInterface{
    HelloInterface obj;
    HelloProxy(HelloInterface object){
        this.obj = object;
    }

    @Override
    public void Hello(String content) {
        Log("开始啦...");
        obj.Hello(content);
        Log("结束了...");
    }

    private void Log(String msg){
        Logger.getLogger(HelloProxy.class.getName()).log(Level.INFO, msg);
    }
}
