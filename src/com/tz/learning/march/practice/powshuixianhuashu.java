package com.tz.learning.march.practice;

import java.util.ArrayList;
import java.util.List;

public class powshuixianhuashu {
    public static void main(String[] args){
        List<Integer> result = GetResultByPow();
        for(int i : result){
            System.out.printf("result is: %d%n", i);
        }
    }
    
    public static List<Integer> GetResultByPow(){
        List<Integer> r = new ArrayList<Integer>();
        for(int i = 100; i<1000; i++){
            int h = i / 100;
            int t = i % 100 / 10;
            int g = i % 10;
            
            if(i == Math.pow(h,3) + Math.pow(t,3) + Math.pow(g,3)){
                r.add(i);
            }
        }
        return r;
    }
}
