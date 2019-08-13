package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// Operasi Pada array

        int[] arrayAngka1 = {1,2,3,4,5};

        // merubah array menjadi string
        System.out.println("\nMerubah Array Menjadi String\n=============");
        printArray(arrayAngka1);

        //mengkopi array
        System.out.println("\nMengkopi Array\n=============");
        int[] arrayAngka2 = new int[5];
        printArray(arrayAngka1);
        printArray(arrayAngka2);
        System.out.println("\nMengkopi dengan loop\n=========");
        for(int i=0; i < arrayAngka1.length; i++){
            arrayAngka2[1] = arrayAngka1[1];
        }
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka2);
        System.out.println(arrayAngka2);

        System.out.println("\nmengkopi dengan copyOf\n=========");
       int[] arrayAngka3 = Arrays.copyOf(arrayAngka1,3);
       printArray(arrayAngka1);
       System.out.println(arrayAngka1);
       printArray(arrayAngka3);
       System.out.println(arrayAngka3);

        System.out.println("\nMenkgkopi dengan copyOf Range\n======");
        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1,3,5);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka4);
        System.out.println(arrayAngka4);

        //fill arrray
        System.out.println("\nFill array\n============");
        int[] arrayAngka5 = new int[10];
        printArray(arrayAngka5);
        Arrays.fill(arrayAngka5,1);
        printArray(arrayAngka5);

        //komparasi array
        System.out.println("\nKomparasi array\n============");
        int[] arrayAngka6 = {1,2,3,4,5};
        int[] arrayAngka7 = {1,2,3,9,5};

        System.out.println("\nMembandingkan antara dua buah Array\n=====");
        System.out.println(Arrays.equals(arrayAngka6,arrayAngka7));

        if (arrayAngka6 == arrayAngka7){
            System.out.println("array ini sama");
        } else{
            System.out.println("array ini beda");
        }

        System.out.println("\nMemeriksa Mana Array yang lebih besar");
        System.out.println(Arrays.compare(arrayAngka6,arrayAngka7));

        System.out.println("\nMemeriksa Mana index yang berbeda");
        System.out.println(Arrays.mismatch(arrayAngka6,arrayAngka7));

        //sort array
        System.out.println("\nSort Array\n============");
        int[] arrayAngka8 = {1,2,3,4,5,6,8,6,7,9};
        printArray(arrayAngka8);
        Arrays.sort(arrayAngka8);
        printArray(arrayAngka8);

        //search Array
        System.out.println("\n Search Array\n========");


        int angka = 3;
        int posisi = Arrays.binarySearch(arrayAngka8,angka);
        System.out.println("angka " + angka + " ada di index " + posisi );




    }

    private static void printArray(int[] dataArray){
        System.out.println("array = " + Arrays.toString(dataArray));
    }
}
