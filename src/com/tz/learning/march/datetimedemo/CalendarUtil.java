package com.tz.learning.march.datetimedemo;

import java.util.Calendar;

public class CalendarUtil {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1989, Calendar.OCTOBER, 21);
        Calendar current = Calendar.getInstance();
        System.out.printf("岁数: %d%n", getYearsBetween(calendar, current));
        System.out.printf("天数: %d%n", getDaysBetween(calendar, current));

    }

    static long getYearsBetween(Calendar birthDate, Calendar currentDate){
        Calendar calendar = (Calendar) birthDate.clone();
        long years = 0;
        while(calendar.before(currentDate)){
            calendar.add(Calendar.YEAR, 1);
            years++;
        }
        return years;
    }

    static long getDaysBetween(Calendar birthday, Calendar currentDate){
        Calendar calendar = (Calendar) birthday.clone();
        long days = 0;
        while(calendar.before(currentDate)){
            calendar.add(Calendar.DATE, 1);
            days++;
        }
        return days;
    }
}
