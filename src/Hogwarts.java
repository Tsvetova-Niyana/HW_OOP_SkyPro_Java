/*
Абсолютно все ученики школы Хогвартс умеют колдовать с мощностью в сколько-то баллов и могут трансгрессировать на
какое-то расстояние. Сила магии и расстояние трансгресии у каждого ученика своё и выражается в целочисленном
эквиваленте.

В классах факультетов опишите свойства каждого, перечисленные выше. Ученики должны быть реализованы в качестве
объектов. Должна быть возможность задавать качества учеников через конструктор.

Реализуйте метод, который сравнивает двух любых учеников Хогвартса по силе магии и расстоянию трансгрессии,
и выводит в консоль сравнительную оценку между двумя учениками.

Например, Драко Малфой обладает бОльшей мощностью магии, чем Захария Смит.
 */

public class Hogwarts {
    private String name;
    private String surname;
    private int powerWitchcraft;
    private int transgressionDistance;

    public Hogwarts(String name, String surname, int powerWitchcraft, int transgressionDistance) {
        this.name = name;
        this.surname = surname;
        this.powerWitchcraft = powerWitchcraft;
        this.transgressionDistance = transgressionDistance;
    }

    public Hogwarts(String name, String surname, int powerWitchcraft) {
        this.name = name;
        this.surname = surname;
        this.powerWitchcraft = powerWitchcraft;
    }

    public Hogwarts(int powerWitchcraft) {
        this.powerWitchcraft = powerWitchcraft;
    }

    public Hogwarts(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPowerWitchcraft() {
        return powerWitchcraft;
    }

    public void setPowerWitchcraft(int powerWitchcraft) {
        this.powerWitchcraft = powerWitchcraft;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public static void printListHogwarts(Hogwarts[] hogwarts) {
        int code = 0;
        System.out.println("Информация об учениках школы Хогвартс: \n");
        for (int i = 0; i < hogwarts.length; i++) {
            code += 1;
            System.out.println("Код = " + code);
            System.out.println(hogwarts[i]);
        }
    }

    @Override
    public String toString() {
        return  "Имя ученика: " + name + '\n' +
                "Фамилия ученика: " + surname + '\n' +
                "мощность колдовства: " + powerWitchcraft + '\n' +
                "расстояние трансгрессии: " + transgressionDistance + '\n';
    }
}
