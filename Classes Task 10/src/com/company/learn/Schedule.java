package com.company.learn;

import java.util.ArrayList;

public class Schedule {
    private ArrayList<Airline> schedule;

    public Schedule(ArrayList<Airline> schedule) {        // конструктор
        this.schedule = schedule;
    }

    public ArrayList<Airline> getSchedule() {
        return schedule;
    }

    public String toString (){
        return "Schedule: \n" +
                ""+ schedule + ".";
    }

    public ArrayList<Airline> searchPlanesByDestination (String searchedDestination){
        ArrayList <Airline> searchResult = new ArrayList<>();

        for (Airline airline : schedule ){
            if(airline.getDestination().equals(searchedDestination)){
                searchResult.add(airline);
            }
        }
        return searchResult;
    }

    public ArrayList<Airline> searchPlanesByDay (String searchedDay){
        ArrayList <Airline> searchResult = new ArrayList<>();

        for (Airline airline : schedule ){
            if(airline.getDay().equals(searchedDay)){
                searchResult.add(airline);
            }
        }
        return searchResult;
    }

    public ArrayList<Airline> searchPlanesByDayAndTime (ArrayList <Airline> searchBooksByDay, String time){
        ArrayList <Airline> searchResult = new ArrayList<>();

        for (Airline airline : searchBooksByDay ){
            if(airline.getDepartureTime().compareTo(time) > 0 ){
                searchResult.add(airline);
            }
        }
        return searchResult;
    }

}
