package Homework_5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task2 {

// Создайте список строк (List)
// Положите в список 5 дел на день.

// В цикле выведите список в формате:
// - Задача 1: {текст задачи}
// - Задача 2: {текст задачи}
// - ...
// - Задача 5: {текст задачи}

    public static void main(String[] args) {

        List<String> toDoList = new ArrayList<>();  // Создание списка строк

        toDoList.add("Подъём в 7.00");                          //
        toDoList.add("Завтрак в 8.00");                         //
        toDoList.add("Лекция по Java в 9.00");                  // Заполнение списка
        toDoList.add("Домашняя работа в 13.00");                //
        toDoList.add("Переустановка Windows  в 13.13");         //

        for (int i = 0; i <= 4; i++) {
            System.out.println("Задача " + (i + 1) + " " + toDoList.get(i));   // Вывод списка
        }
    }
}
