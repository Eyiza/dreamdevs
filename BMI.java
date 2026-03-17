import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        System.out.println("This is a BMI Calculator");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        int weight = scanner.nextInt();

        System.out.println("Enter height in inches: ");
        int height = scanner.nextInt();

        int bmi = (weight * 703) / (height * height);

        String prompt = """
            Your BMI is %d.
            BMI Categories:
            Underweight  : less than 18.5
            Normal       : 18.5 - 24.9
            Overweight   : 25.0 - 29.9
            Obese        : 30.0 and above
			""";        
        System.out.printf(prompt, bmi);
    }
}