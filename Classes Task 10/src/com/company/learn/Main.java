package com.company.learn;
/*
  Создать класс Airline, спецификация которого приведена ниже. Определить конст рукторы, set- и get- методы
  и метод  toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
  методами. Задать критерии выбора данных и вывести эти данные на консоль.
    Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
     Найти и вывести:
    a) список рейсов для заданного пункта назначения;
     b) список рейсов для заданного дня недели;
     c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Airline> planes = new ArrayList<>();

        planes.add(new Airline("Москва", 1, "Sukhoi SuperJet-100", "10:00", "Вторник"));
        planes.add(new Airline("Минск", 2, "Airbus 310", "12:00", "Понедельник"));
        planes.add(new Airline("Киев", 3, "Boeing-747", "23:00", "Вторник"));
        planes.add(new Airline("Варшава", 4, "Airbus 320", "15:20", "Пятница"));
        planes.add(new Airline("Вильнюс", 5, "Airbus 310", "18:10", "Среда"));

        Schedule schedule = new Schedule(planes);
        System.out.println(schedule);
        System.out.println();

        Operations.menu(schedule);
    }
}
