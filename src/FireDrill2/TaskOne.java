package FireDrill2;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        int sum = 0;

	for (int i = 1; i <= 10; i++) {  
        	System.out.printf("Enter Number %d:%n", i);
        	int input = inputCollector.nextInt();
		sum = sum + input; 
	}

        System.out.printf("The sum is %d", sum);
    }
}