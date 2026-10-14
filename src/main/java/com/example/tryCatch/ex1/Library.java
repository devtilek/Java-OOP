package com.example.tryCatch.ex1;

public class Library {
    private String name;
    private String city;
    private Book[] books = new Book[3];
    private int indexOfBook = 0;

    public Library(){

    }

    public Library(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void addBook(Book book){
        try {
            if (indexOfBook >= books.length){
                throw new ArrayIndexOutOfBoundsException();
            }
            if (book != null){
                books[indexOfBook] = book;
                indexOfBook++;
                System.out.println("Successful");
            }
        }catch (Exception e){
            System.out.println("Library if FULL");
        }
    }

    public void printAllBooks(){
        if (indexOfBook == 0){
            System.out.println("Library is Empty!");
        }else {
            for (int i = 0; i < books.length; i++) {
                if (books[i] != null){
                    System.out.println(books[i]);
                }
            }
        }
    }
}
