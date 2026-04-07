package dsa;

import java.util.Arrays;

public class Sort {
    public static int[] sort(int[] array){
        for (int i = 0; i < array.length; i++){
//            System.out.println("Iteration " + i);
            for (int j = 0; j < (array.length - i - 1); j++) {
                if (array[j] > array[j + 1]) {
                    array[j] = array[j] + array[j+1];
                    array[j+1] = array[j] - array[j+1];
                    array[j] = array[j] - array[j+1];
                }
            }
//            System.out.println(Arrays.toString(array));

        }
        return array;
    }

    public static int divide(int number, int divisor){
        if (divisor < 1) throw new IllegalArgumentException("Divisor must be a positive integer");
        if (number == 0) return 0;

        int quotient = 0;
        int count = 0;

        if (number >= 0) {
            for (int i = 0; i <= number; i++) {
                if (count == divisor) {
                    quotient++;
                    count = 0;
                }
                count++;
            }
        } else {
            for (int i = number; i <= 0; i++) {
                if (count == divisor) {
                    quotient--;
                    count = 0;
                }
                count++;
            }
        }
        return quotient;
    }
}
