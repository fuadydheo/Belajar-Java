package com.tutorial;

public class Main {

    public static void main(String[] args) {
	// unary adalah operasi yang dilakukan pada satu variable saja

        //unary + dan -
        int angka = 1;
        System.out.printf("unary '-', %d menjadi %d\n",angka, -angka);
        System.out.printf("unary '+', %d menjadi %d\n",angka, +angka);
    //unary Decrement dan Increment
        //Increment
        int angka2 = 10;
        angka2++;
        System.out.println("nilai dengan '++' menjadi = " + angka2);

        //Decrement
        int angka3 = 10;
        angka3--;
        System.out.println("nilai dengan '--' menjadi = " + angka3);

        //Perkenalan Post Fix dan Pre Fix
        int a = 5;
        a++;
        ++a;
        System.out.println("nilai dengan '++' menjadi = " + a);

        //Prefix dan posfix
        int z = 5;
        System.out.printf("nilai dengan '++' prefix menjadi = %d \n", ++z);
        int b = 5;
        System.out.printf("nilai dengan '++' postfix menjadi = %d \n", b++);
        System.out.printf("nilai hasil dari postfix menjadi = %d \n", b);

        //unary boolean dengan ! untuk negasi

        boolean ucup = true;
        System.out.println("nilai boolean = " + ucup);
        System.out.println("nilai boolean = " + !ucup);


    }
}
