package com.example.tryCatch.ex1;

import com.example.Encapsulation.PhoneExample.Phone;

import java.time.chrono.IsoChronology;

public class Book {
    private int id;
    private String name;
    private String author;

    public Book(){}

    public Book(int id,String name, String author){
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void getData(){
        try {
            if (this.name == null || this.author == null){
                throw new NullPointerException();
            }
            System.out.println("id: " + id + " Name: " + name + " Author: " + author);
        }catch (NullPointerException e){
            System.out.println("пустой книга");;
        }
    }

    @Override
    public String toString() {
        return "Book{id=" + id + ", name='" + name + "', author='" + author + "'}";
    }
}
