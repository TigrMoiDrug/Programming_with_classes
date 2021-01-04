package com.company.learn;

import java.util.Scanner;

public class Operations {

    public static void menu (Library library){
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - получить список книг заданного автора \n" +
                "2 - пулучить список книг заданного издательства \n" +
                "3 - список книг, выпущенных после заданного года. ");

        int selector = sc.nextInt();

        if (selector == 1){
            System.out.println("Введите фамилию автор: ");
            String author = sc.next();
            System.out.println(library.searchBooksByAuthor(author));
        }

        else if (selector == 2){
            System.out.println("Введите название издательства: ");
            String publisher = sc.next();
            System.out.println(library.searchBooksByPublisher(publisher));
        }

        else if (selector == 3){

            System.out.println("Введите год : ");
            int year = sc.nextInt();
            System.out.println(library.searchBooksByYear(year));
        }

        else {
            System.out.println("Такой операции нет.");
        }
    }
}
