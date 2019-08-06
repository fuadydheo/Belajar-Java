package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int hasil = 5 * 2 / 10;
        System.out.println(hasil);
        // Menggunakan Pengelompokan Oeprasi Aritmatika dengna --> ()
        hasil = 5 * (2 + 10);
        System.out.println(hasil);

        Scanner userInput = new Scanner(System.in);
        //Perhitungan persamaan kuadrat
        System.out.println("Menghitung Persamaan Kuadarat");
        int m,x,c;

        System.out.print("nilai x = ");
        x = userInput.nextInt();
        System.out.print("gradient m =");
        m = userInput.nextInt();
        System.out.print("bias c =");
        c = userInput.nextInt();
        int y = m*x*x +c;

        System.out.println("nilai y =" + y);



    }
}
