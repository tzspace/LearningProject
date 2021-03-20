package com.tz.learning.march.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class gcd {
    /*public static void main(String[] args){
        int a = 1000;
        int b = 345;
        int result = TestGCD(a, b);
        System.out.printf("最大公因数：%d", result);
    }

    public static int TestGCD(int a, int b) {
        int result;
        while(true){
            int modResult = a%b;
            if(modResult == 0){
                result = b;
                break;
            }
            a = b;
            b = modResult;
        }
        return result;
    }*/

    /*public static void main(String[] args)
    {
        int a = 1000;
        int b = 495;
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i <= Math.min(a,b); i++){
            if(a%i == 0 && b%i ==0){
                list.add(i);
                System.out.printf("公因子：%d%n",i);
            }
        }
        System.out.printf("最大公因子是：%d%n", Collections.max(list));
    }*/

    public static void main(String[] args){
        int a = 1000;
        int b = 495;
        int result = GetResult(a, b);
        System.out.printf("最大公因数是: %d%n", result);
    }

    public static int GetResult(int a, int b){
        int c = a % b;
        if(b%c == 0)
        {
            return c;
        }
        a = b;
        b = c;
        return GetResult(a, b);
    }
}
