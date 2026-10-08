package com.example.ClassAndObject.BookExample;

public class Library {
    private Book[] books = new Book[3];
    private int i = 0;

    public void addBook(Book book){
        books[i] = book;

        System.out.println(book.toString());
    }

}
