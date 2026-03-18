package FireDrill2;

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        int sum = 0;
	int usedNumbers = 0;

	for (int i = 1; i <= 10; i++) {  
        	System.out.printf("Enter Number %d:%n", i);
        	int input = inputCollector.nextInt();
		if (input % 2 == 0) {
			sum = sum + input;
			usedNumbers++;
		}
	}
	int average = sum / usedNumbers;
        System.out.printf("The average of the even numbers is %d", average);
    }
}