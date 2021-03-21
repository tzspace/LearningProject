package com.tz.learning.march.practice;

import java.util.Scanner;

public class userInputParseStringToLong {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long input = 0;
        long sum = 0;
        do{
            System.out.println("请输入数字:");
            input = Long.parseLong(scanner.next());
            sum += input;
        }while(input != 0);

        System.out.printf("Sum is: %d%n", sum);
    }
}
