package hu.adam.codeWarsExercises.sevenKyuExercises;
//https://www.codewars.com/kata/5552101f47fc5178b1000050
public class DigPow {
    public static long digPow(int n, int p) {
        String number = String.valueOf(n);
        char[] digits = number.toCharArray();
        int result = 0;
        for (int i = 0; i < digits.length; i++) {
            result = result + (int)Math.pow(Character.getNumericValue(digits[i]),p);
            p++;
        }
        if(result % n != 0){
            System.out.println("-1");
            return -1;
        }
        result = result / n;
        System.out.println(result);

        return result;


    }
}
