package com.company;

import com.dicoding.gitar;
import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;


public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");

        gitar.bunyi();

        Date today = new Date();
        System.out.println("Hari ini = " + today);
        Date tomorrow = DateUtils.addDays(today,1);
        System.out.println("Besok = " + tomorrow);

    }
}
