package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Membuat Perhitungan Menghitung Luas Persegi Panjang
        //Java itu paradigmanya secara full mendukung object oriented programming
        // Pada Java kita bisa membuat object dan membuat class
        // Itulah alasannya setiap file di java ada class didepannya
        // akan akan memakai kelas kelas yang sudah dibuatkan namanya library contohnya scanner

        Scanner userInput = new Scanner(System.in);
        int panjang,lebar,luas, tinggi, volume;

        System.out.println("=====MENGHITUNG LUAS======");
        System.out.print("panjang =");
        panjang = userInput.nextInt();
        System.out.print("lebar =");
        lebar = userInput.nextInt();
        luas = panjang * lebar;
        System.out.println("luas =" + luas);

        System.out.println("=====MENGHITUNG Volume======");
        System.out.print("tinggi =");
        tinggi = userInput.nextInt();
        volume = luas * tinggi;
        System.out.println("Volume =" + volume);
    }
}
