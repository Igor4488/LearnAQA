package Homework_5;

import java.util.*;

public class Task5Task6 {

//  ЗАДАНИЕ 5
//  В задании 1 вы создали класс Player. Создайте хранилище игроков. Его будет использовать программа,
//  которая описывает турнир. Требования:
//  - количество игроков неизвестно заранее. Может быть 2, а может 100;
//  - в турнир каждый игрок может записаться только 1 раз (не может быть дублей);
//  Cоздайте 10 игроков и поместите их в хранилище. Убедитесь, что если один игрок помещен в хранилище дважды,
//  дубликат не запишется

//  ЗАДАНИЕ 6
//  В задании 1 вы создали класс Player. Создайте Map<Player, Integer> points для хранения очков игроков,
//  положите в мэпу 10 игроков. У каждого 0 очков.
//  Игроку с id=4 запишите 10 очков
//  Игроку с id=7 – 12 очков
//  Игроку с id=8 – 11 очков
//  Игроку с id=9 – 13 очков
//  Игроку с id=10 – 5 очков
//  Выведите на экран 3х лучших игроков турнира. На первом месте должен быть игрок с максимальным результатом.

    public static void main(String[] args) {

        // Имитация входных данных: Никнеймы игроков. Должны быть уникальны.
        String[] inputData = {"AAA1!", "BBB2@", "ССС3№", "DDD4$", "EEE5%", "FFF6^", "GGG7&", "HHH8*", "KKK9(", "LLL0)"};

        // Создаём хранилище игроков
        List<String> storagePlayers = new ArrayList<>();

        // Заполнение хранилища игроков с проверкой уникальности имён
        String nickName;
        for (int i = 0; i < 10; i++) {
            nickName = inputData[i];
            if (storagePlayers.contains(nickName)) {
                System.out.println("Игрок под именем: " + nickName + " уже зарегистрирован!");
            } else storagePlayers.add(nickName);
        }

        // Создание турнирной таблицы
        Map<Player, Integer> tournamentTable = new LinkedHashMap<>();

        // Заполнение турнирной таблицы с использованием хранилища игроков
        for (int i = 0; i < storagePlayers.size(); i++) {
            tournamentTable.put(new Player(i + 1, storagePlayers.get(i), true), 0);
        }

        // Контрольный вывод на консоль турнирной таблицы
        System.out.println();
        for (Map.Entry<Player, Integer> pair : tournamentTable.entrySet()) {
            String key = String.valueOf(pair.getKey());
            String value = String.valueOf(pair.getValue());
            System.out.println("Ключ: " + key + " : " + " значение ключа (количество набранных очков): " + value);
        }
        System.out.println();

        // Имитация ввода заработанных очков
        Map<String, Integer> points = new HashMap<>() {{
            put("1", 10);
            put("7", 12);
            put("8", 11);
            put("9", 13);
            put("10", 5);
        }};

        // Записываем игрокам заработанные очки
        for (Player key : tournamentTable.keySet()) {
            for (String pointsKey : points.keySet()) {
                if (key.toString().contains("id=" + pointsKey + ",")) {
                    tournamentTable.put(key, points.get(pointsKey));
                }
            }
        }

        // Определение трёх лучших игроков турнира (так как нам нужно определить только трёх лучших игроков турнира,
        // сортировка всего массива по убыванию не используется, так как такой код будет выполняться дольше)
        int first = 0, second = 0, third = 0;
        Player firstkey = null;
        Player secondkey = null;
        Player thirdkey = null;
        for (Map.Entry<Player, Integer> entry : tournamentTable.entrySet()) {
            Player key = entry.getKey();
            Integer value = entry.getValue();
            if (value > first) {
                third = second;
                thirdkey = secondkey;
                second = first;
                secondkey = firstkey;
                first = value;
                firstkey = key;
            } else if (value > second) {
                third = second;
                thirdkey = secondkey;
                second = value;
                secondkey = key;
            } else if (value > third) {
                third = value;
                thirdkey = key;
            }
        }

        // Вывод на консоль тройки победителей (если бы массив игроков был сортирован по количеству набранных очков,
        // можно было бы вывести в цикле необходимое количество игроков)
        System.out.println("РЕЗУЛЬТАТЫ СОРЕВНОВАНИЙ:");
        System.out.println("Игрок с ником: " + firstkey.getNickname() + " занял первое место и заработал: "
                + first + " очков!!!");
        System.out.println("Игрок с ником: " + secondkey.getNickname() + " занял второе место и заработал: "
                + second + " очков!!");
        System.out.println("Игрок с ником: " + thirdkey.getNickname() + " занял третье место и заработал: "
                + third + " очков!");
    }
}

