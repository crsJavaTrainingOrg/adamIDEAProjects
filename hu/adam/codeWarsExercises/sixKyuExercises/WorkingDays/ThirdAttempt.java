package hu.adam.codeWarsExercises.sixKyuExercises.WorkingDays;

import java.time.DayOfWeek;
import java.time.LocalDate;


import static java.time.temporal.TemporalAdjusters.firstInMonth;
import static java.time.temporal.TemporalAdjusters.lastInMonth;

public class ThirdAttempt {
    public static int count(final LocalDate start, final LocalDate end) {

        int workingdays = 0;

        LocalDate firstMonday = start.with(firstInMonth(DayOfWeek.MONDAY));
        LocalDate lastFriday = end.with(lastInMonth(DayOfWeek.FRIDAY));


        for (LocalDate date = firstMonday; date.isBefore(lastFriday); date = date.plusDays(1)) {
            if (!date.getDayOfWeek().equals(DayOfWeek.SATURDAY) && !date.getDayOfWeek().equals(DayOfWeek.SUNDAY))
            {
                workingdays++;
            }
        }

        return workingdays+1;



    }
}