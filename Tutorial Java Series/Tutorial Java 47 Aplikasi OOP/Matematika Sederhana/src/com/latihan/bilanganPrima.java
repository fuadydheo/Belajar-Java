package com.latihan;

import java.util.*;

public class bilanganPrima {
    public static void Prima() {
        Scanner in = new Scanner(System.in);
        int a, c=0, d;
        System.out.println("Aplikasi mencari Bilangan Prima\nInput bilangan (di atas 1)");
        a= in.nextInt();
        while(a<2){
            System.out.println("Ulangi input");
            a=in.nextInt();
        }
        if(a==2){
            System.out.println("Bilangan prima");
        }
        else {
            for(int b=2; b<a; b++){
                if(a%b==0){
                    c++;
                }
            }
            if(c==0) {
                System.out.println("Bilangan prima");
            }
            else{
                System.out.println("Bukan bilangan prima");
            }
        }
    }
}
