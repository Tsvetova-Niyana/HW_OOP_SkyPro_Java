package oop_hw2_3;

/*
– В исправленном коде применен принцип наследования.
– В исправленном коде применена перегрузка методов.
 */


public class Truck extends Car {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
