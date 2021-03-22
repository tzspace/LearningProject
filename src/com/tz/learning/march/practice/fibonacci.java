package com.tz.learning.march.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fibonacci {
    /*public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        System.out.println("需要输出的个数:");
        num = scanner.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < num; i++){
            if(i <= 1){
                list.add(1);
            }
            else{
               Integer[] intArray = list.toArray(new Integer[list.size()]);
               list.add(intArray[i-2] + intArray[i-1]);
            }
        }
        for(int element : list){
            System.out.printf("%2d ", element);
        }

    }*/


    //时间复杂度：O(N)， 空间复杂度：O(1)
    /*public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要输出的费氏数列个数：");
        int num = scanner.nextInt();
        Fibonacci(num);
    }

    static void Fibonacci(int num){
        int count = 0;
        int firstNum = 1;
        int secondNum = 1;
        int result = 0;
        while(count < num){
            if(count < 2){
                result = firstNum;
            }else{
                result = firstNum + secondNum;
                firstNum = secondNum;
                secondNum = result;
            }
            System.out.println(result);
            count ++;
        }
    }*/


    //时间复杂度: O(2ᴺ), 空间复杂度: O(1)
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要输出的费氏数列个数:");
        int num = scanner.nextInt();

        for(int i = 0; i < num; i++){
            System.out.println(Fibonacci(i) + " ");
        }
    }

    static int Fibonacci(int num){
        if(num < 2){
            return 1;
        }
        return Fibonacci(num-2) + Fibonacci(num -1);
    }
}
