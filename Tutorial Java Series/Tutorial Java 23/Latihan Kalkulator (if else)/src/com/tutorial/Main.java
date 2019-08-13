package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// MEmbuat Kalkulator Sederhana
    // Template Kalkulator = a operator b
        Scanner inputUser;
        float a,b,hasil;
        char operator;

        inputUser = new Scanner(System.in);
        System.out.print("nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("operator =");
        operator = inputUser.next().charAt(0);
        System.out.print("nilai b = ");
        b = inputUser.nextFloat();

        System.out.println("input user: " + a + " " + operator + " " + b);

        // Operator Tersedia (*) (/) (+) (-)

        if (operator == '+' ){
           //Penjumlahan
            hasil = a + b;
            System.out.println("hasil = " + hasil);
        }else if (operator == '-'){
            //Prngurangan
            hasil = a - b;
            System.out.println("hasil = " + hasil);
        }else if (operator == '*'){
            //Kali
            hasil = a * b;
            System.out.println("hasil = " + hasil);
        }else if (operator == '/'){
            //Bagi
            if (b == 0){
                System.out.println("pembagi 0 sama dengan tidak hingga");
            }else{
                hasil = a / b;
                System.out.println("hasil = " + hasil);
            }
        }else{
            //operator tidak ditemukan
            System.out.println("Operator Tidak Ditemukan ");
        }

    }
}
