import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Enter an integer input");
        int num = inputCollector.nextInt();
        int numSquare = num * num;

        if (num < 100) System.out.printf("The number %d < 100 %n", num);
        if (numSquare < 100) System.out.printf("Its square %d < 100 %n", numSquare);

        if (num == 100) System.out.printf("The number %d == 100 %n", num);
        if (numSquare == 100) System.out.printf("Its square %d == 100 %n", numSquare);

        if (num != 100) System.out.printf("The number %d != 100 %n", num);
        if (numSquare != 100) System.out.printf("Its square %d != 100 %n", numSquare);

        if (num > 100) System.out.printf("The number %d > 100 %n", num);
        if (numSquare > 100) System.out.printf("Its square %d > 100 %n", numSquare);        
 
    }
}