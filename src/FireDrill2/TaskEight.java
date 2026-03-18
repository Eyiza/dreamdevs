package FireDrill2;

import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        int sum = 0;
	int counter = 0;

	while (counter < 10) {  
        	System.out.printf("Please enter a valid score number %d between 0 and 100:%n", counter + 1);
        	int input = inputCollector.nextInt();

		if (input < 0) {
			System.out.printf("%d is less than 0. Skipping... %n", input);
		} 
		else if (input > 100) {
			System.out.printf("%d is greater than 100. Skipping... %n", input);
		}	
		else {
			sum = sum + input;
			counter++;
		}
	}
	System.out.printf("The sum of the 10 valid scores you provided is %d", sum);
    }
}