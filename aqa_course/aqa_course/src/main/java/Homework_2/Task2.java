package Homework_2;

public class Task2 {

//	Создать класс Homework_2.Flat(квартира)
//	Создать класс Homework_2.Room(комната)
//	Перечислить поля классов Homework_2.Flat и Homework_2.Room
//	Создайте класс Homework_2.Task2 + метод psvm
//	Создать объект типа Квартира. Указать значение полей

    public static void main(String[] args) {

        //Создаём объект "Квартира", Указываем значение полей.
        Flat flat1 = new Flat();
        flat1.numberOfFlat = 1;
        flat1.flatSquare = 58.3F;
        flat1.flatFloor = 1;
        flat1.flatQuantityRooms = 3;
        flat1.haveGas = true;

        // Контрольный вывод на консоль
        System.out.println("Квартира номер " + flat1.numberOfFlat + " имеет площадь " + flat1.flatSquare +
                           ", находится на " + flat1.flatFloor + " этаже" + ", состоит из " + flat1.flatQuantityRooms
                           + " комнат, газ в квартире " + flat1.haveGas);

        // Создаём объект "Комната", указываем значение полей.
        Room room1 = new Room();
        room1.whereIsRoom = 1;
        room1.squareRoom = 15.3F;
        room1.roomType = "Спальня";
        room1.haveWindow = true;
        room1.haveBalcony = false;

        // Контрольный вывод на консоль
        System.out.println("В квартире номер " + room1.whereIsRoom + " есть " + room1.roomType +
                           " площадью " + room1.squareRoom + ", в этой комнате окно " + room1.haveWindow +
                           ", балкон " + room1.haveBalcony);

    }
}
