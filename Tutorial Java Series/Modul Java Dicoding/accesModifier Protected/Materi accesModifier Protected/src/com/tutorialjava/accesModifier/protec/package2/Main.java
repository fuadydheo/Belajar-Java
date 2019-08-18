package com.tutorialjava.accesModifier.protec.package2;

import com.tutorialjava.accesModifier.protec.package1.kelasA;

public class Main {

    public static void main(String[] args) {
        // Kode ini pasti akan mengalami kompiler error
        kelasA KelasA = new kelasA();
        System.out.println(KelasA.functionB());
      //  System.out.println(KelasA.memberB);
       // System.out.println(KelasA.memberC);
    }

}
