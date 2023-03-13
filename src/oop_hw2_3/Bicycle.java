package oop_hw2_3;

/*
– В исправленном коде применен принцип наследования.
– В исправленном коде применена перегрузка методов.
 */


public class Bicycle extends WheeledTransport{
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

}
