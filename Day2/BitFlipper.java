import java.util.Scanner;

public class BitFlipper{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer 0 or 1:");
		int number = input.nextInt();
		if (number == 0) System.out.println("Number is 1");
		if (number == 1) System.out.println("Number is 0");
	}
}
