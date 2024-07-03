package Homework_5;

import java.util.ArrayList;
import java.util.List;

public class Task3 {

// Создайте в другом классе метод psvm.
// D этом методе объявите список films
// Положите в список 3 любимых фильма
// Выведите на экран информацию о фильме по индексу 1

    public static void main(String[] args) {

        // Создание списка объектов films
        List<Movie> films = new ArrayList<>();

        // Заполнение списка объектов  с использованием ранее созданного класса Movie
        films.add(new Movie("Криминальное чтиво", 8.9F,
                "преступление, драма", "США", true,
                "1994"));
        films.add(new Movie("Карты, деньги, два ствола", 8.1F,
                "чёрная комедия", "Великобритания", false,
                "1998"));
        films.add(new Movie("Иди и смотри", 8.4F,
                "военная драма", "СССР", false,
                "1985"));

        // Вывод не экран информации о фильме по индексу 1
        System.out.println("\n Фильм: " + films.get(1).getNameOfTheMovie() + ". Жанр: " + films.get(1).getGenre() +
                ". Год выпуска: " + films.get(1).getYearOfMovie() + ". Страна: " + films.get(1).getCountryOfMovie() +
                ". Рейтинг IMDB: " + films.get(1).getRating() + ". Оскар: " + ((films.get(1).isHaveOscar()) ? "Есть." : "Нет."));
    }
}
