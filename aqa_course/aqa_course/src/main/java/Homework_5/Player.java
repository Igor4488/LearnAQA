package Homework_5;

// Опишите класс Player (игрок)
// У игрока есть поля:
// - id (int)
// - nickname (String)
// - isOnline (boolean)
// Все поля должны быть приватными
// Переопределите для класса методы equals(), hashCode() и toString()

import java.util.Objects;

public class Player {

    // Поля класса
    private int id;
    private String nickname;
    private boolean isOnline;

    // Конструктор класса
    public Player(int id, String nickname, boolean isOnline) {
        this.id = id;
        this.nickname = nickname;
        this.isOnline = isOnline;
    }

    // Необходимые геттеры и сеттеры
    public String getNickname() {
        return nickname;
    }

    // Переопределение метода equals
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && isOnline == player.isOnline && Objects.equals(nickname, player.nickname);
    }

    // Переопределение метода hashCode
    public int hashCode() {
        return Objects.hash(id, nickname, isOnline);
    }

    // Переопределение метода toString
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", isOnline=" + isOnline +
                '}';
    }
}
