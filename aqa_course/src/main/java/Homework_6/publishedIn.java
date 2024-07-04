package Homework_6;

import java.time.Duration;
import java.time.LocalDateTime;

// Класс, реализовывающий интерфейс HumanReadableTimestamp
public class publishedIn implements HumanReadableTimestamp {

    @Override
    public String getTimestamp(LocalDateTime eventTimestamp) {

        // Вычисляем длительность времени между датой и временем публикации и текущими датой и временем
        Duration duration = Duration.between(eventTimestamp, LocalDateTime.now());

        // Определяем количество дней, часов и минут, прошедших с начала публикации
        long d = duration.toSeconds() / 86400;
        long h = duration.toSeconds() / 3600 - d * 24;
        long m = duration.toSeconds() / 60 - d * 1440 - h * 60;

        String days, hours, minutes, when; // Объявляем служебные переменные, используемые для вывода результата

        // Для того чтобы избежать ошибки работы с остатком от деления при количестве дней больше 100,
        // переводим число дней в строковую переменную и определяем последний символ этой переменной
        String dd = Long.toString(d);
        String cD = dd.substring(dd.length() - 1);

        // Проверка склонения слова "день", в зависимости от количества прошедших дней
        if ((cD).equals("1") && (d) != 11) {
            days = " день ";
        } else if ((cD.equals("2") && d != 12) || (cD.equals("3") && d != 13) || (cD.equals("4") && d != 14)) {
            days = " дня ";
        } else days = " дней ";

        // Проверка склонения слова "час", в зависимости от количества прошедших часов
        if ((h % 10) == 1 && (h) != 11) {
            hours = " час ";
        } else if ((h % 10 == 2 && h != 12) || (h % 10 == 3 && h != 13) || (h % 10 == 4 && h != 14)) {
            hours = " часа ";
        } else hours = " часов ";

        // Проверка склонения слова "минута", в зависимости от количества прошедших минут
        if ((m % 10) == 1 && (m) != 11) {
            minutes = " минута ";
        } else if ((m % 10 == 2 && m != 12) || (m % 10 == 3 && d != 13) || (m % 10 == 4 && d != 14)) {
            minutes = " минуты ";
        } else minutes = " минут ";

        // Проверка условий для вывода дополнительный информации
        if (Duration.ofHours(1).compareTo(duration) > 0) {
            when = " меньше часа назад. ";
        } else if (Duration.ofDays(1).compareTo(duration) > 0) {
            when = " меньше дня назад. ";
        } else if (Duration.ofDays(2).compareTo(duration) > 0) {
            when = " вчера. ";
        } else when = "несколько дней назад. ";

        // Возвращаемое значение
        return "\nОпубликовано " + when + "\nС момента публикации прошло: " +
                d + days + h + hours + m + minutes;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
