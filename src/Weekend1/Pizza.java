package Weekend1;
import java.util.Scanner;

public class Pizza {
    static int guests = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to  Iya Moses Pizza joint Ajegunle");

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("How many guests do you have?: ");
        guests = inputCollector.nextInt();

        String prompt = """
               What is the Pizza type you want?
               Type 1 -> Sapa size
               Type 2 -> Small Money
               Type 3 -> Big boys
               Type 4 -> Odogwu
               """;
        System.out.print(prompt);
        int pizzaType = inputCollector.nextInt();

        switch(pizzaType){ // use -> instead of : in newer versions.
            case 1-> display(4, 2500);
            case 2-> display(6, 2900);
            case 3-> display(8, 4000);
            case 4-> display(12, 5200);
            default-> System.out.println("You have entered an invalid pizza type");
        }

    }

    public static void display(int slicesPerBox, int pricePerBox){
        int boxes = calculateBoxes(guests, slicesPerBox);
        int leftOverSlices = (slicesPerBox * boxes) - guests;
        int cost = pricePerBox * boxes;

        String output = """
               Number of boxes of pizza to buy = %d boxes
               Number of leftover slices after serving = %d slices
               Total price = %d
        """;
        System.out.printf(output, boxes, leftOverSlices, cost);
    }

    public static int calculateBoxes(int people, int slicesPerBox){
        int boxes = people / slicesPerBox;
        int extraNeeded = people % slicesPerBox;

        if (extraNeeded != 0) boxes ++;
        return boxes;
    }

}
