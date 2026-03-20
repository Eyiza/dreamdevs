package Weekend1;

public class Kata {
    public static boolean isEven(int number) {
        if (number % 2 == 0) return true;
        else return false;
    }

    public static boolean isPrime(int number) {
        if (number == 1) return true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static int subtract(int number1, int number2) {
        if (number1 < number2) return number2 - number1;
        else return number1 - number2;
    }

    public static float divide(int number1, int number2) {
        if (number2 == 0) return 0;
        else return ((float) number1 / number2);
    }

    public static int factorOf(int number) {
        if (number == 1) return 1;
        int factors = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) factors++;
        }
        return factors;
    }

    public static boolean isSquare(int number) {
        if (number == 1) return true;
        for (int i = 1; i <= number / 2; i++) {
            if (i * i == number) return true;
        }
        return false;
    }

    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int originalNumber = number;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }

        if (originalNumber == reversedNumber) return true;
        else return false;
    }

    public static long factorialOf(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static long squareOf(int number) {
        return (long) number * number;
    }
}
