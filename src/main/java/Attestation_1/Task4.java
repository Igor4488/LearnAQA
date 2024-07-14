package Attestation_1;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
// Напишите консольное приложение, которое играет с пользователем в камень-ножницы-бумагу.
// Требования:
// 1. Пользователь вводит значение через консоль (К - камень), (Н - ножницы), (Б - бумага);
// 2. Программа выбирает свой вариант случайным образом; 3. Игра состоит из 5 раундов;
// 4. Баллы считаются по формуле ниже; 5. По итогу 5 раундов, программа пишет счет и объявляет победителя. Конец игры.
// Как считать баллы:
// 1. Если сторона одержала победу с помощью камня (К), победитель получает 1 балл
// 2. Если сторона одержала победу с помощью ножниц (Н), победитель получает 2 балла
// 3. Если сторона одержала победу с помощью бумаги (Б), победитель получает 5 баллов

    // Б = 0 К = 1 Н = 2

    public static void main(String[] args) {
        int machineScore = 0;
        int playerScore = 0;

        for (int i = 1; i < 6; i++) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите число 0 - Бумага, 1 - Камень, 2 - Ножницы : ");
            int playerChoice = input.nextInt();
            System.out.println("Ваш выбор: " + playerChoice);

            Random random = new Random();
            int machineChoice = random.nextInt(3);
            System.out.println("Выбор компьютера: " + machineChoice);

            if (playerChoice == 0 && machineChoice == 1) {
                playerScore = playerScore + 5;
            } else if (playerChoice == 0 && machineChoice == 2) {
                machineScore = machineScore + 2;
            } else if (playerChoice == 1 && machineChoice == 0) {
                machineScore = machineScore + 5;
            } else if (playerChoice == 1 && machineChoice == 2) {
                playerScore = playerScore + 1;
            } else if (playerChoice == 2 && machineChoice == 0) {
                playerScore = playerScore + 2;
            } else if (playerChoice == 2 && machineChoice == 1) {
                machineScore = machineScore + 1;
            }
        }
        if (playerScore > machineScore) {
            System.out.println("Вы выиграли со счётом: " + playerScore + " : " + machineScore);
        } else if (playerScore < machineScore) {
            System.out.println("Вы проиграли со счётом: " + playerScore + " : " + machineScore);
        } else {
            System.out.println("Ничья! Счёт: " + playerScore + " : " + machineScore);
        }
    }
}
