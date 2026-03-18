package Day1Assg;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        System.out.println("This is a Cicle Circumference and Area Calculator");

        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        int radius = inputCollector.nextInt();

        System.out.printf("Diameter is %d%n", 2 * radius);
        System.out.printf("Circumference is %f%n", 2 * Math.PI * radius);
        System.out.printf("Area is %f%n", Math.PI * radius * radius);
    }

}