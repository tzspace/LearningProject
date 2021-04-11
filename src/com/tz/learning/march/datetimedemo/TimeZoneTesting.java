package com.tz.learning.march.datetimedemo;

import java.util.TimeZone;

public class TimeZoneTesting {
    public static void main(String[] args) {
        TimeZone tz = TimeZone.getDefault();
        String[] ids = tz.getAvailableIDs();
        for(String item : ids){
            System.out.println(item);
        }
        System.out.println(tz.getDisplayName());
        System.out.printf("时区是:%s%n", tz.getID());
        System.out.printf("夏令时数:%s%n", tz.getDSTSavings());
        System.out.printf("UTC偏移毫秒数:%s%n", tz.getRawOffset());
    }
}
