package com.tutorialjava.OOP.implementasiclaassdaninstancesOOP;

public class Student {
    String name;
    double gpa;

    Student(){

    }

    Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;

    }

    Student(String name){
        this.name = name;
    }

    Student(double gpa){
        this.gpa = gpa;
    }

    String getName(){
        return name;
    }

    void setGpa(double gpa){
        this.gpa = gpa;
    }


}
