package com.tutorial;

public class Main {
    public static void main(String[] args){
    //Operasi Aritmatika
        int variable1 = 10;
        int variable2 = 5;

        int hasil;

        //Penjumlahan

        hasil = variable1 + variable2;
        System.out.println(variable1 + "+" + variable2 + "=" + hasil);

        //Pengurangan
        hasil = variable1 - variable2;
        System.out.println(variable1 + "-" + variable2 + "=" + hasil);
        System.out.printf(" %d - %d = %d \n",variable1,variable2,hasil);

        //Perkalian
        hasil = variable1 * variable2;
        System.out.println(variable1 + "*" + variable2 + "=" + hasil);
        System.out.printf(" %d * %d = %d \n",variable1,variable2,hasil);

        //Pembagian
        hasil = variable1 / variable2;
        System.out.println(variable1 + "/" + variable2 + "=" + hasil);
        System.out.printf(" %d / %d = %d \n",variable1,variable2,hasil);

        float a = 7;
        float b = 3;
        float hasilFloat = a/b;
        System.out.println(a + "/" + b + "=" + hasilFloat);

        //Modulus

        hasil = variable1 % variable2;
        System.out.printf(" %d %% %d = %d \n",variable1,variable2,hasil);




    }
}
