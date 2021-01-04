package com.company.learn;
/*
   Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
   Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */

public class Main {

    public static void main(String[] args) {
        Wheel[] wheels = new Wheel[4];
        Engine engine = new Engine(false);
	    Car car = new Car("Skoda", 50, wheels, 70);

	    car.setWheels(wheels);   // установка колёс
	    car.fuel();             // заправка
	    car.repairWheels();      // починка колёс если нужно
	    engine.setRunning(true);    // завести двигатель


	    System.out.println("Готово. Можно ехать!!");
	    car.ride(engine);

    }
}
