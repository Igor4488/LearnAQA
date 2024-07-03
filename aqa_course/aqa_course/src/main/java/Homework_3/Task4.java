package Homework_3;

public class Task4 {
    // напечатайте на экран числа от 1 до 1 000 000 000

    public static void main(String[] args) {

        //  Код для вывода чисел от 1 до  1 000 000 000

        //  for (int i = 0; i < 1_000_000_000; i = i + 1){
        //  System.out.println(i+1);

        // Так как цикл работает слишком долго, для демонстрации его работы испульзую два цикла

        // Начало работы цикла
        for (int i = 0; i < 5; i = i + 1) {
            System.out.println(i + 1);
        }
        System.out.println(".........");
        //  Конец работы цикла
        for (int i = 999_999_995; i < 1_000_000_000; i = i + 1){
        System.out.println(i+1);
        }

    }
}
