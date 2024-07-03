package Homework_3;

public class Task2 {
// Создайте массив
// Массив хранит 3 дробных числа.
// Положите в массив значение чисел Пи, е и единицу
// Дробные числа с точностью в 5 знаков после запятой

    public static void main(String[] args) {
        double[] constants = new double[3]; // Создаём массив для трёх дробных чисел
        constants[0] = 3.14159; // и присваиваем
        constants[1] = 2.71828; // значения
        constants[2] = 1.0D;    // его элемкнтам

        // Контрольный вывод на консоль
        System.out.println("Вывод на экран массива \"constants\":");
        for (int i = 0; i < constants.length; i = i + 1) {
            System.out.println(constants[i]);
        }
    }
}
