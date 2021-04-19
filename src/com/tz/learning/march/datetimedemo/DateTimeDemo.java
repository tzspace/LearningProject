package com.tz.learning.march.datetimedemo;

import java.util.Date;

public class DateTimeDemo {
    public static void main(String[] args) {
        long sDateTime = System.currentTimeMillis();
        Date t1 = new Date(sDateTime);
        Date t2 = new Date();

        System.out.println(t1);
        System.out.println(t2);

        System.out.println(t1.getTime());
        System.out.println(t2.getTime());
    }
}
