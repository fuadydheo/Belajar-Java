package com.tutorial;

public class Main {

    public static void main(String[] args) {
	// Operator Komparasi, ini akan menghasilkan nilai dalma bentuk boolean
        /*
        oprator komparasi a==b atau bisa dibuat dengan yang lain juga c==d, merupakan operator
        untuk menghasilkan nilai boolean yaitu true atau false
         */
        System.out.println("=====Persamaan====");
        int a,b;
        boolean hasilKomparasi;
        a = 10;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf(" %d apakah sama dengan %d? %s \n", a,b, hasilKomparasi);

       int c,d;
       boolean ResultKomparasi;
       c = 15;
       d = 20;
       ResultKomparasi = (c==d);
       System.out.printf(" %d apakah sama dengan %d? %s \n", c,d, ResultKomparasi);

       //Opertor equal atau Persamaan, Penulisan lebih sederhana

        int e,f;
        boolean hasilAkhirKomparasi;
        e = 10;
        f = 10;
        hasilAkhirKomparasi = (e == f);
        System.out.printf(" %d == %d --> %s \n", e,f, hasilAkhirKomparasi);

        // Operator Pertidaksamaan / Not Equal

        System.out.println("=====Pertidaksamaan====");
        int g,h;
        boolean endofKomparasi;
        g = 10;
        h = 10;
        endofKomparasi = (g != h);
        System.out.printf(" %d != %d --> %s \n", g,h, endofKomparasi);

        int i,j;
        boolean endKomparasi;
        i = 15;
        j = 10;
        endKomparasi = (i != j);
        System.out.printf(" %d != %d --> %s \n", i,j, endKomparasi);

        // Operator Less Than/ Kurang Dari
        System.out.println("------Pertidaksamaan------");
        System.out.println("-----Kurang Dari----");
        int k,l;
        boolean sudahKomparasi;

        k = 25;
        l = 30;
        sudahKomparasi = (k<l);
        System.out.printf(" %d < %d --> %s \n", k,l, sudahKomparasi);

        //Greater Than / Lebih Dari
        System.out.println("------Lebih dari---");
        k = 25;
        l = 30;
        sudahKomparasi = (k>l);
        System.out.printf(" %d > %d --> %s \n", k,l, sudahKomparasi);

        k = 25;
        l = 30;
        sudahKomparasi = (l>k);
        System.out.printf(" %d > %d --> %s \n", l,k, sudahKomparasi);

        // Operator Less Than/ Kurang Dari
        System.out.println("------Pertidaksamaan------");
        System.out.println("-----Kurang Dari Sama Dengan ----");

        k = 25;
        l = 30;
        sudahKomparasi = (k<=l);
        System.out.printf(" %d < %d --> %s \n", k,l, sudahKomparasi);

        k = 30;
        l = 30;
        sudahKomparasi = (k<=l);
        System.out.printf(" %d < %d --> %s \n", k,l, sudahKomparasi);

        k = 40;
        l = 30;
        sudahKomparasi = (k<=l);
        System.out.printf(" %d < %d --> %s \n", k,l, sudahKomparasi);

        //Greater Than / Lebih Dari
        System.out.println("------Lebih dari Sama Dengan---");
        k = 25;
        l = 30;
        sudahKomparasi = (k>=l);
        System.out.printf(" %d > %d --> %s \n", k,l, sudahKomparasi);

        k = 30;
        l = 30;
        sudahKomparasi = (k>=l);
        System.out.printf(" %d > %d --> %s \n", k,l, sudahKomparasi);

        k = 25;
        l = 30;
        sudahKomparasi = (l>=k);
        System.out.printf(" %d > %d --> %s \n", l,k, sudahKomparasi);


    }
}
