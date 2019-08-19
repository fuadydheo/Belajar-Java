package com.tutorialjava.OOP.composition;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty;

    public Book(String name, Author author, double price, int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String toString(){
        return this.name + " by " + this.author.getName() + " " + this.author.getGender()
                + " " + this.author.getEmail();

    }
}
