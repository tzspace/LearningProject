package com.tz.learning.march.practice.InterfaceTesting;

import java.util.Scanner;

public class CashCardTesting {
    public static void main(String[] args){

        String number;
        long balance;
        long bonus;
        CashCard cc = new CashCard();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的number");
        number = scanner.nextLine();
        cc.setNumber(number);
        System.out.println("请输入你的balance");
        balance = scanner.nextLong();
        cc.setBalance(balance);
        System.out.println("请输入你的bonus");
        bonus = scanner.nextLong();
        cc.setBonus(bonus);

        ICashCardInterface service = new CashCardService();
        service.save(cc);
        CashCard card = service.load(cc.getNumber());
        System.out.printf("输入的卡信息为:%n number:%s , balance:%s , bonus:%s%n", card.getNumber(),
                card.getBalance(), cc.getBonus());
    }
}
