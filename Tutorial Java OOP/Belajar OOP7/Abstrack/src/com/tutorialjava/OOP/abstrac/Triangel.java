package com.tutorialjava.OOP.abstrac;

public class Triangel extends Shape {
    private int base,height;

    public Triangel(int base, int height){
        this.base = base;
        this.height = height;
    }

    public double getArea(){
        return 0.5*base*height;
    }

    public String toString(){
        return "Triangle";
    }
}
