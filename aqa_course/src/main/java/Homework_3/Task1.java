package Homework_3;

public class Task1 {
//  Создайте массив
//  Массив хранит 5 строк.
//  Массив должен называться todoList
//  Положите в массив 5 дел на день

    public static void main(String[] args) {

        String[] todoList = new String[5]; // Создаём массив из 5 строк
        todoList[0] = "10.00 Просмотреть лекцию про массивы";           // и
        todoList[1] = "11.10 Сделать первую часть домешнего задания";   // присваиваем
        todoList[2] = "11.30 Сделать вторую чаcть домашнего задания";   // значения
        todoList[3] = "12.00 Перерыв на чай";                           // всем
        todoList[4] = "12.10 Доделать домашнее задание";                // строкам

        // Контрольный вывод на консоль
        System.out.println("Список дел на день:");
        for (int i = 0; i < 5; i = i + 1){
            System.out.println(todoList[i]);
        }
    }
}
