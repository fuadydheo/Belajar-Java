package com.tutorialjava.OOP.accesModifier;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("dheo");
        s1.name = "ani";
        System.out.println(s1.getName());
    }
}
