package com.tutorial;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(simpel());

        fungsiVoid(" apapun ");
        apaKabar(" Bella ");
        apaKabar(" Dheo ");

    }
    private static void apaKabar(String nama){
        System.out.println("apa kabar" + nama);
    }

    //fungsi atau method tampa kembalian
    private static void fungsiVoid(String input){
        System.out.println(input);
    }
    //fungsi atau method dengan kembalian
    //sehingga menggunakan return untul
    //megembalikan nilainya (10.0f)
    private static float simpel(){
        return 10.0f;

    }
}
