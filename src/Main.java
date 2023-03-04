/*
Гарри Поттер, Гермиона Грейнджер и Рон Уизли учатся на факультете Гриффиндор.

Драко Малфой, Грэхэм Монтегю, Грегори Гойл учатся на Слизерине.

На факультет Пуффендуй учатся Захария Смит, Седрик Диггори, Джастин Финч-Флетчли.

На факультете Когтевран учится Чжоу Чанг, Падма Патил и Маркус Белби.

Ученики должны быть реализованы в качестве объектов. Должна быть возможность задавать качества учеников через
конструктор. Присвойте каждому свойству произвольное числовое значение от 0 до 100.
 */

public class Main {
    public static void main(String[] args) {

        //создание экземпляров класса Gryffindor
        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри", "Поттер", 60, 150, 20,
                        30, 70),
                new Gryffindor("Гермиона", "Грейнджер", 100, 170, 25,
                        50, 90),
                new Gryffindor("Рон", "Уизли", 30, 70, 15,
                        50, 30)
        };

        //создание экземпляров класса Puffendui
        Puffendui[] puffenduis = {
                new Puffendui("Захария", "Смит", 78, 18, 68,
                        66, 97),
                new Puffendui("Седрик", "Диггори", 59, 50, 18,
                        51, 19),
                new Puffendui("Джастин", "Финч-Флетчли", 72, 33, 4,
                        45, 32)
        };

        //создание экземпляров класса Ravenclaw
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу", "Чанг", 78, 83, 82,
                        94, 49, 64),
                new Ravenclaw("Падма", "Патил", 49, 36, 60,
                        99, 19, 74),
                new Ravenclaw("Маркус", "Белби", 2, 25, 80,
                        27, 85, 87)
        };

        //создание экземпляров класса Slytherin
        Slytherin[] slytherins = {
                new Slytherin("Драко", "Малфой", 50, 94, 90,
                        59, 99, 70, 90),
                new Slytherin("Грэхэм", "Монтегю", 34, 48, 53,
                        75, 79, 60, 52),
                new Slytherin("Грегори", "Гойл", 59, 10, 90,
                        84, 54, 32, 36)
        };

        //подсчет длины массива учеников Хогвартса
        int lenHogwartsStudent = gryffindors.length + puffenduis.length + ravenclaws.length + slytherins.length;

        //создание экземпляров класса Hogwarts
        Hogwarts[] hogwartsStudent = new Hogwarts[lenHogwartsStudent];
        int startCode = 0;
        for (int i = 0; i < gryffindors.length; i++) {
            hogwartsStudent[i] = new Hogwarts(gryffindors[i].getName(), gryffindors[i].getSurname(),
                    gryffindors[i].getPowerWitchcraft(), gryffindors[i].getTransgressionDistance());
        }

        startCode += gryffindors.length;
        for (int i = 0; i < puffenduis.length; i++) {
            hogwartsStudent[i + startCode] = new Hogwarts(puffenduis[i].getName(), puffenduis[i].getSurname(),
                    puffenduis[i].getPowerWitchcraft(), puffenduis[i].getTransgressionDistance());
        }

        startCode += puffenduis.length;
        for (int i = 0; i < ravenclaws.length; i++) {
            hogwartsStudent[i + startCode] = new Hogwarts(ravenclaws[i].getName(), ravenclaws[i].getSurname(),
                    ravenclaws[i].getPowerWitchcraft(), ravenclaws[i].getTransgressionDistance());
        }

        startCode += ravenclaws.length;
        for (int i = 0; i < slytherins.length; i++) {
            hogwartsStudent[i + startCode] = new Hogwarts(slytherins[i].getName(), slytherins[i].getSurname(),
                    slytherins[i].getPowerWitchcraft(), slytherins[i].getTransgressionDistance());
        }

        //вывод информации об учениках Хогвартса
        Hogwarts.printListHogwarts(hogwartsStudent);

        //вывод информации об учениках факультета Гриффиндор
        Gryffindor.printInfoStudents(gryffindors);

        //вывод информации об учениках факультета Пуффендуй
        Puffendui.printInfoStudents(puffenduis);

        //вывод информации об учениках факультета Когтевран
        Ravenclaw.printInfoStudents(ravenclaws);

        //вывод информации об учениках факультета Слизерин
        Slytherin.printInfoStudents(slytherins);

        //сравнение учеников факультета Гриффиндор
        Gryffindor.getEqualsStudents(gryffindors[0], gryffindors[2]);
        Gryffindor.getEqualsStudents(gryffindors[2], gryffindors[1]);

        //сравнение учеников факультета Пуффендуй
        Puffendui.getEqualsStudents(puffenduis[0], puffenduis[2]);
        Puffendui.getEqualsStudents(puffenduis[2], puffenduis[1]);

        //сравнение учеников факультета Когтевран
        Ravenclaw.getEqualsStudents(ravenclaws[0], ravenclaws[2]);
        Ravenclaw.getEqualsStudents(ravenclaws[2], ravenclaws[1]);

        //сравнение учеников факультета Слизерин
        Slytherin.getEqualsStudents(slytherins[0], slytherins[2]);
        Slytherin.getEqualsStudents(slytherins[2], slytherins[1]);
    }
}
