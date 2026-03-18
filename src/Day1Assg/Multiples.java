package Day1Assg;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Enter the first Integer: ");
        int firstNumber = inputCollector.nextInt();

        System.out.println("Enter the second Integer: ");
        int secondNumber = inputCollector.nextInt();

        int firstNumberTriple = firstNumber * 3;
        int secondNumberDoubled = secondNumber * 2;

        if (firstNumberTriple % secondNumberDoubled == 0) System.out.printf("%d is a multiple of %d", firstNumberTriple, secondNumberDoubled);
        if (firstNumberTriple % secondNumberDoubled != 0) System.out.printf("%d is not a multiple of %d", firstNumberTriple, secondNumberDoubled);
		
    }
}