package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// Array Multi Dimensi
        int[][] array_2D = {
                {1,2,3},
                {4,5,6},
        };

        System.out.println(array_2D);
        System.out.println(Arrays.toString(array_2D));

        char[] array_char1 = {'a', 'b', 'c'};
        char[] array_char2 = { 'd', 'e'};

        char[][] arrayChar_2D = {
                array_char1,
                array_char2,
        };

        System.out.println(arrayChar_2D);
        System.out.println(Arrays.toString(array_char2));
    }
}
