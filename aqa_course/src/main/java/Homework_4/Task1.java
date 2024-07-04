package Homework_4;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Task1 {
    // Создайте переменную balance типа int.
    // Положите в нее значение.
    // Если значение переменной равно 10, напишите "Десятка"

    public static void main(String[] args) {

        int balance;
        System.out.print("Введите число: ");
        Scanner input = new Scanner(System.in);
        balance = input.nextInt();

        if (balance == 10) {
            System.out.println("Десятка");
        }
    }
}
