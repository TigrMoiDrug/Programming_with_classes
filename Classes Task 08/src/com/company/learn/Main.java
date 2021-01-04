package com.company.learn;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Dmitry", "Vyacheslavovich","Rodionov","Brest, Sovietskaya 21",0001,01));
        customers.add(new Customer("Viktor", "Mihailovich","Sakharuk","Mohiley, Vinogradnaja 10",0002,02));
        customers.add(new Customer("Karina", "Andreevna","Novac","Grodno, Marksa 15",0003,03));
        customers.add(new Customer("Alex", "Sergeevich","Mihailov","Brest, Gogola 2",0004,04));
        customers.add(new Customer("Mary", "Konstantinovna","Ivanova","Minsk, Nesavisimosti 61",0005,05));

        ListOfCustomers list = new ListOfCustomers(customers);

        Operations.menu(list);
    }
}
