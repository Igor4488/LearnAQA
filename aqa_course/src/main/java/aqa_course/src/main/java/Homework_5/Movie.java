package Homework_5;

// создайте класс Movie (можно использовать тот, что создавали ранее)
// в классе создайте поля:
// - название
// - рейтинг (от 0 до 10)
// - жанр
// - страна
// - есть ли оскар (да/нет)

import java.util.Objects;

public class Movie {

    private String nameOfTheMovie;  // название фильма
    private float rating;           // рейтинг фильма
    private String genre;           // жанр
    private String countryOfMovie;  // страна фильма
    private boolean haveOscar;      // есть ли оскар (да/нет)
    private String yearOfMovie;     // год фильма

    // Конструктор класса
    public Movie(String nameOfTheMovie, float rating, String genre, String countryOfMovie,
                 boolean haveOscar, String yearOfMovie) {
        this.nameOfTheMovie = nameOfTheMovie;
        this.rating = rating;
        this.genre = genre;
        this.countryOfMovie = countryOfMovie;
        this.haveOscar = haveOscar;
        this.yearOfMovie = yearOfMovie;
    }

    // Необходимые Геттеры и сеттеры
    public String getNameOfTheMovie() {
        return nameOfTheMovie;
    }

    public float getRating() {
        return rating;
    }

    public String getGenre() {
        return genre;
    }

    public String getCountryOfMovie() {
        return countryOfMovie;
    }

    public boolean isHaveOscar() {
        return haveOscar;
    }

    public String getYearOfMovie() {
        return yearOfMovie;
    }

    // Переопределение методов equals, hashCode, toString
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Float.compare(rating, movie.rating) == 0 && haveOscar == movie.haveOscar && Objects.equals
                (nameOfTheMovie, movie.nameOfTheMovie) && Objects.equals(genre, movie.genre) && Objects.equals
                (countryOfMovie, movie.countryOfMovie) && Objects.equals(yearOfMovie, movie.yearOfMovie);
    }

    public int hashCode() {
        return Objects.hash(nameOfTheMovie, rating, genre, countryOfMovie, haveOscar, yearOfMovie);
    }

    public String toString() {
        return "Movie{" +
                "nameOfTheMovie='" + nameOfTheMovie + '\'' +
                ", rating=" + rating +
                ", genre='" + genre + '\'' +
                ", countryOfMovie='" + countryOfMovie + '\'' +
                ", haveOscar=" + haveOscar +
                ", yearOfMovie='" + yearOfMovie + '\'' +
                '}';
    }
}
