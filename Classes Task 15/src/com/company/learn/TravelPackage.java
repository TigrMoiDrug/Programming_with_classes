package com.company.learn;

public class TravelPackage {

    private Options.Food food;
    private Options.Transport transport;
    private Options.TypeOfTour typeOfTour;
    private int numberOfDays;
    private String city;
    private String country;
    private int price;

    public TravelPackage (Options.Food food, Options.Transport transport, Options.TypeOfTour typeOfTour,
                          int numberOfDays, int price, String city, String country){
        this.food = food;
        this.transport = transport;
        this.typeOfTour = typeOfTour;
        this.numberOfDays = numberOfDays;
        this.price = price;
        this.city = city;
        this.country = country;
    }

    public void setFood(Options.Food food) {
        this.food = food;
    }

    public void setTransport(Options.Transport transport) {
        this.transport = transport;
    }

    public void setTypeOfTour(Options.TypeOfTour typeOfTour) {
        this.typeOfTour = typeOfTour;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Options.Food getFood() {
        return food;
    }

    public Options.Transport getTransport() {
        return transport;
    }

    public Options.TypeOfTour getTypeOfTour() {
        return typeOfTour;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public int getPrice() {
        return price;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String toString() {
        return getCountry()+", "+getCity()+", количество дней: "+getNumberOfDays()+", "+getTypeOfTour().toString()+", "
                +getTransport().toString()+", "+getFood().toString()+", стоимость: "+getPrice()+". ";
    }
}
