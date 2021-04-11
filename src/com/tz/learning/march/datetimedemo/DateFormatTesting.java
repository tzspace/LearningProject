package com.tz.learning.march.datetimedemo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateFormatTesting {
    public static void main(String[] args) {
        DateFormat date = new SimpleDateFormat();
        DateFormat date1 = DateFormat.getDateInstance();
        DateFormat date2 = DateFormat.getTimeInstance();
        DateFormat date3 = DateFormat.getDateTimeInstance();

        System.out.println(date);
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
    }


}
