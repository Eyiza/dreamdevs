import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter estimated number of stones: ");
        int stones = scanner.nextInt();

        System.out.print("Enter average weight of each stone (in pounds): ");
        int stoneWeight = scanner.nextInt();

        System.out.print("Enter number of years it takes to build: ");
        int years = scanner.nextInt();

        int totalWeight  = stones * stoneWeight;
        int hoursInAYear = 365 * 24;
        int minutesInAYear = hoursInAYear * 60;

        System.out.printf("Total weight is %d pounds. Weight per year is %d pounds. Weight per hour is %d. Weight per minute is %d", 
        totalWeight, totalWeight / years, totalWeight / (years * hoursInAYear), totalWeight / (years * minutesInAYear));
    }
}