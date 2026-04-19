package com.company;

import java.util.ArrayList;

/*
        Create a Library management system which is capable of issuing books to the students.
        Book should have info like:
        1. Book name
        2. Book Author
        3. Issued to
        4. Issued on
        User should be able to add books, return issued books, issue books
        Assume that all the users are registered with their names in the central database
         */
class Book {
    public String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return name.equals(book.name) && author.equals(book.author);
    }
    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", author=" + author + '}';
    }
}
    class MyLibrary{
        public ArrayList<Book> books;
        public MyLibrary(ArrayList<Book> books){
            this.books = books;
        }
        public void addBook(Book book){
            System.out.println("The book has been added to the library");
            this.books.add(book);
        }
        public void issueBook(Book book, String issued_to){
            System.out.println("The book has been issued from the library to " + issued_to);
            this.books.remove(book);
        }
        //Fix: Overload issueBook() to accept a name + author
        //Add a second version of the method that searches by name and author:
        public void issueBook(String bookName, String bookAuthor, String issued_to) {
            Book found = null;
            for (Book b : this.books) {
                if (b.name.equals(bookName) && b.author.equals(bookAuthor)) {
                    found = b;
                    break;
                }
            }
            if (found != null) {
                System.out.println("The book has been issued to " + issued_to);
                this.books.remove(found);
            } else {
                System.out.println("Book not found in the library!");
            }
        }
        public void returnBook(Book book){
            System.out.println("The book has been returned to the library");
            this.books.add(book);
        }
        public void  returnBook(String bookName, String bookAuthor, String issued_to) {
            Book found = null;
            for (Book b : this.books) {
                if (b.name.equals(bookName) && b.author.equals(bookAuthor)) {
                    System.out.println("Book already exists in the library!");
                    return;
                }
            }
            this.books.add(new Book(bookName, bookAuthor));
            System.out.println("The book " + bookName + " has been returned to the library!");
        }
    }


public class cwh_113_ex7sol {
    static void main(String[] args) {
        //Exercise 7 solution
        ArrayList<Book> books = new ArrayList<>();
        Book b1 = new Book("Algorithms","CLRS");
        books.add(b1);
        Book b2 = new Book("Algorithms2","CLRS2");
        books.add(b2);
        Book b3 = new Book("Algorithms3","CLRS3");
        books.add(b3);
        Book b4 = new Book("Algorithms4","CLRS4");
        books.add(b4);

        MyLibrary myLibrary = new MyLibrary(books);
        myLibrary.addBook(new Book("algo4","myAuthor"));
        System.out.println(myLibrary.books);
        myLibrary.issueBook(b4,"Ashutosh Abhinav");
        System.out.println(myLibrary.books);
        myLibrary.issueBook("algo4","myAuthor","Ashutosh Abhinav");
        System.out.println(myLibrary.books);
        myLibrary.returnBook(b4);
        System.out.println(myLibrary.books);
        myLibrary.returnBook("algo4","myAuthor","Ashutosh Abhinav");
        System.out.println(myLibrary.books);
        myLibrary.addBook(new Book("algo5","myAuthor5"));
        System.out.println(myLibrary.books);


    }
}
