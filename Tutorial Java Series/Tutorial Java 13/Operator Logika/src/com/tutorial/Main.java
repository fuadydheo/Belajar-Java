package com.tutorial;

public class Main {

    public static void main(String[] args) {
	// Operator Logika --> operasi yang bisa dilakukan kepada tipe data boolean
    /*
    Apa Saja Tipe Data Boolean :
    1. AND
    2. OR
    3. XOR
    4. Negasi
     */

    boolean a,b,c;
    //OR / (||)
        System.out.println("===== OR / (||)");
        a = true;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + "=" + c);

        a = false;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + "=" + c);

        a = true;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + "=" + c);

        a = false;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + "=" + c);

        //AND / (&&)
        System.out.println("===== AND / (&&)");
        a = true;
        b = true;
        c = (a && b);
        System.out.println(a +  " && "  + b + "=" + c);

        a = false;
        b = true;
        c = (a && b);
        System.out.println(a +  " && "  + b + "=" + c);

        a = true;
        b = false;
        c = (a && b);
        System.out.println(a +  " && "  + b + "=" + c);

        a = false;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + "=" + c);


        //XOR / Eksklusif OR (^)
        System.out.println("===== XOR / (^)");
        a = true;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + "=" + c);

        a = false;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + "=" + c);

        a = true;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + "=" + c);

        a = false;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + "=" + c);

        //NOT / negasi --> flipping (!)

        System.out.println("==== NEGASI====");

        a= true;
        c= !a;
        System.out.println(a + " --> (!) =" + c);

        a = false;
        c = !a;
        System.out.println(a + " --> (!) =" + c);


    }
}
