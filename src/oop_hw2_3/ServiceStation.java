package oop_hw2_3;

/*
– В исправленном коде применен принцип полиморфизма.
– В исправленном коде применена перегрузка методов.
 */


public class ServiceStation {

    public void check(WheeledTransport... wheeledTransport) {
        System.out.println(wheeledTransport.length);
        for (int i = 0; i < wheeledTransport.length; i++) {
            if (wheeledTransport != null) {
                System.out.println("Обслуживаем " + wheeledTransport[i].getModelName());
                wheeledTransport[i].getWheelsCount();
                for (int j = 0; j < wheeledTransport[i].getWheelsCount(); j++) {
                    wheeledTransport[i].updateTyre();
                }
                wheeledTransport[i].checkEngine();
                wheeledTransport[i].checkTrailer();
                System.out.println();
            }
        }
    }
}
