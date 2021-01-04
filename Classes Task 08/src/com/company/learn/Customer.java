package com.company.learn;

public class Customer {

    private int id;
    private static int incrementID;        // должно быть статическим полем
    private String name;
    private String secondName;      // это отчество , если что)
    private String surname;

    private String address;
    private int cardNumber;
    private int bankAccount;

    public Customer(String name, String secondName, String surname, String address,
                    int cardNumber, int bankAccount){

        id = incrementID++;          // автозаполнение id , похоже на SQL

        this.name = name;
        this.secondName = secondName;
        this.surname = surname;
        this.address = address;
        this.cardNumber = cardNumber;
        this.bankAccount = bankAccount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public String toString () {
        String string = "";
        string = string + id + " - " + surname + " " + name + " " + secondName + ". "
                + address + " ; " + cardNumber + " , " + bankAccount + "\n" ;
        return string;
    }

}
