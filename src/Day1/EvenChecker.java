import java.util.Scanner; 

public class EvenChecker{
	public static void main(String[] args) {
		Scanner inputCollector = new Scanner(System.in);

		System.out.println("Enter Input");
		int number = inputCollector.nextInt();
		
		if (number % 2 == 0) System.out.printf("The number %d is %s", number, "even");
		if (number % 2 != 0) System.out.printf("The number %d is %s", number, "odd");

	}
}