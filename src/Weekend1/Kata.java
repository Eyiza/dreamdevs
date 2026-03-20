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

    public static int positiveDifference(int number1, int number2) {
        if (number1 < number2) return number2 - number1;
        else return number1 - number2;
    }
}
