package com.company.learn;
/* Составьте  описание  класса  для  представления  времени.  Предусмотрте  возможности установки  времени  и
        изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
        недопустимых  значений полей  поле  устанавливается  в  значение  0.  Создать  методы  изменения  времени на
        заданное количество часов, минут и секунд.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Clock clock = new Clock(14, 30, 15);
        System.out.println("Текущее время: ");
        System.out.println(clock.getHour()+ " : "+clock.getMin()+ " : "+ clock.getSec());
        System.out.println();
        clock.choiceMenu();
        System.out.println(clock.getHour()+ " : "+clock.getMin()+ " : "+ clock.getSec());
    }
}

class Clock {

    private int hour;
    private int min;
    private int sec;

    public Clock (int hour, int min, int sec){
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public void setHour(int hour) {
        if (hour < 60 && hour > 0){
            this.hour = hour;
        }
        else {
            this.hour = 0;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setMin(int min) {
        if (min < 60 && min > 0){
            this.min = min;
        }
        else {
            this.min = 0;
        }
    }

    public int getMin() {
        return min;
    }

    public void setSec(int sec) {
        if (sec < 60 && sec > 0){
            this.sec = sec;
        }
        else {
            this.sec = 0;
        }
    }

    public int getSec() {
        return sec;
    }

    public void choiceMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите 1 для изменения часов, 2 для минут или 3 для секунд: ");
        int choice = sc.nextInt();
        System.out.print("+ либо - для увеличения значения и уменьшения соответственно: ");
        String operation = sc.next();
        if (choice == 1){
            setHour(hourButton(getHour(), operation));
        }
        else if (choice == 2){
            setMin(minButton(getMin(), operation));
        }
        else if (choice == 3){
            setSec(secButton(getSec(),operation));
        }
    }

    public int hourButton(int hour, String operation){
        if(operation.equals("+")){
            hour++;
        }
        else if(operation.equals("-")){
            hour--;
        }
        return hour;
    }

    public int minButton(int min, String operation){
        if(operation.equals("+")){
            min++;
        }
        else if(operation.equals("-")){
            min--;
        }
        return min;
    }

    public int secButton(int sec, String operation){
        if(operation.equals("+")){
            sec++;
        }
        else if(operation.equals("-")){
            sec--;
        }
        return sec;
    }

}

