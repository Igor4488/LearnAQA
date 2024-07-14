package Attestation_1.Task2;

import java.util.Calendar;
import java.util.Date;

public class Summer {
    private final int daysBetween;
    private final Calendar currentDate;

    public Summer(int daysBetween, Calendar currentDate) {
        this.daysBetween = daysBetween;
        this.currentDate = currentDate;
    }

    public void getMessage() {
        float humidity = new HumiditySensor().setHumidity();
        if ((humidity < 30 && daysBetween >= 2) || daysBetween >= 30) {
            System.out.println("Немедленно полейте кактус!");
        } else if (daysBetween < 2) {
            int daysBeforeWatering = 2 - daysBetween;
            Date dt = new Date();
            currentDate.setTime(dt);
            currentDate.add(Calendar.DATE, daysBeforeWatering);
            dt = currentDate.getTime();
            System.out.println("Дата следующего полива кактуса не раньше: " + dt
                    + ", перед поливом следует уточнить влажность воздуха!");
        } else {
            System.out.println("Дата следующего полива кактуса не ранее завтрашнего дня, " +
                    "перед поливом следует уточнить влажность воздуха!");
        }
    }
}
