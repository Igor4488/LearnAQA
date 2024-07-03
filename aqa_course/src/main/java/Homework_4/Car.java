package Homework_4;

//  Создайте класс Car. Поля могут быть любые.
//  Обязательно должно быть поле currentSpeed (тип данных int).
//  По умолчанию currentSpeed = 0;
//  Создайте метод getCurrentSpeed.
//  Метод должен возвращать (return) текущую скорость.
//  Создайте метод speedUp, который принимает на вход число.
//  Метод должен увеличивать текущую скорость на заданное число.
//  Создайте метод break(), который сокращает текущую скорость на 10 единиц.
//  Если текущая скорость <= 10, то метод делает текущую скорость равной 0

public class Car {
    String carNumber;
    int currentSpeed = 0;

    public Car(String carNumber) {
        this.carNumber = carNumber;
        this.currentSpeed = currentSpeed;
    }

    public float getCurrentSpeed() {
        return currentSpeed;
    }

    public void speedUp(int speedUpSize) {
        this.currentSpeed = this.currentSpeed + speedUpSize;
    }

    public void brake() {
        System.out.println("Тормозим");
        if (this.currentSpeed > 10) {
            this.currentSpeed = this.currentSpeed - 10;
        } else {
            this.currentSpeed = 0;
        }
    }
}



