package Attestation_1;

import java.util.Arrays;
import java.util.List;

public class Task3 {

// Напишите программу, которая находит в массиве чисел второй по величине элемент. Например, для
// массива [1,5,7,3,2,0,4,9,6], программа выведет 7, потому что самый большой элемент - 9, а, после него, 7.

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(-9, -8, -7, -9, 0, 1, 2, 2, 3, 3);
        List<Integer> sortedList = list.stream().sorted().toList();

        int i = sortedList.size() - 1;
        while (i != 0) {
            int previousElement = sortedList.get(i - 1);
            if (previousElement != sortedList.get(i)) {
                System.out.println("Второй по величине элемент массива имеет равен: " + previousElement);
                i = 0;
            } else if (i == 1) {
                System.out.println("Невозможно найти второй по величине элемент, так как в " +
                        "массиве все элементы одинаковы и равны: " + previousElement);
                i = 0;
            } else {
                i = i - 1;
            }
        }
    }
}

