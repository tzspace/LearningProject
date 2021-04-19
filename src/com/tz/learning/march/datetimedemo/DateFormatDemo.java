package com.tz.learning.march.datetimedemo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static java.text.DateFormat.*;

public class DateFormatDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("请输入你的出生日期(yyyy-mm-dd): ");
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        Date birthDay = dateFormat.parse(new Scanner(System.in).nextLine());
        Date currentDay = new Date();
        long life = currentDay.getTime() - birthDay.getTime();
        System.out.println("您的年龄是: " + life / (365*24*60*60*1000l));


        Date date = new Date();
        dateInstanceDemo(date);
        timeInstanceDemo(date);
        dateTimeInstanceDemo(date);
        testing();
    }

    static void dateInstanceDemo(Date date){
        System.out.println("get date instance demo");
        System.out.printf("\tDate LONG: %s%n", getDateInstance(LONG).format(date));
        System.out.printf("\tDate SHORT: %s%n", getDateInstance(SHORT).format(date));
    }

    static void timeInstanceDemo(Date date){
        System.out.println("get time instance demo");
        System.out.printf("\tTime LONG: %s%n", getTimeInstance(LONG).format(date));
        System.out.printf("\tTime MEDIUM: %s%n", getTimeInstance(MEDIUM).format(date));
        System.out.printf("\tTime SHORT: %s%n", getTimeInstance(SHORT).format(date));
    }

    static void dateTimeInstanceDemo(Date date){
        System.out.println("get date time instance demo");
        System.out.printf("\tDateTime LONG: %s%n", getDateTimeInstance(LONG,LONG).format(date));
        System.out.printf("\tDateTime MEDIUM: %s%n", getDateTimeInstance(SHORT,MEDIUM).format(date));
        System.out.printf("\tDateTime SHORT: %s%n", getDateTimeInstance(SHORT,SHORT).format(date));
    }

    static void testing(){
        DateFormat df = new SimpleDateFormat("yy-mm-dd");
        System.out.println(new Date());
        System.out.println(df.format(new Date()));
    }
}
