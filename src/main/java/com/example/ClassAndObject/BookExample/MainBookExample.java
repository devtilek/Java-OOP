package com.example.ClassAndObject.BookExample;

public class MainBookExample {
    static void main() {
        Book b1 = new Book(1, "MagaXikaya", "Magamed");
        Book b2 = new Book(2, "MagaMed", "Magamed Magamedov");
        Book b3 = new Book(3, "MagaHos", "Magamed Husanov");

       Library l1 = new Library();

       l1.addBook(b1);
       l1.addBook(b2);
       l1.addBook(b3);

    }
}
