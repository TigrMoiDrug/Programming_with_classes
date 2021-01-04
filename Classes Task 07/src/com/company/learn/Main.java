package com.company.learn;
/*Описать  класс,  представляющий  треугольник.
         Предусмотреть  методы  для  создания объектов,
         вычисления площади, периметра и точки пересечения медиан.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        buildTriangle();
    }

    public static void buildTriangle (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите стороны треугольника");
        System.out.println("Сторона А: ");
        int a = sc.nextInt();
        System.out.println("Сторона B: ");
        int b = sc.nextInt();
        System.out.println("Сторона C: ");
        int c = sc.nextInt();

        if (Triangle.exists(a, b, c)){

            Triangle triangle = new Triangle(a, b, c);

            System.out.println("Периметр: " +triangle.P()+ " см");
            System.out.println("Площадь: " +triangle.S()+ " см");
            System.out.println("Точка пересечения медиан по медиане к стороне C: "+triangle.mediansCross()+ " см");


        }
        else{
            System.out.println("Такого треугольника не существует.");
        }
    }

}

class Triangle {

    private int sideA;
    private int sideB;
    private int sideC;

    public double P (){
        return getSideA() + getSideB() + getSideC();
    }

    public double S (){
       double halfP = P()/2;
       return Math.sqrt(halfP * (halfP - getSideA()) * (halfP - getSideB()) * (halfP - getSideC()));
    }

    public double mediansCross (){
        double mC = Math.sqrt(2 * Math.pow(getSideA(), 2) + 2 * Math.pow(getSideB(), 2) - Math.pow(getSideC(), 2)) / 2;
        return mC / 3;
    }

    public static boolean exists (int sideA, int sideB, int sideC){

        boolean ex = false;
        if (sideA < sideB + sideC && sideB < sideA + sideC && sideC < sideA + sideB){
            ex = true;
        }
        return  ex;
    }

    public Triangle (int sideA, int sideB, int sideC){

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }
}
