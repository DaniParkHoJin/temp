package exam01;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Ex09 {
    public static void main(String[] args) {
        ZoneId.getAvailableZoneIds().stream().forEach(System.out::println);
    }
}
