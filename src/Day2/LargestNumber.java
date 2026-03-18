package Day2;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        System.out.println("Enter Number 1:");
        int largestNumber = inputCollector.nextInt();

	for (int i = 2; i <= 5; i++) { // for (int i = 1; i++ < 5;) 
        	System.out.printf("Enter Number %d:%n", i);
        	int input = inputCollector.nextInt();
		if (input > largestNumber) largestNumber = input; 
	}

        System.out.printf("The largest number is %d", largestNumber);
    }
}