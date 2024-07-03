package Homework_6;

import java.time.LocalDateTime;

public class publishedIn implements HumanReadableTimestamp{

    private LocalDateTime publishedTime;

    public publishedIn(LocalDateTime publishedTime) {
        this.publishedTime = publishedTime;
    }



    public String getTimestamp(LocalDateTime eventTimestamp) {
        System.out.println("asasas");
        return getTimestamp(null);
    }
}
