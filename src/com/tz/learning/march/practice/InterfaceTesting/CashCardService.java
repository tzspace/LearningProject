package com.tz.learning.march.practice.InterfaceTesting;


import java.util.ArrayList;
import java.util.Arrays;

public class CashCardService implements ICashCardInterface{
    ArrayList<CashCard> list = new ArrayList();
    //CashCard[] itemList = new CashCard[]{};
    int next = 0;

    /*CashCardService(int cashCashCount){
        itemList = new CashCard[cashCashCount];
    }*/

    @Override
    public void save(CashCard cashCard) {
        //itemList[next++] = cashCard;
        list.add((cashCard));
    }

    @Override
    public CashCard load(String number) {
        //CashCard result = new CashCard();
        /*for(int i = 0; i < itemList.length; i++){
            if(itemList[i].getNumber().equals(number)){
                return itemList[i];
            }
        }*/
        for(CashCard item : list){
            if(item.getNumber().equals(number)){
                return item;
            }
        }
        return new CashCard();
    }
}
