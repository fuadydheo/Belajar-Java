package com.tutorialjava.OOP.abstrac;

public class Rectangel extends Shape {
    private int lenghth,width;

    public Rectangel(int lenghth, int width){
        this.lenghth = lenghth;
        this.width = width;
    }

    public double getArea(){
        return lenghth*width;
    }

    public String toString(){
        return "Rectangle ";
    }

}
