package com.company;

class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[10];
        this.no_of_books = 0;
    }

    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added!");
    }

    void showAvailableBooks(){
        System.out.println("Available Books are:");
        for (String book : this.books){
            if (book == null){
                continue;
            }
            System.out.println("* " + book);
        }
    }

    void issueBook(String book){
        for (int i = 0; i < this.books.length; i++){
            if (this.books[i].equals(book)){
                System.out.println("The book has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book doesn't exist!");
    }

    void returnBook(String book){
        addBook(book);
    }
}


public class cwh_61_ex4sol {
    static void main(String[] args) {
        // You have to implement a library using Java Class Library
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties : Array to store the available books
        // Array to store the issued books

        Library library = new Library();
        library.addBook("The Lord of the Rings");
        library.addBook("Algorithms");
        library.addBook("C++");
        library.addBook("Java");
        library.addBook("Python");
        library.showAvailableBooks();

        library.issueBook("Java");
        library.showAvailableBooks();

        library.returnBook("Java");
        library.showAvailableBooks();


    }
}
