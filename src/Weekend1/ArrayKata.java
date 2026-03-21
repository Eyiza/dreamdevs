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
}
