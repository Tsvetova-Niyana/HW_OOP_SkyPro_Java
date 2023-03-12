/*
Студенты Пуффендуя трудолюбивы, верны, честны.

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

public class Puffendui extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Puffendui(String name, String surname, int powerWitchcraft, int transgressionDistance,
                     int diligence, int loyalty, int honesty) {
        super(name, surname, powerWitchcraft, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public static void printInfoStudents(Puffendui[] puffenduis) {
        System.out.println("\nУченики факультета Пуффендуй: ");
        System.out.println();
        for (int i = 0; i < puffenduis.length; i++) {
            System.out.println(puffenduis[i]);
        }
    }

    public static void getEqualsStudents(Puffendui puffendui1, Puffendui puffendui2) {

        int sumBalls1 = puffendui1.getDiligence() + puffendui1.getLoyalty() + puffendui1.getHonesty();
        int sumBalls2 = puffendui2.getDiligence() + puffendui2.getLoyalty() + puffendui2.getHonesty();
        System.out.println();
        System.out.println(puffendui1.getName() + " - сумма баллов: " + sumBalls1);
        System.out.println(puffendui2.getName() + " - сумма баллов: " + sumBalls2);

        if (sumBalls1 > sumBalls2) {
            System.out.println(puffendui1.getName() + " лучший Пуфендуец, чем " + puffendui2.getName());

        } else {

            System.out.println(puffendui2.getName() + " лучший Пуфендуец, чем " + puffendui1.getName());
        }
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getSurname() + ": " +
                "трудолюбие = " + diligence +
                ", верность = " + loyalty +
                ", честность = " + honesty +
                ", мощность колдовства = " + this.getPowerWitchcraft() +
                ", расстояние трансгрессии = " + this.getTransgressionDistance();
    }
}
