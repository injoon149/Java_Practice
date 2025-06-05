package DateTime.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestAdjusters {
    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

        LocalDate ld = LocalDate.of(year, month, 1);
        DayOfWeek firstDayOfWeek = ld.getDayOfWeek();
        DayOfWeek lastDayOfWeek = ld.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();
        System.out.println("firstDayOfWeek: " + firstDayOfWeek);
        System.out.println("lastDayOfWeek: " + lastDayOfWeek);

    }
}
