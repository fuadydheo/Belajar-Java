package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// Belajar Switch Case
    // eksperinya berupa satuan (int,long,short) atau string atau enum
    String input;

    Scanner inputUser = new Scanner(System.in);

    System.out.print("panggil nama: ");
    input = inputUser.next();


    // eksperinya berupa satuan (int,long,short) atau string atau enum
    switch(input){
        case " otong " :
            System.out.println("oi apa?");
            break;
        case " ucup " :
            System.out.println("iya ane");
            break;
        case " oyong " :
            System.out.println("oi oi");
            break;
        default:
            System.out.println(input + " gimana? gimana? ");
        }

    }
}
