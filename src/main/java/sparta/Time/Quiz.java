package sparta.Time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Quiz {
    public static void main(String[] args) {
        DateTimeFormatter newFormatter = DateTimeFormatter.ofPattern("yyyy년/MM월/dd일");
        String myDate = newFormatter.format(LocalDateTime.now());
        System.out.println(myDate);
    }
}
