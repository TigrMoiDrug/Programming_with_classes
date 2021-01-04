package com.company.learn;
/*Создйте  класс  Test2 c  двумя  переменными.  Добавьте  конструктор  с  входными  параметрами.  Добавьте
        конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
        класса.
 */
public class Main {

    public static void main(String[] args) {
        Test2 task = new Test2();
        task.setX(5);
        task.setY(9);

        System.out.println("x = "+ task.getX());
        System.out.println("y = "+ task.getY());
    }
}
class Test2{

    private int x;
    private int y;

    public Test2(int x, int y){      // конструктор с параметрами
        this.x = x;
        this.y = y;
    }

    public Test2(){                   // конструктор по умолчанию

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

}
