package FireDrill2;

import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        int sum = 0;
	int usedNumbers = 0;

	for (int i = 1; i <= 10; i++) {  
        	System.out.printf("Please enter a number %d between 0 and 100:%n", i);
        	int input = inputCollector.nextInt();

		if (input < 0) {
			System.out.printf("%d is less than 0. Skipping... %n", input);
		} 
		else if (input > 100) {
			System.out.printf("%d is greater than 100. Skipping... %n", input);
		}	
		else {
			sum = sum + input;
			usedNumbers++;
		}
	}
	int average = sum / usedNumbers;
        System.out.printf("The average of the valid scores is %d", average);
    }
}