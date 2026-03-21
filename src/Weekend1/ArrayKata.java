package Weekend1;

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

    public static int[] oddNumbersIn(int[] numbers) {
        int length = noOfOddNumbersIn(numbers);
        int[] oddNumbers = new int[length];
        int index = 0;

        for (int number : numbers) {
            if (number % 2 != 0) oddNumbers[index++] = number;
        }
        return oddNumbers;
    }

    public static int[] squareNumbersIn(int[] numbers) {
        int length = numbers.length;
        int[] squaredNumbers = new int[length];

        for (int i = 0; i < numbers.length; i++) squaredNumbers[i] = numbers[i] * numbers[i];

        return squaredNumbers;
    }
}
