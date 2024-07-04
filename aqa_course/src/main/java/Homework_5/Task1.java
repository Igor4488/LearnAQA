package Homework_5;

import java.util.SortedMap;

public class Task1 {

// Опишите класс Player (игрок)
// У игрока есть поля:
// - id (int)
// - nickname (String)
// - isOnline (boolean)
// Все поля должны быть приватными
// Переопределите для класса методы equals(), hashCode() и toString()

// В отдельном классе создайте двух игроков с одинаковыми значениями полей.
// Убедитесь, что player1 == player2 ==> false
// Убедитесь, что player1.equals(player2) ==> true

    public static void main(String[] args) {

        // Создание двух игроков с одинаковым значением полей
        Player player1 = new Player(1, "Leeroy Jenkins", true);
        Player player2 = new Player(1, "Leeroy Jenkins", true);

        // Проверка условия player1 == player2 ==> false
        System.out.println("player1 == player2 ==> " + (player1 == player2));

        // Проверка условия player1.equals(player2) ==> true
        System.out.println("player1.equals(player2) ==> " + player1.equals(player2));
    }
}
