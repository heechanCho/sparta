package sparta.Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        System.out.println("now usages");
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
    }
}
