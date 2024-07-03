package Homework_6;

import java.time.*;

public class Task1 {

    private static Object HumanReadableTimestamp;

    public static String function (LocalDateTime timestamp){
        timestamp = LocalDateTime.now();
        String dd = "Возврат";
        return dd;
    }

    public static void main(String[] args) {

        LocalDate publishDate = LocalDate.now().minusDays(33);
        LocalTime publishTime = LocalTime.now().minusMinutes(0);
        LocalDateTime timestamp = LocalDateTime.of(publishDate, publishTime);

        String ff = function(timestamp);
        System.out.println(ff);



//        HumanReadableTimestamp humanReadableTimestamp = new publishedIn(timestamp);
//        humanReadableTimestamp.getTimestamp(timestamp);

        Duration duration = Duration.between(timestamp, LocalDateTime.now());

        if (Duration.ofHours(1).compareTo(duration) > 0) {
            System.out.println("Меньше часа назад");
            long longDuration = duration.toMinutes();
            String stringDuration = Long.toString(longDuration);
            String cutDuration = stringDuration.substring(stringDuration.length() - 1);
            if ((cutDuration).equals("1") && longDuration != 11) {
                System.out.println("Опубликовано " + longDuration + " минуту назад.");
            } else if ((cutDuration.equals("2") && longDuration != 12) ||
                       (cutDuration.equals("3") && longDuration != 13) ||
                       (cutDuration.equals("4") && longDuration != 14)) {
                System.out.println("Опубликовано " + longDuration + " минуты назад.");
            } else {
                System.out.println("Опубликовано " + longDuration + " минут назад.");
            }
        } else if (Duration.ofDays(1).compareTo(duration) > 0) {
            System.out.println("Меньше дня назад");
            long longDuration = duration.toHours();
            String stringDuration = Long.toString(longDuration);
            String cutDuration = stringDuration.substring(stringDuration.length() - 1);
            if ((cutDuration).equals("1") && longDuration != 11) {
                System.out.println("Опубликовано " + longDuration + " час назад.");
            } else if ((cutDuration.equals("2") && longDuration != 12) ||
                       (cutDuration.equals("3") && longDuration != 13) ||
                       (cutDuration.equals("4") && longDuration != 14)) {
                System.out.println("Опубликовано " + longDuration + " часа назад.");
            } else {
                System.out.println("Опубликовано " + longDuration + " часов назад.");
            }
        } else if (Duration.ofDays(2).compareTo(duration) > 0) {
            System.out.println("Вчера");
            long longDuration = duration.toHours();
            if ((24 <= longDuration) && (longDuration <= 47)){
                System.out.println("Опубликовано вчера");
            }
        } else {
            System.out.println("Несколько дней назад");
            long longDuration = duration.toDays();
            String stringDuration = Long.toString(longDuration);
            String cutDuration = stringDuration.substring(stringDuration.length() - 1);
            if ((cutDuration).equals("1") && longDuration != 11) {
                System.out.println("Опубликовано " + longDuration + " день назад.");
            } else if ((cutDuration.equals("2") && longDuration != 12) ||
                    (cutDuration.equals("3") && longDuration != 13) ||
                    (cutDuration.equals("4") && longDuration != 14)) {
                System.out.println("Опубликовано " + longDuration + " дня назад.");
            } else {
                System.out.println("Опубликовано " + longDuration + " дней назад.");
            }
        }

    }
}
