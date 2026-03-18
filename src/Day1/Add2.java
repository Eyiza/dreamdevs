public class Add2{
	public static void main(String[] args) {
		String firstNumber = args[0];
		String secondNumber = args[1];

		String sum = firstNumber + secondNumber;
		System.out.printf("The sum of %d and %d is %d", firstNumber, secondNumber, sum);
	}
}