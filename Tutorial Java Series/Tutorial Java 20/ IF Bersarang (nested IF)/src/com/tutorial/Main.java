package com.tutorial;

import java.util.jar.JarOutputStream;

public class Main {

    public static void main(String[] args) {
	// nested if atau if bersarang
        int a = 5;
        int b = 10;

        System.out.println("ini adalah awal dari program");

        if (a == 5){

            if (b == 10){

                System.out.println("Ini Adalah Aksi Dimana a==5 dan b==10");

            } else {

                System.out.println("Ini Adalah Aksi default dimana a==5 dan b bukan sama dengan 10");
            }
        } else {

            System.out.println("ini adalah aksi default, dimana a salah");
        }

        System.out.println("Ini Adalah Akhir Dari Program");
    }
}
