package hu.adam.codeWarsExercises.sixKyuExercises.WorkingDays;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class WorkingDays {

    public static int count(final LocalDate start, final LocalDate end) {
        int workingday = 0;
        int lengtOfMonth = 0;
        int monthIneed = start.getMonthValue();

        for (int i = start.getYear(); i <= end.getYear(); i++) {
            for (int j = monthIneed; j <= end.getMonthValue() || i <= end.getYear(); j++) {
                if (LocalDate.of(i, j, 1).getMonth().equals(Month.FEBRUARY) && LocalDate.of(i, j, 1).isLeapYear()) {
                    lengtOfMonth = 29;
                } else {
                    lengtOfMonth = LocalDate.of(i, j, 1).lengthOfMonth();
                }
                for (int k = 1; k <= lengtOfMonth; k++) {

                    if (workingday == 0) {
                        k = firstMondayOfMonth(start);
                    }
                    if (!LocalDate.of(i, j, k).getDayOfWeek().equals(DayOfWeek.SATURDAY) && !LocalDate.of(i, j, k).getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
                        workingday++;
                    }
                    if (LocalDate.of(i, j, k).getDayOfWeek().equals(DayOfWeek.FRIDAY) && k + 7 > LocalDate.of(i, j, k).lengthOfMonth() && j == end.getMonthValue() && i == end.getYear()) {
                        return workingday;
                    }
                }
                if (j == 12) {
                    monthIneed = 1;
                    break;
                }
            }

        }
        return workingday;
    }

    private static int firstMondayOfMonth(LocalDate date) {
        LocalDate temp = date;
        int i = 1;
        while (!temp.getDayOfWeek().equals(DayOfWeek.MONDAY)) {
            temp = LocalDate.of(temp.getYear(), temp.getMonth(), temp.getDayOfMonth() + 1);
            i++;
        }
        return i;


    }


}

