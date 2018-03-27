package hu.adam.codeWarsExercises.sixKyuExercises.WorkingDays;

import java.time.LocalDate;

public class WorkingDaysTwoTest {
    public static void main(String[] args) {
        System.out.println(WorkingDaysTwo.count(LocalDate.of(-1000, 6, 1), LocalDate.of(-970, 4, 1)));
        System.out.println(LocalDate.of(2017, 6, 1).getDayOfWeek());

    }
}
