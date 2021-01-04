package com.company.learn;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Romeo and Juliet", "Shakespeare","LitRes",1597,192,45, "softcover"));
        books.add(new Book("Nineteen Eighty-Four", "Orwell","Secker and Warburg",1949,381,70, "hardcover" ));
        books.add(new Book("En man som heter Ove", "Backman","LitRes",2012,330,50,"softcover"));
        books.add(new Book("The Lord of the Rings", "Tolkien","Allen & Unwin",1955,922,100, "hardcover"));
        books.add(new Book("Hamlet", "Shakespeare","Simon Shuster",1603,452,90, "hardcover"));

        Library library = new Library(books);

        System.out.println(library);
        System.out.println();

        Operations.menu(library);
    }
}
