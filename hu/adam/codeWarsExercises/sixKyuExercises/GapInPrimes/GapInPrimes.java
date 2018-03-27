package hu.adam.codeWarsExercises.sixKyuExercises.GapInPrimes;

public class GapInPrimes {
    public static long[] step(int g, long m, long n) {
        long tmpPrime = 0;
        long secondPrime = 0;
        for (long i = m; i <= n; i++) {
            if (isPrime(i)) {
                tmpPrime = i;
                for (long j = tmpPrime; j <= tmpPrime + g; j++) {
                    if (isPrime(j) && j - tmpPrime == g) {
                        secondPrime = j;
                        return new long[]{tmpPrime, secondPrime};
                    }

                }
            }
        }
        return null;
    }


    private static boolean isPrime(long n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

}
