package Homework_5;

// создайте класс Company (кинокомпания)
// в классе создайте поля:
// - название
// - год основания
// - список фильмов, которые компания выпустила (по 3 штуки)

import java.util.List;
import java.util.Objects;

public class Company {

    private String companyName;
    private String yearOfFoundation;
    private List<String> listOfMovies;

    // Конструктор класса
    public Company(String companyName, String yearOfFoundation, List<String> listOfMovies) {
        this.companyName = companyName;
        this.yearOfFoundation = yearOfFoundation;
        this.listOfMovies = listOfMovies;
    }

    // Геттеры и сеттеры
    public String getCompanyName() {
        return companyName;
    }

    public List<String> getListOfMovies() {
        return listOfMovies;
    }

    // Переопределение методов equals, hashCode, toString
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(companyName, company.companyName) && Objects.equals(yearOfFoundation,
                company.yearOfFoundation) && Objects.equals(listOfMovies, company.listOfMovies);
    }

    public int hashCode() {
        return Objects.hash(companyName, yearOfFoundation, listOfMovies);
    }

    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", yearOfFoundation='" + yearOfFoundation + '\'' +
                ", listOfMovies=" + listOfMovies +
                '}';
    }
}
