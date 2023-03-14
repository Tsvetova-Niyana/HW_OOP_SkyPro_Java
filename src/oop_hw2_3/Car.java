package oop_hw2_3;

/*
– В исправленном коде применен принцип наследования.
– В исправленном коде применена перегрузка методов.
 */


public class Car extends WheeledTransport {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
