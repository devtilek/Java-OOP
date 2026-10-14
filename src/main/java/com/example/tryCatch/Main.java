package com.example.tryCatch;

import com.example.tryCatch.ex1.Book;
import com.example.tryCatch.ex1.Library;

public class Main {
    static void main() {
        Book b1 = new Book(1,"Ertegiler","Maga");
        Book b2 = new Book(2,"Skazka","Maga");
        Book b3 = new Book(3,"Bumazhni dom","Maga");
        Book b4 = new Book(4,"Freedom","Maga");
        b1.getData();
        Book b5 = new Book();
        b2.getData();

        Library l1 = new Library();
        l1.addBook(b1);
        l1.addBook(b2);
        l1.addBook(b3);
        l1.addBook(b4);
        l1.addBook(b5);

        l1.printAllBooks();

    }
}
