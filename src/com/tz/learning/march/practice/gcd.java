package com.tz.learning.march.practice;

public class gcd {
    public static void main(String[] args){
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
    }
}
