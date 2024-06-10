package Homework_4;

public class Task5 {
// Выведите на экран числа 1 до 100. При этом:
// если число кратно 3, напечатайте Fizz
// если число кратно 5, напечатайте Buzz
// если число кратно и 3, и 5, напечатайте FizzBuzz

    public static void main(String[] args) {

        String output, output1;
        for (int i = 1; i < 101; i++) {
            output = Integer.toString(i);
            output1 = "";
            if (i % 3 == 0) {
                output = "";
                output1 = output1 + "Fizz";
            }
            if (i % 5 == 0) {
                output = "";
                output1 = output1 + "Buzz";
            }
            System.out.println(output + output1);
        }

//        for (int i = 1; i < 101; i++) {
//            String str = Integer.toString(i);
//            if (i % 3 == 0) {
//                str = "Fizz";
//            }
//            if (i % 5 == 0) {
//                str = "Buzz";
//            }
//            if (i % 3 == 0 & i % 5 == 0) {
//                str = "FizzBuzz";
//            }
//            System.out.println(str);
//        }

//        for (int i = 1; i < 101; i++) {
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }
    }
}
