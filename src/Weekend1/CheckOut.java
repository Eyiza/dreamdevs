package Weekend1;
import java.util.Scanner;
import java.util.ArrayList;

class Product {
    String name;
    int quantity;
    double costPerUnit;

    public Product(String name, int quantity, double costPerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.costPerUnit = costPerUnit;
    }
}

public class CheckOut {
    public static void main(String[] args) {
        System.out.println("    Welcome to Semicolon Store!!!!");

        Scanner inputCollector = new Scanner(System.in);
        ArrayList<Product> cart = new ArrayList<>();

        System.out.println("What is the Customer's Name:");
        String customerName = inputCollector.nextLine();

        while (true) {
            System.out.println("What did the user buy?:");
            String productName = inputCollector.nextLine();

            System.out.println("How many pieces?:");
            int quantity = inputCollector.nextInt();

            System.out.println("How much per unit?:");
            double costPerUnit = inputCollector.nextDouble();
            inputCollector.nextLine();

            cart.add(new Product(productName, quantity, costPerUnit));

            System.out.println("Add more Items? (yes/no):");
            String addMore = inputCollector.nextLine();
            if (addMore.equalsIgnoreCase("no")) break;
        }

        System.out.println("What is your name?:");
        String cashierName = inputCollector.nextLine();

        System.out.println("How much discount rate will the customer get?:");
        double discountRate = inputCollector.nextDouble();

        System.out.println("How is the VAT Rate will the customer get?:");
        double vatRate = inputCollector.nextDouble();

        String invoice = """
                SEMICOLON STORES
                MAIN BRANCH
                LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
                TEL: 03293828343
                Date: 18-Dec-22 8:48:11 pm
                Cashier: %s
                Customer Name: %s
                ========================================================
                                     ITEM    QTY     PRICE   TOTAL(NGN)
                --------------------------------------------------------
                
                """;
        System.out.printf(invoice, cashierName, customerName);

        double subTotal = printProductList(cart);

        double totalCost = subTotal;
        double discount = 0;

        if (discountRate > 0 && discountRate <= 100) {
            discount = (discountRate / 100) * subTotal;
            totalCost -= discount;
        } else discount = 0;

        double vat = 0;
        if (vatRate > 0  && vatRate <= 100) {
            vat = (vatRate / 100) * subTotal;
            totalCost += vat;
        } else vat = 0;

        String invoicePart = """
        --------------------------------------------------------
                                 Sub Total:     %.2f
                                  Discount:     %.2f
                               VAT @%.2f%%:     %.2f
        ========================================================
                                Bill Total:     %.2f
        ========================================================
                THIS IS NOT A RECEIPT. KINDLY PAY %.2f
        ========================================================
        %n
        """;
        System.out.printf(invoicePart, subTotal, discount, vatRate, vat, totalCost, totalCost);

        System.out.println("How much did the Customer give to you?:");
        double amountPaid = inputCollector.nextDouble();

        System.out.printf(invoice, cashierName, customerName);
        printProductList(cart);

        String receipt = """
        --------------------------------------------------------
                                 Sub Total:     %.2f
                                  Discount:     %.2f
                               VAT @%.2f%%:     %.2f
        ========================================================
                                Bill Total:     %.2f
                               Amount Paid:     %.2f
                                   Balance:     %.2f
        ========================================================
                    THANK YOU FOR YOUR PATRONAGE
        ========================================================
        """;

        System.out.printf(receipt, subTotal, discount, vatRate, vat, totalCost, amountPaid, amountPaid - totalCost);

    }

    static double printProductList(ArrayList<Product> products){
        double subTotal = 0;
        for (Product product : products) {
            double cost = product.costPerUnit * product.quantity;
            subTotal += cost;
            String format = """
                                     %s     %d       %.2f     %.2f
                """;
            System.out.printf(format, product.name, product.quantity, product.costPerUnit, cost);
        }
        return subTotal;
    }
}
