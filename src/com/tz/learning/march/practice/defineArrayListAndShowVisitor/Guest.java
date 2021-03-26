package com.tz.learning.march.practice.defineArrayListAndShowVisitor;

import java.util.Scanner;

public class Guest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入默认存储名字的个数: ");
        int defaultGuestCount = scanner.nextInt();
        ArrayList list = new ArrayList(defaultGuestCount);

        Scanner scanner2 = new Scanner(System.in);
        while(true){
            System.out.println("访客名称: ");
            String name = scanner2.nextLine();
            if(name.equals("quit")){
                break;
            }
            list.add(name);
        }

        System.out.println("已存访客名称: " );
        for(int i = 0; i < list.size(); i++){
            String name = (String)list.get(i);
            System.out.printf("%s%n", name.toUpperCase());
        }
    }
}
