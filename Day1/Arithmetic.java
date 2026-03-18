import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Enter the first Integer: ");
        int firstNumber = inputCollector.nextInt();

        System.out.println("Enter the second Integer: ");
        int secondNumber = inputCollector.nextInt();

        int firstNumberSquared = firstNumber * firstNumber;
        int secondNumberSquared = secondNumber * secondNumber;

        int squareSum = firstNumberSquared + secondNumberSquared;
        int squareDifference = firstNumberSquared - secondNumberSquared;

        System.out.printf("The squares of the integers %d and %d are %d and %d respectively. The sum of their squares is %d and the difference of the squares is %d",
                firstNumber, secondNumber, firstNumberSquared, secondNumberSquared, squareSum, squareDifference);
    }
}