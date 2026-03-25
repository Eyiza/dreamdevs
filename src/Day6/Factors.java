package Day6;

import java.util.ArrayList;

public class Factors {
    public static int[] calculateFactors(int number) {
        int count = 0;
        for (int i=2; i<=number; i++) {
            if (number % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i=2; i<=number; i++) {
            if (number % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static ArrayList<Integer> calculateDivisors(int number) {
        ArrayList<Integer> divisors = new ArrayList<>();
        int divisor = 2;

        while (number != 1){
            if (number % divisor == 0) {
                divisors.add(divisor);
                number /= divisor;
            }
            else divisor++;
        }

        return divisors;
    }
}
