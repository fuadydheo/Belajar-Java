package com.javafundamental.obyek;

public class Main {
    public static void main(String[] args) {
        Hewn Elang = new Hewn("Elang");
        Hewn Kucing = new Hewn("Kucing");
        Elang.beratHewan(5);
        Elang.jumlahKakiHewan(2);
        Elang.cetakHewan();
        Kucing.beratHewan(2);
        Kucing.jumlahKakiHewan(4);
        Kucing.cetakHewan();
    }
}
