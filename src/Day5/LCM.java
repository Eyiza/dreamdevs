package Day5;

public class LCM {
    public static int calculateLCM(int... numbers){
        int lcm = 1;
        int divisor = 2;

        while (!areAllNumbersOne(numbers)){
//            System.out.printf("Divisor: %d%n", divisor);
            boolean isDivisorUsed = false;
            boolean reUseDivisor = false;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == 0) throw new IllegalArgumentException("Number " + numbers[i] + " is invalid");
                if (numbers[i] < 0) numbers[i] *= -1;
                if (numbers[i] % divisor == 0){
                    numbers[i] /= divisor;
                    if (!isDivisorUsed) {
                        lcm *= divisor;
                        isDivisorUsed = true;
                    }
                    if (numbers[i] % divisor == 0) reUseDivisor = true;
                }
            }
            if (!reUseDivisor) divisor++;
        }
        return lcm;
    }

//    public static int calculateLCM(int number1, int number2) {
//        int lcm = 1;
//        int divisor = 2;
//
//        while (number1 != 1 || number2 != 1) {
//            if (number1 % divisor == 0 &&  number2 % divisor == 0){
//                number1 /= divisor;
//                lcm *= divisor;
//            }
//            else if (number1 % divisor == 0) {
//                number1 /= divisor;
//                lcm *= divisor;
//            } else if (number2 % divisor == 0) {
//                number2 /= divisor;
//                lcm *= divisor;
//            }
//
//            divisor++ ;
//        }
//
//        return lcm;
//    }

    public static boolean areAllNumbersOne(int[] numbers){
        for (int number: numbers){
            if (number != 1) return false;
        }
        return true;
    }
}
