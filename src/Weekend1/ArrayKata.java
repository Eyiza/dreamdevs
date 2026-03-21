package Weekend1;

import java.util.Arrays;

public class ArrayKata {
    public static int maximumIn(int[] numbers) {
        int maximum = numbers[0];
        for (int number : numbers) {
            if (number > maximum) maximum = number;
        }
        return maximum;
    }

    public static int minimumIn(int[] numbers) {
        int minimum = numbers[0];
        for (int number : numbers) {
            if (number < minimum) minimum = number;
        }
        return minimum;
    }

    public static int sumOf(int[] numbers) {
        int sum = 0;
        for (int number : numbers) sum += number;
        return sum;
    }

    public static int sumOfEvenNumbersIn(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) sum += number;
        }
        return sum;
    }

    public static int sumOfOddNumbersIn(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 != 0) sum += number;
        }
        return sum;
    }

    public static int[] maximumAndMinimumOf(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            if (number < min) min = number;
            if (number > max) max = number;
        }
        return new int[]{min, max};
    }

    public static int noOfOddNumbersIn(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 != 0) count ++;
        }
        return count;
    }

    public static int noOfEvenNumbersIn(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 0) count ++;
        }
        return count;
    }

    public static int[] evenNumbersIn(int[] numbers) {
        int length = noOfEvenNumbersIn(numbers);
        int[] evenNumbers = new int[length];
        int index = 0;

        for (int number : numbers) {
            if (number % 2 == 0) evenNumbers[index++] = number;
        }
        return evenNumbers;
    }
}
