package com.example.ClassAndObject.BookExample;

public class Book {
    private int id;
    private String bookName;
    private String authorName;

    public Book(){}

    public Book(int id, String bookName, String authorName){
        this.id = id;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public String toString(){
        return "ID: " + id + " BookName: " + bookName + " AuthorName: " + authorName;
    }
}
