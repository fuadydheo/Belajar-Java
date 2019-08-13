package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// Rekursif
        System.out.println("test");

        Scanner userInput = new Scanner(System.in);
        System.out.print("masukan nilai: ");
        int nilai = userInput.nextInt();
        System.out.println("anda memasukan nilai = " + nilai);

    // Fungsi Rekursif Sederhana


    }

    private static void printNilai(int parameter){
        System.out.println("nilai = " + parameter);

        if (parameter == 0){
            return;
        }

        parameter--;

        printNilai(parameter);
    }
}
