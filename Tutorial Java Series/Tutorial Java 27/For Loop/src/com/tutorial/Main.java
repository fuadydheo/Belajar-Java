package com.tutorial;

public class Main {

    public static void main(String[] args) {
	// for loop basic
 // Template for loop
//        for (inisialisasi; kondisi; step nilai) {
//                aksi;
//        }

        System.out.println("ini adalah awal program");

        System.out.println("ini adalah loop pertama");

        for (int nilai = 0; nilai <= 10; nilai++){

            System.out.println("ini adalah for loop ke - " + nilai);

        }

        System.out.println("ini adalah loop kedua");

        for (int nilai = 0; nilai < 10; nilai++){

            System.out.println("ini adalah for loop ke - " + nilai);

        }

        System.out.println("ini adalah loop pertama");

        for (int nilai = 0; nilai <= 10; nilai++){

            System.out.println("ini adalah for loop ke -" + nilai);

        }

        System.out.println("ini adalah loop keempat ");
        int nilai = 10;
        for (; nilai >= 5; nilai--){

            System.out.println("ini adalah for loop ke - " + nilai);

        }
            System.out.println("ini adalah akhir program ");
    }
}
