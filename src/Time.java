import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Time {
    public void showDateTime(){
        System.out.println("Instant.now():"+ Instant.now());
        System.out.println("LocalDate.now()"+ LocalDate.now());
        System.out.println("LocalTime.now()"+ LocalTime.now());
        System.out.println("LocalDateTime.now()"+ LocalDateTime.now());
    }

    public void showMoonLandingDateTime(){
        System.out.println("First Moon landing:");
        LocalDate moonLandingDate = LocalDate.of(1969, Month.JULY,20);
        LocalTime moonLandingTime = LocalTime.of(20,18);
        System.out.println("Data: "+moonLandingDate);
        System.out.println("Time: "+moonLandingTime);
    }

    public void plusTime(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate start = LocalDate.of(2017,Month.JANUARY,2);
        System.out.println(start);
        LocalDate end = start.plusDays(3);
        System.out.println(end);
        end=end.plusWeeks(1);
        System.out.println(end);
        end=end.plusMonths(6);
        System.out.println(end);
        end=end.plusYears(2);
        System.out.println(end);
    }

    public void betweenDays(){
        LocalDate finalDay = LocalDate.of(2020,Month.NOVEMBER,3);
        LocalDate now = LocalDate.now();

        System.out.printf("%d days to go... %n", ChronoUnit.DAYS.between(now,finalDay));
    }
}
