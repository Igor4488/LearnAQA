package Homework_4;

import java.util.Scanner;

public class Task2Task3 {
//  Создайте переменную типа int и присвойте ей любое значение
//  Если число четное (делится на 2 без остатка), напишите "Четное число."
//  Если число нечетное, напишите "Нечетное число."

//  Доработайте решение второго задания:
//  если число четное И делится на 4 без остатка, напишите "Четное число. Кратно четырем."
//  если число нечетное И делится на 3 без остатка, напишите "Нечетное число. Кратно трем."

    public static void main(String[] args) {

        // Объявление переменной и запрос ввода значения переменной пользователем
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        number = input.nextInt();

        // Второе задание
        System.out.println("Результат задания 2:");
        if (number % 2 == 1) {
            System.out.println("Число " + number + " - Нечётное число.");
        } else {
            System.out.println("Число " + number + " - Чётное число.");
        }
        System.out.println(); // Пустая строка для удобства чтения результатов в консоли

        // Третье задание
        System.out.println("Результат задания 3:");
        // Цикл для демонстрации корректной работы программы со множеством разных чисел
        for (number = 50; number < 60; number++) {
            if (number % 4 == 0) {
                System.out.println("Число " + number + " - Чётное число. Кратно четырём.");
            } else if (number % 3 == 0) {
                System.out.println("Число " + number + " - Нечётное число. Кратно трём.");
            } else if (number % 2 == 1) {
                System.out.println("Число " + number + " - Нечётное число.");
            } else {
                System.out.println("Число " + number + " - Чётное число.");
            }
        }
    }
}
