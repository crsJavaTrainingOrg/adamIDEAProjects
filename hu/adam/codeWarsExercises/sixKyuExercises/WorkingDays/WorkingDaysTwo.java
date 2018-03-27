package hu.adam.codeWarsExercises.sixKyuExercises.WorkingDays;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WorkingDaysTwo {
    public static long count(final LocalDate start, final LocalDate end) {
        int workingDays = 0;
        int days = 0;
        String[] daysOfWeek = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int startingMonth = start.getMonthValue();
        int startingYear = start.getYear();
        int endingMonth = end.getMonthValue();
        int endingYear = end.getYear();
        int daysOfCurrentMonth = start.lengthOfMonth();
        int monthINeed = startingMonth;
        LocalDate tester;
        for (int i = startingYear; i <= endingYear; i++) {

            for (int j = monthINeed; j <= endingMonth || i <= endingYear; j++) {
                for (int dayCounter = 1; dayCounter <= daysOfCurrentMonth; dayCounter++) {
                    if (workingDays == 0) {
                        dayCounter = firstMondayOfMonth(start);
                    }

                    switch (j) {
                        case 1:
                            daysOfCurrentMonth = 31;
                            break;
                        case 2:
                            if (LocalDate.of(i, 1, 1).isLeapYear()){
                                daysOfCurrentMonth = 29;
                                break;
                            }
                            else {
                                daysOfCurrentMonth = 28;
                                break;
                            }
                        case 3:
                            daysOfCurrentMonth = 31;
                            break;
                        case 4:
                            daysOfCurrentMonth = 30;
                            break;
                        case 5:
                            daysOfCurrentMonth = 31;
                            break;
                        case 6:
                            daysOfCurrentMonth = 30;
                            break;
                        case 7:
                            daysOfCurrentMonth = 31;
                            break;
                        case 8:
                            daysOfCurrentMonth = 31;
                            break;
                        case 9:
                            daysOfCurrentMonth = 30;
                            break;
                        case 10:
                            daysOfCurrentMonth = 31;
                            break;
                        case 11:
                            daysOfCurrentMonth = 30;
                            break;
                        case 12:
                            daysOfCurrentMonth = 31;
                            break;
                    }
                    workingDays++;
                    if (daysOfWeek[days].equals("Friday") && dayCounter + 7 > daysOfCurrentMonth && j == endingMonth && i == endingYear) {
                        return workingDays;
                    }

                    if (days == 6) {
                        days = 0;
                        workingDays = workingDays - 2;
                    } else {
                        days++;

                    }
                    if (dayCounter == daysOfCurrentMonth) {
                        dayCounter = 1;
                        break;
                    }
                }
                if (j == 12) {
                    monthINeed = 1;
                    break;
                }
            }
        }
        return workingDays;
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





