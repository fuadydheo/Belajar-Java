package com.tutorialjava.OOP.composition;


public class Author {
   private String name;
   private String email;
   private char gender;

    public Author (String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        if(this.gender =='M'){
            return "Male";
        }
            return "Female";
    }
}
