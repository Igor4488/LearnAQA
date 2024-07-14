package Homework_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SortedMap;

public class Task4 {
// создайте класс Company (кинокомпания)
// .....
// Создайте в другом классе метод psvm,  в этом методе объявите список companies.
// Положите в список 3 кинокомпании, каждой кинокомпании запишите в портфолио по 3 фильма.
// Напечатайте информацию о всех компаниях в формате {название компании}: {названия всех фильмов}

    public static void main(String[] args) {

        // Объявление списка companies
        List<Company> companies = new ArrayList<>();

        // Заполнение списка тремя кинокомпаниями с тремя фильмами в портфолио
        companies.add(new Company("Мосфильм", "1924",
                new ArrayList<>(Arrays.asList("Они сражались за Родину", "Джентельмены удачи", "Любовь и голуби"))));
        companies.add(new Company("Ленфильм", "1918",
                new ArrayList<>(Arrays.asList("Собачье сердце", "Шерлок Холмс и доктор Ватсон", "Собака на сене"))));
        companies.add(new Company("Беларусьфильм", "1924",
                new ArrayList<>(Arrays.asList("Иди и смотри", "Город мастеров", "Белые росы"))));

        // Контрольный вывод на консоль
        System.out.println(); // Пустая строка
        for (Company comp : companies) {
            System.out.println(comp);
        }
        System.out.println(); // Пустая строка

        // Вывод на консоль информации о кинокомпаниях и списках их фильмов
        for (Company comp : companies) {
            System.out.println(" { " + comp.getCompanyName() + " } :  { " +
                    comp.getListOfMovies().toString().replaceAll("^\\[|]$", "") + " } ");
        }
    }
}
