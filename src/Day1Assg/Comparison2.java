package Day1Assg;

import java.util.Scanner;

public class Comparison2 {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        System.out.println("Enter the first Integer:");
        int firstNumber = inputCollector.nextInt();

        System.out.println("Enter the second Integer:");
        int secondNumber = inputCollector.nextInt();

        System.out.println("Enter the third Integer:");
        int thirdNumber = inputCollector.nextInt();

        System.out.println("Enter the fourth Integer:");
        int fourthNumber = inputCollector.nextInt();

        System.out.println("Enter the fifth Integer:");
        int fifthNumber = inputCollector.nextInt();

        int largest = firstNumber;

        if (secondNumber > largest) largest = secondNumber; 
        if (thirdNumber > largest) largest = thirdNumber; 
        if (fourthNumber > largest) largest = fourthNumber; 
        if (fifthNumber > largest) largest = fifthNumber; 

        int smallest = firstNumber;

        if (secondNumber < smallest) smallest = secondNumber; 
        if (thirdNumber < smallest) smallest = thirdNumber; 
        if (fourthNumber < smallest) smallest = fourthNumber; 
        if (fifthNumber < smallest) smallest = fifthNumber; 

        System.out.printf("The largest number is %d and the smallest number is %d", largest, smallest);
    }
}