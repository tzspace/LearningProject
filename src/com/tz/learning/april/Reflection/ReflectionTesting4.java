package com.tz.learning.april.Reflection;

import sun.lwawt.macosx.CSystemTray;

import java.util.Scanner;

public class ReflectionTesting4 {
    public static void main(String[] args) throws Exception{
        //String interfacePackageName = ;
        String packageName = System.getProperty("com.tz.learning.april.Reflection.Play");
        System.out.println("package name is :" + packageName);
        Class rt4 = Class.forName("com.tz.learning.april.Reflection.Play");
        Play play = (Play) rt4.getDeclaredConstructor().newInstance();
        //Play play = (Play) Class.forName(packageName).getDeclaredConstructor().newInstance();
        System.out.println("请输入需要播放的影片:");
        play.play(new Scanner(System.in).nextLine());
    }


}
