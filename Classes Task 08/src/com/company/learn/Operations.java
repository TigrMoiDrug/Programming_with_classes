package com.company.learn;

import java.util.Scanner;

public class Operations {

    public static void menu (ListOfCustomers list){
        Scanner sc = new Scanner(System.in);
        System.out.println(" 1 - получить список клиентов по алфавиту \n" +
                "2 - пулучить список клиентов по выбранному диапазону карт. ");
        int selector = sc.nextInt();

        if (selector == 1){
            list.sortByAlphabet();
            System.out.println(list);
        }
        else if (selector == 2){
            System.out.println("Введите диапазок номеров карт \n" +
                    "c : ");
            int from = sc.nextInt();

            System.out.println("по : ");
            int to = sc.nextInt();

            System.out.println(list.searchInCards(from, to));

        }
        else {
            System.out.println("Такой операции нет.");
        }
    }
}
