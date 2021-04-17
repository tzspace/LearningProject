package com.tz.learning.april.proxy.staticproxy;

public class HelloTesting {
    public static void main(String[] args) {
        HelloInterface helloInterface = new HelloProxy(new HelloSpeaker());
        helloInterface.Hello("Ted");
    }
}
