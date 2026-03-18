import java.util.Scanner; 

public class Divisible{
	public static void main(String[] args) {
		Scanner inputCollector = new Scanner(System.in);

		System.out.println("Enter Integer Input:");
		int number = inputCollector.nextInt();
		
		if (number % 3 == 0) System.out.printf("The number %d is divisible by 3", number);
		if (number % 3 != 0) System.out.printf("The number %d is not divisible by 3", number);

	}
}