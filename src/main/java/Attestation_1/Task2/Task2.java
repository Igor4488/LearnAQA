package Attestation_1.Task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Task2 {

// У программиста Васи на подоконнике растёт кактус. Вася постоянно забывает его поливать, поэтому он купил
// датчик влажности и решил составить программу для отслеживания времени полива. На вход программа ждет дату
// последнего полива кактуса. Если сейчас зима (декабрь - февраль), то кактус поливается раз в месяц.
// Если осень или весна - раз в неделю. Летом поливается в зависимости от влажности воздуха, но не чаще одного
// раза в два дня. Значение влажности воздуха в программу попадает автоматически от датчика (реализуйте через
// вызов метода класса Датчик, внутри которого будет генерация случайного числа). Если влажность меньше 30%,
// кактус нужно полить. Вася ожидает от программы, что после проверки всех данных, она выведет ему
// сообщение с датой, когда надо поливать кактус.

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date dayLastWatering = dateFormat.parse("14.07.2024");
        Calendar currentDate = Calendar.getInstance();

        int daysBetween = (int) ((currentDate.getTime().getTime() - dayLastWatering.getTime()) / (24 * 60 * 60 * 1000));
        int month = currentDate.get(Calendar.MONTH);

        if (month == 11 || month == 0 || month == 1) {
            Winter winter = new Winter(daysBetween, currentDate);
            winter.getMessage();
        } else if (month == 5 || month == 6 || month == 7) {
            Summer summer = new Summer(daysBetween, currentDate);
            summer.getMessage();
        } else {
            SpringAutumn springAutumn = new SpringAutumn(daysBetween, currentDate);
            springAutumn.getMessage();
        }
    }
}
