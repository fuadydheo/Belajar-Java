package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// mengenal array lebih dalam

        int[] arrayAngka1 = {1,2,3,4,5};
        int[] arrayAngka2 = new int[5];

        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);

        arrayAngka2 = arrayAngka1; // dia akan memberikan reference nya atau tidak meberikan nilai tapi memberikan adress

        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);


        System.out.println("Arrays 1 --> " + Arrays.toString(arrayAngka1));
            System.out.println("Arrays 2 --> " + Arrays.toString(arrayAngka2));

         arrayAngka1[0] =  100;
        arrayAngka2[4] =  600;
            System.out.println("Arrays 1 --> " + Arrays.toString(arrayAngka1));
            System.out.println("Arrays 2 --> " + Arrays.toString(arrayAngka2));



    }
}
