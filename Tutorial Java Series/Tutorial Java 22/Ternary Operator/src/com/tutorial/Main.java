package com.tutorial;

import java.util.*;
public class Main {

    public static void main(String[] args) {
	// Ternary Operator


    int input, x;

    Scanner inputUser = new Scanner(System.in);

    System.out.print("Masukan Nilai: ");
    input = inputUser.nextInt();

    // Variable x = ekspresi ? statement true : statement false
     x = ( input == 10 ) ? (input+input) : (input/2);
     System.out.println("hasilnya  " + x);

    }
}
