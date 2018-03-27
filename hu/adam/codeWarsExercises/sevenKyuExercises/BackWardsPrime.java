package hu.adam.codeWarsExercises.sevenKyuExercises;

import java.util.StringJoiner;

//https://www.codewars.com/kata/5539fecef69c483c5a000015
public class BackWardsPrime {
    public static String backwardsPrime(final long start,final  long end){
        long temp = start;
        long reversedTemp;
        StringJoiner sj = new StringJoiner(" ");

        while(temp<=end){
            if(temp >= 10 && isPrime(temp)){

                reversedTemp = Integer.parseInt(new StringBuffer(String.valueOf(temp)).reverse().toString());
                if(isPrime(reversedTemp) && temp != reversedTemp){
                    sj.add(String.valueOf(temp));
                }
            }
            temp++;
        }

        return sj.toString();
    }

    private static boolean isPrime(long number){
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
