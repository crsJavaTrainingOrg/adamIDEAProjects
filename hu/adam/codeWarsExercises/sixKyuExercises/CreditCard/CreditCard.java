package hu.adam.codeWarsExercises.sixKyuExercises.CreditCard;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CreditCard {
    public static boolean validate(String n) {
        String[] digs = n.split("//B");
        int[] digits = new int[n.length()];
        for (int i = 0; i < n.length(); i++) {
            digits[i] = Integer.parseInt(String.valueOf(n.charAt(i)));
        }
        for (int j = digits.length - 2; j >= 0; j = j-2) {
            digits[j] = digits[j] * 2;

            if (digits[j] > 9) {
                digits[j] = digits[j] - 9;
            }
        }
        System.out.println(Arrays.toString(digits));

        int sum = 0;
        for (int k = 0; k < digits.length; k++) {
            sum = sum + digits[k];
        }
        if (sum % 10 == 0) {
            return true;
        }
        return false;

    }

}

