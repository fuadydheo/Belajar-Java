package com.tutorial;

public class Main {

    public static void main(String[] args) {
	// Belajar Loooping Dasar

//        while (kondisi) {
//            aksi
//        }
        int a = 0;
        boolean kondisi = true;

        System.out.println("awal program");
        while (kondisi) {
            System.out.println("while loop ke- " + a);
            a++;

            if (a == 10){
                kondisi = false;
            }

        }


    }
}
