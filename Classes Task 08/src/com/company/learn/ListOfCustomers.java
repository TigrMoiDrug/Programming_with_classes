package com.company.learn;
/* Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки,
    номер банковского счета.
    Найти и вывести:
    a) список покупателей в алфавитном порядке;
    b) список покупателей, у которых номер кредитной карточки находится
     в заданном интервале.
 */
import java.util.ArrayList;
import java.util.Comparator;

public class ListOfCustomers {

    private ArrayList<Customer> listOfCustomers;
    private int size;

    public ListOfCustomers(ArrayList<Customer> listOfCustomers) {        // конструктор
        this.listOfCustomers = listOfCustomers;
        this.size = listOfCustomers.size();
    }

    public ArrayList<Customer> getListOfCustomers() {
        return listOfCustomers;
    }

    public String toString (){
        return "List of clients: \n" +
                ""+ listOfCustomers + ".";
    }

    public int getSize() {
        return size;
    }

    public void pushCustomer(Customer customer){         // можно добавить клиента
        this.getListOfCustomers().add(customer);
    }

    public void sortByAlphabet (){
        listOfCustomers.sort(Comparator.comparing(Customer::getSurname));
    }

    public ArrayList<Customer> searchInCards (int from, int to){
        ArrayList <Customer> searchResult = new ArrayList<>();

        for (Customer customer : listOfCustomers ){
            if(customer.getCardNumber() >= from && customer.getCardNumber() <= to){
                searchResult.add(customer);
            }
        }
        return searchResult;
    }
}
