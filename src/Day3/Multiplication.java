package Day3;

import java.util.Scanner;

public class Multiplication {
    public static void main(String... args) {
	System.out.println("This is an application that takes in 2 numbers and return their product");

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter the first number: ");
	int firstNumber = inputCollector.nextInt();
	int product = 0;

        System.out.print("Enter the second number: ");
	int secondNumber = inputCollector.nextInt();

	if (firstNumber == 0){
		product = 0;
	} else if (secondNumber == 0){
		product = 0;
	} else if (secondNumber < 0){
		if (firstNumber < 0){
			for (int i=firstNumber; i<=-1; i++) product = product + secondNumber - secondNumber - secondNumber;
		} else {
			for (int i=1; i<=firstNumber; i++) product = product + secondNumber;
		}
	} else {
		for (int i=1; i<=secondNumber; i++) product = product + firstNumber;
	}
	System.out.printf("The product of %d and %d is %d", firstNumber, secondNumber, product);
    }
}