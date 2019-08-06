package com.tutorial;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int nilaiInt = 12; //ini 32 bit
        System.out.println("nilai int = " + nilaiInt);
    // Memperluas Rentang ke Tipe Data yang Lebih Besar
        long nilaiLong = nilaiInt;
        System.out.println("nilai Long = " + nilaiLong);
    //Memperkecil Rentang ke tipe data yang lebih kecil
        byte nilaiByte = (byte) nilaiInt;
        System.out.println("nilai byte =" + nilaiByte);
        System.out.println("nilai max Byte =" + Byte.MAX_VALUE);
        System.out.println("nilai max Byte =" + Byte.MIN_VALUE);

     //casting pembagian
        int a = 10;
        float b = 4;

        float c = a/b;
        System.out.printf(" %d / %f = %f\n",a,b,c);

        int x = 10;
        int y = 4;

        float z = (float) x/y;
        System.out.printf(" %d / %d = %f\n",x,y,z);
    }
}
