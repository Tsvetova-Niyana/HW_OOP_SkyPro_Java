package oop_hw2_3;

/*
– В исправленном коде применен принцип инкапсуляции.
– В исправленном коде применен принцип полиморфизма.
 */

public abstract class WheeledTransport implements ServiceWheeledTransportInterface {
    private String modelName;
    private int wheelsCount;

    public WheeledTransport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {

    }

    public void checkEngine() {

    }


    public void checkTrailer() {

    }
}
