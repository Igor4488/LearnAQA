package Homework_5;

public class TestArraysSort {

    // Проверка метода сортировки массива и результатов его работы

    public static void main(String[] args) {

        int[] count = {45, 5, 10, 34, 0, 125, 11, 1, 9, 653};
        int first = 0, second = 0, third = 0;
        for (int i = 0; i < 10; i++) {
            if (count[i] > first) {
                third = second;
                second = first;
                first = count[i];
            } else if (count[i] > second) {
                third = second;
                second = count[i];
            } else if (count[i] > third) {
                third = count[i];
            }
        }
        System.out.println(" 1: " + first + " 2: " + second + " 3: " + third);

        // Сортировка массива по возрастанию

        int buffer;
       // int ct = 0;
      //  int tr = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = i+1; j < 10; j++) {
                if (count[i] > count[j]) {
                    buffer = count[i];
                    count[i] = count[j];
                    count[j] = buffer;
                }
         //      tr = tr + 1;
            }
       //     ct = ct + 1;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(count[i]);
        }
    //  System.out.println(tr);
    }
}
