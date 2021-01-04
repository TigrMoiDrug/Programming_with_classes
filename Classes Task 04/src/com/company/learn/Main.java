package com.company.learn;

/*Создайте  класс  Train,  содержащий  поля:  название  пункта  назначения,  номер  поезда,  время  отправления.
        Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
        номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
        Добавьте  возможность  сортировки  массива  по  пункту  назначения,  причем  поезда  с  одинаковыми  пунктами
        назначения должны быть упорядочены по времени отправления.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Train [] trains = new Train[5];

	trains[0] = new Train("Grodno", 2, "10:05");
	trains[1] = new Train("Mohiley", 21, "21:00");
	trains[2] = new Train("Minsk", 8, "13:15");
	trains[3] = new Train("Gomel", 7, "08:30");
	trains[4] = new Train("Mohiley", 4, "12:25");

        System.out.println("Выберете действие: ");
        System.out.println(" 1, если хотите выбрать поезд по номеру");
        System.out.println(" 2, если хотите отсортировать поезда по номерам ");
        System.out.println(" 3, если хотите отсортировать поезда по станциям ");
        Scanner sc = new Scanner( System.in);
        int choice = sc.nextInt();
        if (choice == 1){
            trainFinder(trains);
        }
        else  if (choice == 2){
            sortedTrainNumbers(trains);
        }
        else  if (choice == 3){
            sortedByStation(trains);
        }

        for (int i = 0; i < trains.length; i++){
            System.out.println(trains[i].getStationOfDestination()+" "+trains[i].getTrainNumber()+" "+trains[i].getTimeOfArrival());
        }
    }


    public static void swap (Train [] trains, int i, int j ){
        Train temp;
        temp = trains [i];
        trains[i] = trains[j];
        trains[j] = temp;
    }


// использовал метод compareTo  в методе sortedByStation
// 0 - если оба экземпляра равны;
       // 1 - если дата, метод которой вызывается, находится после даты, которая поступает в метод как параметром;
       // -1 - если дата, метод которой вызывается, находится до даты, которая поступает в метод как параметр.


    public static Train [] sortedByStation (Train [] trains){
        for (int i = 0; i < trains.length; i++) {
            for (int j = trains.length - 1; j > i; j--) {
                int compareResult = trains[i].getStationOfDestination().compareTo(trains[j].getStationOfDestination());
                if (compareResult > 0) {
                    swap(trains, i, j);
                } else if (compareResult == 0) {
                    if (trains[i].getTimeOfArrival().compareTo(trains[j].getTimeOfArrival()) > 0) {
                        swap(trains, i, j);
                    }
                }
            }
        }
        return trains;
    }


    public static Train [] sortedTrainNumbers (Train [] trains){
        boolean isSorted = false;
        Train temp;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < trains.length-1; i++) {
                if(trains[i].getTrainNumber() > trains[i+1].getTrainNumber()){
                    isSorted = false;

                    temp = trains[i];
                    trains[i] = trains[i+1];
                    trains[i+1] =temp;
                }
            }
        }
        return trains;
    }


    public static void trainFinder (Train [] trains ){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for ( int i = 0; i <trains.length; i++){
            trains[i].byNumFinder(num, trains[i]);
        }
    }
}

class Train {

    private String stationOfDestination;
    private int trainNumber;
    private String timeOfArrival;

    public Train (String stationOfDestination, int trainNumber, String timeOfArrival){
        this.stationOfDestination = stationOfDestination;
        this.trainNumber = trainNumber;
        this.timeOfArrival = timeOfArrival;
    }

    public String getStationOfDestination() {
        return stationOfDestination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public String getTimeOfArrival() {
        return timeOfArrival;
    }

    public void byNumFinder (int num, Train train){
        if (train.trainNumber == num){
            System.out.println(train.getStationOfDestination() +" - "+ train.getTrainNumber()+" - "+ train.getTimeOfArrival());
        }
        else {
            System.out.println("Такого поезда нет");
        }
    }

}
