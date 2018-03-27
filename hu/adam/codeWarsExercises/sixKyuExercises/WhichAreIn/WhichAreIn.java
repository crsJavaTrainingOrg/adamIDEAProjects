package hu.adam.codeWarsExercises.sixKyuExercises.WhichAreIn;
//https://www.codewars.com/kata/550554fd08b86f84fe000a58
import java.util.Set;
import java.util.TreeSet;

public class WhichAreIn {

    public static String[] inArray(String[] array1, String[] array2) {
        Set<String> words = new TreeSet<>();

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array2[j].contains(array1[i])) {
                    words.add(array1[i]);
                }
            }
        }
        String[] result = new String[words.size()];
        int k = 0;
        for (String word : words) {
            result[k] = word;
            k++;
        }
        return result;
    }
}
