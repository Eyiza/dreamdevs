import java.util.Scanner; // Scanner is a class. Every class we import can be used as a type when creating an object for it.

public class Input{
	public static void main(String[] args) {
		Scanner inputCollector = new Scanner(System.in);

		System.out.println("Enter First Number");
		int firstNumber = inputCollector.nextInt();

		System.out.println("Enter Second Number");
		int secondNumber = inputCollector.nextInt();

		int sum = firstNumber + secondNumber;
		System.out.printf("The sum of %d and %d is %d", firstNumber, secondNumber, sum);
	}
}