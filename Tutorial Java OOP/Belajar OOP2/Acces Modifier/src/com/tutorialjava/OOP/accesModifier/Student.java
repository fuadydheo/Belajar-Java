package com.tutorialjava.OOP.accesModifier;

public class Student {
    protected String name;
    private double gpa;

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

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setGpa(double gpa){
        this.gpa = gpa;
    }


}
