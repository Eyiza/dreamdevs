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
}
