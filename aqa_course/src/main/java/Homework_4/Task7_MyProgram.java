package Homework_4;

public class Task7_MyProgram {

//  Создайте класс MyProgram + метод psvm. В методе создайте новый экземпляр класса.
//  Запросите текущую скорость и выведите ее на экран.
//  Увеличьте скорость на 25 единиц.
//  Запросите текущую скорость и выведите ее на экран. Должно быть 25
//  Вызовите метод brake()
//  Запросите текущую скорость и выведите ее на экран. Должно быть 15
//  Вызовите метод brake()
//  Запросите текущую скорость и выведите ее на экран. Должно быть 5

    public static void main(String[] args) {

        // Создаём новую машину (Новый экземпляр класса)
        Car Car1 = new Car("01");

        // Запрос текущей скорости с выводом на экран
        System.out.println("Машина с номером " + Car1.carNumber + " имеет скорость " + Car1.getCurrentSpeed());

        System.out.println("Разгоняемся");
        Car1.speedUp(25); // Увеличиваем скорость на 25

        System.out.println("Машина движется со скоростью = " + Car1.getCurrentSpeed());// Контрольный вывод на консоль

        // Последовательно вызываем метод brake с выводом скорости на консоль
        Car1.brake();
        System.out.println("Скорость = " + Car1.getCurrentSpeed());
        Car1.brake();
        System.out.println("Скорость = " + Car1.getCurrentSpeed());
        Car1.brake();
        System.out.println("Скорость = " + Car1.getCurrentSpeed());
    }
}
