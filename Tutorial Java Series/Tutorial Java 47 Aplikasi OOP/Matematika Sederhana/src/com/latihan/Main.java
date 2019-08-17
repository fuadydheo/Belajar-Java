package com.latihan;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pengimplementasi dari OOP");

        FPB panggil = new FPB();
        panggil.faktorialPembagian();

        bilanganPrima memanggil = new bilanganPrima();
        memanggil.Prima();

        Pangkat meminta = new Pangkat();
        meminta.pangkatBilangan();

        Urutan mengundang = new Urutan();
        mengundang.urutanBilangan();

    }
}
