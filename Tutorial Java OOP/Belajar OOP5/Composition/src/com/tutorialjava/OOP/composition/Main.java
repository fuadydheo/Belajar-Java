package com.tutorialjava.OOP.composition;



public class Main {
    public static void main(String[] args) {
        Author a = new Author("dheo","fuadydheo@gmail.com",'M');
        Book b = new Book("kancil",a,50000,9);
        System.out.println(b);
    }
}
