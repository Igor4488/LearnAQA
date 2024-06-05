package Homework_1;

public class Task1 {

    public static void main(String[] args) {

        // Класс String предназначен для работы со строками, все строковые литералы,
        // определённые в Java программе - это экземпляры класса String
        String homeExercise = "Домашнее задание номер 1"; // Объявляем переменную homeExercise,
                                                          // присваиваем ей значение
        System.out.println(homeExercise); // Вывод на консоль текстовой переменной

        int result;     // Объявление целочисленной переменной для сохранения результатов
                        // работы методов класса String
        boolean resultBoolean;  // Объявление переменной типа Boolean сохранения результатов
                                // работы методов,использующих такие переменные

        // Метод .length(), возвращающий длину строки
        result = homeExercise.length();
        System.out.println("Метод .length() - Длина строки = " + result);

        // Метод .isEmpty(), проверяющий, пустая ли строка.  Если в строке отсутствуют любые символы
        // или значение строки = null возвращает значение true
        resultBoolean = homeExercise.isEmpty();
        System.out.println("Метод .isEmpty() - Пустая ли строка = " + resultBoolean);

        // Метод .isBlank(), проверяющий, пустая ли строка с учётом пробелов. Если в строке отсутствуют
        // любые символы или значение строки = null или строка заполнена исключительно пробелами,
        // возвращает значение true
        resultBoolean = homeExercise.isBlank();
        System.out.println("Метод .isBlank() - Пустая ли строка (строка, заполненная одними пробелами, " +
                           "также считается пустой) = " + resultBoolean);

        // Метод, .substring(x, y) возвращающий значение строковой переменной начиная c x символа
        // до y символ включительно (Первый символ строки имеет нумерацию 0)
        System.out.println(homeExercise.substring(2, 8));

        // Метод, .indexOf('char') возвращающий значение индекса первого появления символа в строке
        // (нумерация индексов с ноля). В случае отсутствия символа возвращается -1
        System.out.println(homeExercise.indexOf('а'));

        // Метод, .lastIndexOf('char') возвращающий значение индекса последнего пояыления символа в строке
        // (нумерация индексов с ноля). В случае отсутствия символа возвращается -1
        System.out.println(homeExercise.lastIndexOf('а'));

        // Метод, .toLowerCase() переводит все буквы в строке в прописные
        System.out.println(homeExercise.toLowerCase());

        // Метод, .toUpperCase() переводит все буквы в строке в заглавные
        System.out.println(homeExercise.toUpperCase());

        // Метод, .replace(char1, char2) заменяет в строке все символы char1 на символы char2
        System.out.println(homeExercise.replace('а', 'ы'));

        // Метод, .startsWith("text") возвращает значение true в случае, если последовательность символов
        // "text" является первой в последовательности символов строки
        System.out.println(homeExercise.startsWith("Дом"));

        // Метод, .endsWith("text") возвращает значение true в случае, если последовательность символов
        // "text" является последней в последовательности символов строки
        System.out.println(homeExercise.endsWith(" 1"));

        // Метод, .repeat(int: x) выводит строку на консоль x раз
        // "text" является последней в последовательности символов строки
        System.out.println(homeExercise.repeat(2));

        // Метод, .contains("text") возвращает значение true в случае, если строка содержит
        // подстроку "text", в противном случае false
        System.out.println(homeExercise.contains("ом"));

        // Метод, .concat("text") добавляет значение "text" в конец строки
        System.out.println(homeExercise.concat("ом"));

        // Метод, .trim() удаляет пробелы в начале и в конце строки
        System.out.println(homeExercise.trim());

        // Метод, .equals("text") сравнивает "text" со значением строковой переменной,
        // возвращвет true в случае полного совпадения строк
        System.out.println(homeExercise.equals("Домашнее задание номер 1"));
    }
}
