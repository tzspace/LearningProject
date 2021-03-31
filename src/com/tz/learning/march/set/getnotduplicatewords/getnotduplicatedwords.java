package com.tz.learning.march.set.getnotduplicatewords;

import apple.laf.JRSUIUtils;

import javax.xml.transform.Result;
import java.util.*;

public class getnotduplicatedwords {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入句子");
        String stringValue = scanner.nextLine();
        Set result = GetNotDuplicatedString(stringValue);
        System.out.printf("不重复的字符有 %d 个: %s%n", result.size(), result);
    }

    static Set GetNotDuplicatedString(String line){
        String[] stringArray = line.split(" ");
        return new TreeSet(Arrays.asList(stringArray));
    }
}
