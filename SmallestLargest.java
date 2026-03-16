import java.util.Scanner;

public class SmallestLargest {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Enter the first Integer:");
        int firstNumber = inputCollector.nextInt();

        System.out.println("Enter the second Integer:");
        int secondNumber = inputCollector.nextInt();

        System.out.println("Enter the third Integer:");
        int thirdNumber = inputCollector.nextInt();

        int sum = firstNumber + secondNumber + thirdNumber;
        int average = sum / 3;
        int product = firstNumber * secondNumber * thirdNumber;

        System.out.printf("The sums of the integers %d, %d and %d is %d. Their average is %d. Their product is %d. ",
                firstNumber, secondNumber, thirdNumber, sum, average, product);

        // int smallest = firstNumber;
        if (firstNumber < secondNumber && firstNumber < thirdNumber) System.out.printf("The first number %d is the smallest number. ", firstNumber);
        if (secondNumber < firstNumber && secondNumber < thirdNumber) System.out.printf("The second number %d is the smallest number. ", secondNumber);
        if (thirdNumber < firstNumber && thirdNumber < secondNumber) System.out.printf("The third number %d is the smallest number. ", thirdNumber);

        if (firstNumber > secondNumber && firstNumber > thirdNumber) System.out.printf("The first number %d is the largest number. ", firstNumber);
        if (secondNumber > firstNumber && secondNumber > thirdNumber) System.out.printf("The second number %d is the largest number. ", secondNumber);
        if (thirdNumber > firstNumber && thirdNumber > secondNumber) System.out.printf("The third number %d is the largest number. ", thirdNumber);

    }
}