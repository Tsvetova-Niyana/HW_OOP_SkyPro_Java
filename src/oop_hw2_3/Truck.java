package oop_hw2_3;

/*
– В исправленном коде применен принцип наследования.
– В исправленном коде применена перегрузка методов.
 */


public class Truck extends WheeledTransport {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
