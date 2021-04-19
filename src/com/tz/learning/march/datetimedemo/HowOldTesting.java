package com.tz.learning.march.datetimedemo;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class HowOldTesting {
    public static void main(String[] args) {
        System.out.println("请输入出生年月日(yyyy-mm-dd)");
        LocalDate birthDate = LocalDate.parse(new Scanner(System.in).nextLine());
        LocalDate nowDate = LocalDate.now();
        Period period = Period.between(birthDate,nowDate);
        System.out.printf("你总共活了%d年，%d月，%d日", period.getYears(), period.getMonths(), period.getDays());
    }
}
