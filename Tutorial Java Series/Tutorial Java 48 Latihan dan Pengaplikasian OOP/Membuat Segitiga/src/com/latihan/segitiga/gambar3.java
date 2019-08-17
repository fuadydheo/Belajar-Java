package com.latihan.segitiga;

public class gambar3 {
    public static void sgt (){
        System.out.println();
        System.out.println("@");

        for( int i = 5 ; i >= 1; i--){
            System.out.print("@");
            for( int j = 5; j >= i; j--){
                System.out.print("  ");
            }
            System.out.println("@");
        }
        for ( int j = 5; j > 0; j--){
            System.out.print("@  ");
        }
    }
}
