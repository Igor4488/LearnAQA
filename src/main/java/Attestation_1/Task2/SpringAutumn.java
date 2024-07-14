package Attestation_1.Task2;

import java.util.Calendar;
import java.util.Date;

public class SpringAutumn {

    private final int daysBetween;
    private final Calendar currentDate;

    public SpringAutumn(int daysBetween, Calendar currentDate) {
        this.daysBetween = daysBetween;
        this.currentDate = currentDate;
    }

    public void getMessage() {
        if (daysBetween >= 7) {
            System.out.println("Немедленно полейте кактус!");
        } else {
            int daysBeforeWatering = 7 - daysBetween;
            Date dt = new Date();
            currentDate.setTime(dt);
            currentDate.add(Calendar.DATE, daysBeforeWatering);
            dt = currentDate.getTime();
            System.out.println("Дата следующего полива кактуса: " + dt);
        }
    }
}
