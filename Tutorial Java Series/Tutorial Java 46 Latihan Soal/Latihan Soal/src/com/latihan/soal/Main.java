package com.latihan.soal;

import java.util.*;

public class Main {

    public static void faktorial(){
        Scanner in = new Scanner(System.in);
        System.out.println("Aplikasi Pencari Faktorial\nMasukkan angka (tak boleh di bawah 0)  ");
        int c, a = in.nextInt();
        while(a<0){
            System.out.println("Input salah. Ulangi");
            a = in.nextInt();
        }
        if (a==0 || a==1){
            System.out.println("Nilai Faktorial = 1");
        }
        else{
            for (c=1; a>1; a--){
                c*=a;
            }
            System.out.println("Nilai Faktorial = " + c);
        }
    }



}
