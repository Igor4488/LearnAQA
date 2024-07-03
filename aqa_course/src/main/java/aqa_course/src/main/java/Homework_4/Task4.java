package Homework_4;

import java.util.Scanner;
import java.util.SortedMap;

public class Task4 {
// Переменная String с именем password.
// Опишите алгоритм проверки пароля. Требования к паролю:
// - длина пароля не меньше 8 символов. Иначе написать ошибку "Пароль не менее 8 символов"
// - пароль должен содержать минимум одну цифру. Иначе написать ошибку
//   "Пароль должен содержать минимум 1 цифру"
// - пароль должен содержать минимум 1 из символов [ !, @, #, $, %, ^, &, *, №].
//   Иначе написать ошибку "Пароль должен содержать минимум 1 спецсимвол"
// - если пароль подходит по всем критериям, написать "пароль принят"

    public static void main(String[] args) {
        String password;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите пароль: ");                 // Ввод пароля
        password = input.nextLine();

        if (password.length() < 8) {                          // Проверка длины пароля
            System.out.println("Пароль не менее 8 символов");
        }
        boolean ifContainsNumbers = password.contains("0") | password.contains("1") | password.contains("2") |
                password.contains("3") | password.contains("4") | password.contains("5") |
                password.contains("6") | password.contains("7") | password.contains("8") | // Наличие цифр
                password.contains("9");
        boolean ifContainsSymbols = password.contains("!") | password.contains("@") | password.contains("#") |
                password.contains("$") | password.contains("%") | password.contains("^") |
                password.contains("&") | password.contains("*") | password.contains("№");  // Наличие спецсимволов

        if (!ifContainsNumbers) {
            System.out.println("Пароль должен содержать минимум 1 цифру");
        }
        if (!ifContainsSymbols) {
            System.out.println("Пароль должен содержать минимум 1 спецсимвол");
        }
        if (!(password.length() < 8) & ifContainsSymbols & ifContainsNumbers) {
            System.out.println("Пароль принят");
        }
    }
}
//        char ch;
//        byte countErrorLength = 1, countErrorNumber = 0, countErrorSymbol = 0; // Объявление переменных -
//                                                                               // счётчиков ошибок ввода
//        if (password.length() < 8) {    // Проверка длины пароля
//        countErrorLength = 0;

//        for (int i = 0; i < password.length(); i++) {
//            ch = password.charAt(i);
//            if (ch == '0' | ch == '1' | ch == '2' | ch == '3' | ch == '4' |       // Проверка на наличие
//                    ch == '5' | ch == '6' | ch == '7' | ch == '8' | ch == '9') {  // цифр в пароле
//                countErrorNumber = 1;
//            }
//            if (ch == '!' | ch == '!' | ch == '!' | ch == '@' | ch == '#' | ch == '$' | // Проверка на наличие
//                    ch == '%' | ch == '^' | ch == '&' | ch == '*' | ch == '№') {        // спецсимволов в пароле
//                countErrorSymbol = 1;
//            }
//        }
//        if (countErrorLength + countErrorNumber + countErrorSymbol == 3) {
//            System.out.println("Пароль принят");
//        }
//        if (countErrorLength == 0) {
//            System.out.println("Пароль не менее 8 символов");
//        }
//        if (countErrorNumber == 0) {
//            System.out.println("Пароль должен содержать минимум 1 цифру");
//        }
//        if (countErrorSymbol == 0) {
//            System.out.println("Пароль должен содержать минимум 1 спецсимвол");
//        }


//       if (ch == ('0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9')) {   // Хотел сократить
//       countErrorNumber = 1;                                                  // Не получилось