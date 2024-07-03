package Homework_6;

import java.time.LocalDateTime;

public interface HumanReadableTimestamp {
    String getTimestamp(LocalDateTime eventTimestamp);

    public static String function(LocalDateTime timestamp) {
        timestamp = LocalDateTime.now();
        String dd = "Возврат";
        return dd;
    }
}
