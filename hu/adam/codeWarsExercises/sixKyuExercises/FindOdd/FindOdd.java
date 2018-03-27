package hu.adam.codeWarsExercises.sixKyuExercises.FindOdd;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindOdd {
    public static int findIt(int[] A) {
        List<Integer> numbers = Arrays.stream(A).boxed().collect(Collectors.toList());
        List<String> strings = numbers.stream().map(Object::toString).collect(Collectors.toList());
        for (String number : strings) {
            long numberOfNumbers = strings.stream().filter(k -> k.equals(number)).count();
            if (numberOfNumbers % 2 != 0) {
                return Integer.parseInt(number);
            }
        }
        return 0;
    }
}
