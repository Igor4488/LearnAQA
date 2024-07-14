package Attestation_1.Task1;

import java.util.Scanner;

public class Task1 {

//    Мальчик хочет написать на заборе признание в любви девочке из пятнадцати букв и трех пробелов.
//    На каждые три буквы мальчик тратит по 62 см длины забора, а на каждый пробел - 12 см.
//    Напишите программу, которая поможет по длине забора (введенной пользователем) выяснить, поместится ли
//    на забор такой длины надпись мальчика.

    public static void main(String[] args) {

        float fenceLength;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите длину забора в сантиметрах: ");
        fenceLength = input.nextInt();

        new DeclarationOfLove(fenceLength).isWillSeeItOrNot();
    }
}
