package com.company.learn;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Agency {

    private ArrayList<TravelPackage>travelPackages;
    private ArrayList<Client>clients;

    public Agency (){
        travelPackages = new ArrayList<>();
        clients = new ArrayList<>();
    }

    public void addToPackages (TravelPackage travelPackage){
        travelPackages.add(travelPackage);
    }

    public void addClient (Client client){
        clients.add(client);
    }

    public void setTravelPackages(ArrayList<TravelPackage> travelPackages) {
        this.travelPackages = travelPackages;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public ArrayList<TravelPackage> getTravelPackages() {
        return travelPackages;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void sortByPrice(){
        travelPackages.sort(Comparator.comparing(TravelPackage::getPrice));
    }

    public void sortByDays(){
        travelPackages.sort(Comparator.comparing(TravelPackage::getNumberOfDays));
    }

    public void byFood (){

        System.out.println("Введите номер искомого варианта\n" +
                "1 - "+Options.Food.BREAKFAST.toString()+";\n" +
                "2 - "+Options.Food.BREAKFAST_AND_DINNER.toString()+";\n" +
                "3 - "+Options.Food.WITHOUT.toString()+".");

        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();

        if (choice == 1){
            for(int i = 0; i < getTravelPackages().size(); i++){
                if (getTravelPackages().get(i).getFood().equals(Options.Food.BREAKFAST)){
                    System.out.println(getTravelPackages().get(i).toString());
                }
            }
        }
        else if (choice == 2){
            for(int i = 0; i < getTravelPackages().size(); i++){
                if (getTravelPackages().get(i).getFood().equals(Options.Food.BREAKFAST_AND_DINNER)){
                    System.out.println(getTravelPackages().get(i).toString());
                }
            }
        }
        else if(choice == 3){
            for(int i = 0; i < getTravelPackages().size(); i++){
                if (getTravelPackages().get(i).getFood().equals(Options.Food.WITHOUT)){
                    System.out.println(getTravelPackages().get(i).toString());
                }
            }
        }

        sc.close();
    }

    public void byDaysNumber(){
        System.out.println("Введите количество дней: ");
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();

        for (int i = 0; i < getTravelPackages().size(); i++){
            if(getTravelPackages().get(i).getNumberOfDays() == days){
                System.out.println(getTravelPackages().get(i).toString());
            }
        }

        sc.close();
    }

    public void byTransport(){

        System.out.println("Введите номер искомого варианта\n" +
                "1 - "+Options.Transport.BUS.toString()+";\n" +
                "2 - "+Options.Transport.PLANE.toString()+";\n" +
                "3 - "+Options.Transport.SHIP.toString()+";\n" +
                "4 - "+Options.Transport.TRAIN.toString()+".");

        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();

        if (choice == 1){
            for(int i = 0; i < getTravelPackages().size(); i++){
                if (getTravelPackages().get(i).getTransport().equals(Options.Transport.BUS)){
                    System.out.println(getTravelPackages().get(i).toString());
                }
            }
        }
        else if (choice == 2){
            for(int i = 0; i < getTravelPackages().size(); i++){
                if (getTravelPackages().get(i).getTransport().equals(Options.Transport.PLANE)){
                    System.out.println(getTravelPackages().get(i).toString());
                }
            }
        }
        else if(choice == 3){
            for(int i = 0; i < getTravelPackages().size(); i++){
                if (getTravelPackages().get(i).getTransport().equals(Options.Transport.SHIP)){
                    System.out.println(getTravelPackages().get(i).toString());
                }
            }
        }
        else if(choice == 4){
            for(int i = 0; i < getTravelPackages().size(); i++){
                if (getTravelPackages().get(i).getTransport().equals(Options.Transport.TRAIN)){
                    System.out.println(getTravelPackages().get(i).toString());
                }
            }
        }

        sc.close();
    }

    public void selector (int choice){
        if (choice == 1){
            byDaysNumber();
        }
        else if (choice == 2){
            byFood();
        }
        else if(choice == 3){
            byTransport();
        }
        else if(choice == 4){
            sortByDays();
            printAll();
        }
        else if(choice == 5){
            sortByPrice();
            printAll();
        }
    }

    public void printAll (){
        for (int i = 0; i < getTravelPackages().size(); i++){
            System.out.println(getTravelPackages().get(i).toString());
        }
    }

}
