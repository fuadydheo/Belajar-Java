package com.latihan;

import java.util.*;

public class FPB {

    public static void faktorialPembagian() {

        Scanner in = new Scanner(System.in);
        System.out.println("Aplikasi Mencari FPB");

        int a,b,c;
        System.out.println("Masukkan nilai pertama");
        a = in.nextInt();
        System.out.println("Masukkan nilai kedua");
        b = in.nextInt();

        while(b>0){
            c=a%b;
            a=b;
            b=c;
        }

        System.out.println("FPB kedua bilangan = " + a);



    }
}
