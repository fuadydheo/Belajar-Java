package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// Latihan Looping
        int nilaiAwal,nilaiAkhir,total;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukan nilai awal = ");
        nilaiAwal = inputUser.nextInt();
        System.out.print("Masukan nilai akhir = ");
        nilaiAkhir = inputUser.nextInt();

        total = 0;

        while(nilaiAwal <= nilaiAkhir){
            total = total + nilaiAwal;
            System.out.println(" ditambah dengan " + nilaiAwal + " menjadi " + total);
            nilaiAwal++;
        }


    }
}
