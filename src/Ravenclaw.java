/*
Когтевранцы умны, мудры, остроумны и полны творчества.

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

public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, String surname, int powerWitchcraft, int transgressionDistance, int intelligence,
                     int wisdom, int wit, int creativity) {
        super(name, surname, powerWitchcraft, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public static void printInfoStudents(Ravenclaw[] ravenclaws) {
        System.out.println("\nУченики факультета Когтевран: ");
        System.out.println();
        for (int i = 0; i < ravenclaws.length; i++) {
            System.out.println(ravenclaws[i]);
        }
    }

    public static void getEqualsStudents(Ravenclaw ravenclaw1, Ravenclaw ravenclaw2) {

        int sumBalls1 = ravenclaw1.getCreativity() + ravenclaw1.getIntelligence() + ravenclaw1.getWisdom()
                + ravenclaw1.getWit();
        int sumBalls2 = ravenclaw2.getCreativity() + ravenclaw2.getIntelligence() + ravenclaw2.getWisdom() +
                ravenclaw2.getWit();
        System.out.println();
        System.out.println(ravenclaw1.getName() + " - сумма баллов: " + sumBalls1);
        System.out.println(ravenclaw2.getName() + " - сумма баллов: " + sumBalls2);

        if (sumBalls1 > sumBalls2) {
            System.out.println(ravenclaw1.getName() + " лучший Кагтевранец, чем " + ravenclaw2.getName());

        } else {
            System.out.println(ravenclaw2.getName() + " лучший Кагтевранец, чем " + ravenclaw1.getName());
        }
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getSurname() + ": " +
                "ум = " + intelligence +
                ", мудрость = " + wisdom +
                ", остроумие = " + wit +
                ", творчество = " + creativity +
                ", мощность колдовства = " + this.getPowerWitchcraft() +
                ", расстояние трансгрессии = " + this.getTransgressionDistance();
    }
}
