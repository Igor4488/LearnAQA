package Attestation_1.Task2;

import java.util.Calendar;
import java.util.Date;

public class Winter {

    private final int daysBetween;
    private final Calendar currentDate;

    public Winter(int daysBetween, Calendar currentDate) {
        this.daysBetween = daysBetween;
        this.currentDate = currentDate;
    }

    public void getMessage() {

        System.out.println("Зима - раз в месяц");
        if (daysBetween >= 30) {
            System.out.println("Немедленно полейте кактус!");
        } else {
            int daysBeforeWatering = 30 - daysBetween;
            Date dt = new Date();
            currentDate.setTime(dt);
            currentDate.add(Calendar.DATE, daysBeforeWatering);
            dt = currentDate.getTime();
            System.out.println("Дата следующего полива кактуса: " + dt);
        }
    }
}
