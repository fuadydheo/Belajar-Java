package com.latihan;

import java.util.*;

public class Urutan {
    public static void urutanBilangan() {

        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan banyak nilai yang ingin diinputkan");
        int a = in.nextInt();
        int b[]= new int[a+1];
        for (int i=0; i<a; i++){
            System.out.println("Masukkan angka ke-" + (i+1));
            b[i]= in.nextInt();
        }
        for (int j=0, k; j<a; j++){
            for(int l=0; l<a; l++) {
                if (b[l] < b[l + 1]) {
                    k = b[l];
                    b[l] = b[l + 1];
                    b[l + 1] = k;
                }
            }
        }
        for (int j=0; j<a; j++){
            System.out.print(b[j] + " ");
        }

    }
}
