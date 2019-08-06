package com.tutorial;

import  java.util.*;

public class Main {

    public static void main(String[] args) {
	// Membuat Sebuah Objek untuk Menangkap input dari user

        Scanner inputUser = new Scanner(System.in);
        //Membuat Sebuah Program Sedehana Untuk Menangkap Angka
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;

        System.out.println("Masukan Nilai Tebakan Anda!");
        nilaiTebakan = inputUser.nextInt();
        System.out.println("nilai tebakan anda adalah :" + nilaiTebakan);

        //Operasi Logika
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("tebakan anda:" + statusTebakan);

        //Operasi AlJabar Boolean (and / or)
        System.out.println("masukan nilai antara 4 dan 9: ");
        nilaiTebakan = inputUser.nextInt();
        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9);
        System.out.println("tebakan anda :" + statusTebakan);



    }
}
