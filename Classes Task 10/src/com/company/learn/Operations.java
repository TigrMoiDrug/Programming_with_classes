package com.company.learn;

import java.util.Scanner;

public class Operations {

    public static void menu (Schedule schedule){
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - получить список рейсов для пункта назначения \n" +
                "2 - пулучить список рейсов для дня недели \n" +
                "3 - список рейсов для дня неделеи и позже заданного времени ");

        int selector = sc.nextInt();

        if (selector == 1){
            System.out.println("Введите пункт назначения: ");
            String destination = sc.next();
            System.out.println(schedule.searchPlanesByDestination(destination));
        }

        else if (selector == 2){
            System.out.println("Введите день недели: ");
            String day = sc.next();
            System.out.println(schedule.searchPlanesByDay(day));
        }

        else if (selector == 3){

            System.out.println("Введите день недели: ");
            String day = sc.next();
            System.out.println("Введите время: ");
            String time = sc.next();
            System.out.println(schedule.searchPlanesByDayAndTime(schedule.searchPlanesByDay(day), time ));
        }

        else {
            System.out.println("Такой операции нет.");
        }
    }
}
