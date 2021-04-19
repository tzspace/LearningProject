package com.tz.learning.march.practice.InterfaceTesting;

public interface ICashCardInterface {
    void save(CashCard cashCard);
    CashCard load(String number);
}
