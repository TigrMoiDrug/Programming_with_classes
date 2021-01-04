package com.company.learn;
/*
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
 * Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Client dmitry = new Client("Дмитрий");

        Agency agency = new Agency();

        agency.addClient(dmitry);

        agency.addToPackages(new TravelPackage(Options.Food.BREAKFAST, Options.Transport.BUS,
                Options.TypeOfTour.EXCURSION, 4, 70, "Краков", "Польша"));

        agency.addToPackages(new TravelPackage(Options.Food.WITHOUT, Options.Transport.BUS,
                Options.TypeOfTour.SHOPPING, 2, 30, "Варшава", "Польша"));

        agency.addToPackages(new TravelPackage(Options.Food.BREAKFAST_AND_DINNER, Options.Transport.PLANE,
                Options.TypeOfTour.EXCURSION, 7, 200, "Париж", "Франция"));

        agency.addToPackages(new TravelPackage(Options.Food.BREAKFAST_AND_DINNER, Options.Transport.BUS,
                Options.TypeOfTour.RECREATION, 7, 140, "Берлин", "Германия"));

        agency.addToPackages(new TravelPackage(Options.Food.BREAKFAST_AND_DINNER, Options.Transport.TRAIN,
                Options.TypeOfTour.RECREATION, 14, 500, "Гданьск", "Польша"));

        agency.addToPackages(new TravelPackage(Options.Food.BREAKFAST_AND_DINNER, Options.Transport.SHIP,
                Options.TypeOfTour.CRUISE, 30, 2400, "Генуя", "Италия"));

        agency.addToPackages(new TravelPackage(Options.Food.BREAKFAST_AND_DINNER, Options.Transport.BUS,
                Options.TypeOfTour.TREATMENT, 14, 400, "Санкт-Петербург", "Россия"));

        agency.printAll();


        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Введи 1 для выбора путёвки по количеству дней\n" +
                "2 для выбора по питанию\n" +
                "3 для выбора по виду транспорта\n" +
                "4 для сортировки по количеству дней\n" +
                "5 для сортировки по цене: ");

        int choice = sc.nextInt();

        agency.selector(choice);

    }
}
