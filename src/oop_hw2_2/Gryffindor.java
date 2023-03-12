package oop_hw2_2;/*
Всем Гриффиндорцам присущи благородство, честь и храбрость.

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


public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, String surname, int powerWitchcraft, int transgressionDistance,
                      int nobility, int honor, int bravery) {
        super(name, surname, powerWitchcraft, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public static void getEqualsStudents(Gryffindor gryffindor1, Gryffindor gryffindor2) {

        int sumBalls1 = gryffindor1.getBravery() + gryffindor1.getHonor() + gryffindor1.getNobility();
        int sumBalls2 = gryffindor2.getBravery() + gryffindor2.getHonor() + gryffindor2.getNobility();
        System.out.println();
        System.out.println(gryffindor1.getName() + " - сумма баллов: " + sumBalls1);
        System.out.println(gryffindor2.getName() + " - сумма баллов: " + sumBalls2);

        if (sumBalls1 > sumBalls2) {
            System.out.println(gryffindor1.getName() + " лучший Гриффиндорец, чем " + gryffindor2.getName());

        } else {
            System.out.println(gryffindor2.getName() + " лучший Гриффиндорец, чем " + gryffindor1.getName());
        }
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public static void printInfoStudents(Gryffindor[] gryffindors) {
        System.out.println("\nУченики факультета Гриффиндор: ");
        System.out.println();
        for (int i = 0; i < gryffindors.length; i++) {
            System.out.println(gryffindors[i]);
        }
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getSurname() + ": " +
                "благородство = " + nobility +
                ", честь = " + honor +
                ", храбрость = " + bravery +
                ", мощность колдовства = " + this.getPowerWitchcraft() +
                ", расстояние трансгрессии = " + this.getTransgressionDistance();
    }
}
