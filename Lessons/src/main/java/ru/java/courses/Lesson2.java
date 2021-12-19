package ru.java.courses;

import com.sun.tools.javac.Main;

class Lesson2 {

    /**
     * Нужно реализовать формулу y = √(13x + 13/x)
     * Подсказка: квадратный корень вычисляется функцией Math.sqrt()
     *
     * @param x на текущем этапе входное значение будет больше нуля
     *
     * @return возвращаем только целую часть от полученного результата,
     * хвост отбрасываем без откругления
     */
    static int formula (int x) {

        double y = Math.sqrt(13*x + 13/x);
        return (int) y;
    }

    /**
     * Нужно привести строку с полным именем к инициалам.
     * Например, "Иванов Петр Александрович" → "И.П.А."
     * Подсказка:
     * разделение строки на части: .split(" ");
     * получение символа на определенной позиции: .charAt();
     * приведение к верхнему регистру: .toUpperCase();
     *
     * @param fullName на текущем этапе имена будут состоять из имени, фамили и отчества, разделяться пробелами.
     *                 Регистр букв во входном параметре может быть любым.
     *
     * @return возвращаем инициалы в верхнем регистре разделенные точкой, как в примере выше
     */
    static String initials(String fullName) {
        String [] a = fullName.split(" ");

        char result1 = a[0].charAt(0);
        char result2 = a[1].charAt(0);
        char result3 = a[2].charAt(0);
        return (result1 +"."+result2+"."+result3+".").toUpperCase();

            }


    public static void main(String[] args) {
        int g = formula(5);
        System.out.println(g);

        System.out.println(initials("Гафаров Елена Анатольевна"));

    }

}
