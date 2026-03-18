import java.util.Scanner;

public class Population {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Enter current world population: ");
        double population = inputCollector.nextDouble();

        System.out.println("Enter annual growth rate: ");
        double rate = inputCollector.nextDouble() / 100;

        System.out.println("Estimated World Population for the next 5 years:");
        for (int year = 1; year <= 5; year++) {
            population = population + (population * rate);
            System.out.printf("After %d year: %f%n", year, population);
        }
    }
}