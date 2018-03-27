package hu.adam.codeWarsExercises.sixKyuExercises.HumanReadableTime;
//https://www.codewars.com/kata/human-readable-time
public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int hours = seconds / 3600;
        seconds = seconds - hours * 3600;
        int minutes = seconds / 60;
        seconds = seconds - minutes * 60;
        return String.format("%02d:%02d:%02d", hours, minutes, seconds,2,3,4);
    }


}

