package com.company;

public class Main {

    public static void main(String[] args) {

        printAngka( angkaInteger: 10);
        printAngka( angkaFloat: 10.5f);

    }

    private static void printAngka( int angkaFloat){
        System.out.println("angka ini adalah float dengan nilai = " + angkaFloat);
    }

    private static void printAngka( int angkaInteger){
        System.out.println("angka ini adalah integer dengan nilai = " + angkaInteger);
    }
}
