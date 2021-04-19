package com.tz.learning.march.lambda;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class test1 {
    public static void main(String[] args) {

        String[] names = {"Ted", "summer", "Al"};
        /*Arrays.sort(names, new Comparator<String>() {
                    public int compare(String name1, String name2) {
                        return -(name1.length() - name2.length());
                    }
                });*/
        //Arrays.sort(names,(name1,name2)-> -(name1.length() - name2.length()));
        //System.out.println(Arrays.toString(names));

        //String[] names = {"Ted","Alex","Summer","Tina"};
        //Comparator<String> comparator = (name1, name2) -> (name1.length() - name2.length());
        //Arrays.sort(names, (name1, name2) -> -(name1.length() - name2.length()));
        //System.out.println(Arrays.toString(names));
        Arrays.sort(names, String::compareTo);
        System.out.println(Arrays.toString(names));
    }
}
