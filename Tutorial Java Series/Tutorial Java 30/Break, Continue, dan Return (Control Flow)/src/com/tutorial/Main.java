package com.tutorial;


public class Main {

    public static void main(String[] args) {
       int a = 0;

       while (true){
           a++;

           if(a == 10){
               break; //ini adalah keyword untuk memaksa keluar dari looping
           }else if (a == 5){
               continue; //ini adalah keyword untuk memaksa memulai aksi dari awal
           }else if (a == 7){

           }


           System.out.println(" looping ke- " + a);
           return;
       }
        System.out.println("akhir dari looping");
    }
}
