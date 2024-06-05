package Homework_3;

public class Movie {
    String nameOfTheMovie;  // название фильма
    float rating;           // рейтинг фильма
    String genre;           // жанр
    String countryOfMovie;  // страна фильма
    boolean haveOscar;      // есть ли оскар (да/нет)
    String yearOfMovie;     // год фильма

    public Movie (String nameOfTheMovie, float rating, String genre, String countryOfMovie,
                  boolean haveOscar, String yearOfMovie){
        this.nameOfTheMovie = nameOfTheMovie;
        this.rating = rating;
        this.genre = genre;
        this.countryOfMovie = countryOfMovie;
        this.haveOscar = haveOscar;
        this.yearOfMovie = yearOfMovie;
    }
}
