package com.company.learn;
/*Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
    переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
    наибольшее значение из этих двух переменных.
 */
public class Main {

    public static void main(String[] args) {
        Test1 task = new Test1();
        task.setX(6);
        task.setY(8);
        task.print(task.sumXY());
        task.print(task.maxValue());
    }

}

class Test1 {

    private int x ;
    private int y ;

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int sumXY (){
        return x + y;
    }

    public int maxValue (){
        return Math.max(x, y);
    }

    public void print (int operation){
        System.out.println(operation);
    }

}
