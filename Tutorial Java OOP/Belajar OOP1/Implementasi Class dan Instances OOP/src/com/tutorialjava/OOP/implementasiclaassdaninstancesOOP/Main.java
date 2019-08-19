package com.tutorialjava.OOP.implementasiclaassdaninstancesOOP;

public class Main {
    public static void main(String[] args) {
        Student smamutiara = new Student("Dheo",4.00);
        System.out.println(smamutiara.getName());

        Student smacendana = new Student("icun");
        System.out.println(smacendana.getName());

        Student smansa = new Student(4);

        Student smanda = new Student();



    }
}
