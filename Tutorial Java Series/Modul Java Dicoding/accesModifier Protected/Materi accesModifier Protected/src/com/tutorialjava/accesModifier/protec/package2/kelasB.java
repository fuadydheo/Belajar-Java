package com.tutorialjava.accesModifier.protec.package2;

import com.tutorialjava.accesModifier.protec.package1.kelasA;

public class kelasB {
    public static void main(String[] args) {

        // Kode ini pasti akan mengalami kompiler error

        kelasA KelasA = new kelasA();

        //System.out.println(kelasA.functionB());

        //System.out.println(kelasA.memberB);
        //System.out.println(kelasA.memberC);

        kelasB KelasB = new kelasB();
        KelasB.methodC();

    }
}
