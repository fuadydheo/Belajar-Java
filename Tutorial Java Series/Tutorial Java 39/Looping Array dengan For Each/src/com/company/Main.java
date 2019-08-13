package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// looping array dengan for each

        int[] arrayAngka = {11,23,43,56,78,88,67,45,67,54,33,56};

        // menggunakan looping standard
            System.out.println("Loping Standard");
        for(int i=0; i<10; i++){
            System.out.println("index ke-" + i + " adalah = " + arrayAngka[i]);
        }

            System.out.println(arrayAngka.length);
            System.out.println("\n");


            System.out.println("looping menggunakan properti lenght");
        // looping dengan properti dari array nya
        for(int i = 0; i < arrayAngka.length; i++){
            System.out.println("index ke-" + i + " adalah = " + arrayAngka[i]);

        }

        System.out.println("\n");

        // looping khusus untuk collection <-- array
        // kapan menggunakan for each ketika sebuah index tidak berguna lagi dan kita hanya perlu pengulangan tanpa megambil indexnya
        System.out.println(" looping dengan for each ");
        for( int angka : arrayAngka ){
            System.out.println("ini adalah angka pada looping ini = " + angka);
        }


    }
}
