package com.company.learn;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private int year;
    private int numberOfPages;
    private int price;
    private String cover;
    private int id;
    private static int incrementID;

    public Book (String title, String author, String publisher, int year, int numberOfPages,
                 int price, String cover){

        id = incrementID++;

        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.cover = cover;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String toString () {
        String string = "";
        string = string + id + " - " + title + " " + author + " " + publisher + ". "
                + numberOfPages + " страниц ; " + year + " , " + cover + "\n" ;
        return string;
    }
}
