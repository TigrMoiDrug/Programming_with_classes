package com.company.learn;

public class Airline {

    private String destination;
    private int flightNumber;
    private String planeType;
    private String departureTime;
    private String day;

    public Airline (String destination, int flightNumber, String planeType, String departureTime, String day){
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.planeType = planeType;
        this.departureTime = departureTime;
        this.day = day;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDay(String day) {
        if (day.equalsIgnoreCase("понедельник") || day.equalsIgnoreCase("вторник") ||
                day.equalsIgnoreCase("среда") || day.equalsIgnoreCase("четверг") ||
                day.equalsIgnoreCase("пятница") || day.equalsIgnoreCase("субота") ||
                day.equalsIgnoreCase("воскресенье")){
            this.day = day;
        }
        else  {
            System.out.println("Такого дня нет");
        }
    }

    public String getDay() {
        return day;
    }

    public String toString () {
        String string = "";
        string = string + destination + " - " + flightNumber + " - " + planeType + " - " + departureTime + " - "
                + day  +" .\n";
        return string;
    }
}
