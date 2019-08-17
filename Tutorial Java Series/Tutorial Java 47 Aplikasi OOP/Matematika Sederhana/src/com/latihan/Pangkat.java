package com.latihan;

import java.util.*;

public class Pangkat {
    public static void pangkatBilangan(){
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka\n");
        int a = in.nextInt();
        while(a<0){
            System.out.println("Input salah. Tak boleh nilai di bawah 0. Ulangi");
            a = in.nextInt();
        }
        System.out.println("Pangkat");
        int b = in.nextInt(), d=1;
        if(b==0){
            System.out.println("Hasil " + a + "^" +b + " = 1");
        }
        else if(b==1){
            System.out.println("Hasil " + a + "^" +b + " = " + a);
        }
        else {
            for (int c = 0; c < b; c++) {
                d *= a;
            }
            System.out.println("Hasil " + a + "^" +b + " = " + d);
        }
    }
}
