package oop_hw2_2;/*
Всем ученикам Слизерина присущи хитрость, решительность, амбициозность, находчивость и жажда власти.

В классах факультетов опишите свойства каждого, перечисленные выше. Ученики должны быть реализованы в качестве
объектов. Должна быть возможность задавать качества учеников через конструктор.

Сделайте метод, который выводит на экран описание студента. В описание надо включать качества, которые присущи всем
студентам, плюс качества, которые присущи студенту, потому что он учится на конкретном факультете.

Реализуйте 4 метода, по одному для каждого факультета, которые сравнивают между собой учеников одного факультета
по свойствам. У каждого ученика нужно сложить баллы по каждому свойству, которое присуще ученику данного факультета.

Тот ученик, у которого сумма свойств больше, считается лучшим учеником.

Метод должен выводить в консоль сравнение учеников.

Например, у Гермионы благородство = 5 баллов, честь = 5 баллов и храбрость = 6 баллов. У Рона Уизли
благородство = 3 балла, честь = 6 баллов и храбрость = 5 баллов.

У Гермионы сумма баллов равна 16-ти, а у Рона – 14-ти. Значит метод должен вывести в консоль
“Гермиона лучший Гриффиндорец, чем Рон”.
 */

public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstPower;

    public Slytherin(String name, String surname, int powerWitchcraft, int transgressionDistance, int cunning,
                     int determination, int ambition, int resourcefulness, int thirstPower) {
        super(name, surname, powerWitchcraft, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstPower = thirstPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstPower() {
        return thirstPower;
    }

    public void setThirstPower(int thirstPower) {
        this.thirstPower = thirstPower;
    }

    public static void printInfoStudents(Slytherin[] slytherins) {
        System.out.println("\nУченики факультета Слизерин: ");
        System.out.println();
        for (int i = 0; i < slytherins.length; i++) {
            System.out.println(slytherins[i]);
        }
    }

    public static void getEqualsStudents(Slytherin slytherin1, Slytherin slytherin2) {

        int sumBalls1 = slytherin1.getAmbition() + slytherin1.getCunning() + slytherin1.getDetermination()
                + slytherin1.getResourcefulness() + slytherin1.getThirstPower();
        int sumBalls2 = slytherin2.getAmbition() + slytherin2.getCunning() + slytherin2.getDetermination() +
                slytherin2.getResourcefulness() + slytherin2.getThirstPower();
        System.out.println();
        System.out.println(slytherin1.getName() + " - сумма баллов: " + sumBalls1);
        System.out.println(slytherin2.getName() + " - сумма баллов: " + sumBalls2);

        if (sumBalls1 > sumBalls2) {
            System.out.println(slytherin1.getName() + " лучший Слизеринец, чем " + slytherin2.getName());
        } else {
            System.out.println(slytherin2.getName() + " лучший Слизеринец, чем " + slytherin1.getName());
        }
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getSurname() + ": " +
                "хитрость = " + cunning +
                ", решительность = " + determination +
                ", амбициозность = " + ambition +
                ", находчивость = " + resourcefulness +
                ", жажда власти = " + thirstPower +
                ", мощность колдовства = " + this.getPowerWitchcraft() +
                ", расстояние трансгрессии = " + this.getTransgressionDistance();
    }
}
