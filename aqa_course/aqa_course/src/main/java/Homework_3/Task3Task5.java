package Homework_3;

import java.util.Objects;

public class Task3Task5 {

// Task3
// создайте класс Movie
// в классе создайте поля:
// ○ название
// ○ рейтинг (от 0 до 10)
// ○ жанр
// ○ страна
// ○ есть ли оскар (да/нет)
// создайте в другом классе метод psvm.
// в этом методе объявите массив films
// положите в массив 3 любимых фильма

    public static void main(String[] args) {

        // Объявление массива и присваивание значений элементам массива
        Movie[] films = new Movie[3];
        films[0] = new Movie("Криминальное чтиво", 8.9F,
                             "преступление, драма", "США", true,
                             "1994");
        films[1] = new Movie("Карты, деньги, два ствола", 8.1F,
                             "чёрная комедия", "Великобритания", false,
                             "1998");
        films[2] = new Movie("Иди и смотри", 8.4F,
                             "военная драма", "СССР", false,
                             "1985");

        // Контрольный вывод на консоль
        for (Movie movie : films){
            System.out.println("Название фильма: " + movie.nameOfTheMovie + ", рейтинг IMDB: " + movie.rating +
                               ", жанр: " + movie.genre + ", страна выпуска: " + movie.countryOfMovie +
                               ", наличие премии Оскар: " + movie.haveOscar);
        }

        System.out.println(); // Строка разделитель между заданиями

        // Task 5
        // используя цикл, напечатайте информацию о всех фильмах из задания
        // "задача про массив объектов" в формате "год - название - жанр - рейтинг"

        for (int i = 0; i < 3; i = i + 1){
            String info = "Год: " + films[i].yearOfMovie + ", Название: " + films[i].nameOfTheMovie + ", Жанр: " +
                                    films[i].genre + ", Рейтинг: " + films[i].rating;
            System.out.println(info);
        }
    }
}
