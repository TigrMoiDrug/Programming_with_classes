package com.company.learn;

public class Client {

    private String name;
    private TravelPackage travelPackage;

    public Client (String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTravelPackage(TravelPackage travelPackage) {
        this.travelPackage = travelPackage;
    }
}
