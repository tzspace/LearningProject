package com.tz.learning.march.practice;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args){
        int random = (int)(Math.random()*10);
        System.out.printf("random is: %d%n", random);
        Scanner scanner = new Scanner(System.in);
        int guess;

        do{
            System.out.println("猜数字(0～9):");
            guess = scanner.nextInt();
        }while(random != guess);

        System.out.println("猜对了!!!");
    }
}
