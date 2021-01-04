package com.company.learn;
/*
  Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
  метод  toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
  методами. Задать критерии выбора данных и вывести эти данные на консоль.
     Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
     Найти и вывести:
     a) список книг заданного автора;
     b) список книг, выпущенных заданным издательством;
 *   c) список книг, выпущенных после заданного года.
 */
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> library;
    public Library(ArrayList<Book> library) {        // конструктор
        this.library = library;
    }

    public ArrayList<Book> getLibrary() {
        return library;
    }

    public String toString (){
        return "List of books: \n" +
                ""+ library + ".";
    }

    public ArrayList<Book> searchBooksByAuthor (String searchedAuthor){
        ArrayList <Book> searchResult = new ArrayList<>();

        for (Book book : library ){
            if(book.getAuthor().equals(searchedAuthor)){
                searchResult.add(book);
            }
        }
        return searchResult;
    }

    public ArrayList<Book> searchBooksByPublisher (String searchedPublisher){
        ArrayList <Book> searchResult = new ArrayList<>();

        for (Book book : library ){
            if(book.getPublisher().equals(searchedPublisher)){
                searchResult.add(book);
            }
        }
        return searchResult;
    }

    public ArrayList<Book> searchBooksByYear (int year){
        ArrayList <Book> searchResult = new ArrayList<>();

        for (Book book : library ){
            if(book.getYear() > year){
                searchResult.add(book);
            }
        }
        return searchResult;
    }

}
