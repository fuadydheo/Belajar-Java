package com.tutorialjava.OOP.latihan;

public class Main {
    public static void main(String[] args) {
        Account a1 = new Account(123456);
        a1.setBalance(60);
        System.out.println(a1);
        a1.credit(50);
        System.out.println(a1);
        a1.debit(160);
        System.out.println(a1);
        a1.credit(50);
        System.out.println(a1);
        a1.debit(50);
        System.out.println(a1);

    }
}
