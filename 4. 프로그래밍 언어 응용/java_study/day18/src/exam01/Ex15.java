package exam01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex15 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy.MM.dd a hh:mm (E)");
        String dateStr = formatter.format(now);
        System.out.println(dateStr);
    }
}
