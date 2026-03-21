package Weekend1;

import java.util.Scanner;

public class CreditCardValidator {
    static String cardType;
    static boolean validity;

    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Hello, Kindly Enter Card details to verify:");
        String cardNumber = inputCollector.nextLine();

        if (!isValidLength(cardNumber)) return;

        String cardType = getCardType(cardNumber);

        validity = checkLuhnValidity(cardNumber);

        String prompt = """
               ****************************************
                    Credit Card Details
               **Credit Card Type: %s
               **Credit Card Number: %s
               **Credit Card Digit Length: %d
               **Credit Card Validity Status: %s
               ****************************************
               """;
        System.out.printf(prompt, cardType, cardNumber, cardNumber.length(), validity ? "Valid" : "Invalid");
    }

    public static boolean isValidLength(String cardNumber){
        if (cardNumber.length() >= 13 && cardNumber.length() <= 16) return true;
        else {
            System.out.println("Invalid card length");
            return false;
        }
    }

    public static String getCardType(String cardNumber){
        if (cardNumber.startsWith("4")) return "Visa";
        else if (cardNumber.startsWith("5")) return "Mastercard";
        else if (cardNumber.startsWith("37")) return "American Express";
        else if (cardNumber.startsWith("6")) return "Discover";
        else return "Invalid Card";
    }

    public static boolean checkLuhnValidity(String cardNumber){
        int sum1 = 0;
        int sum2 = 0;
        int oddCount = 1;
        boolean shouldDouble = false;

        for (int i = cardNumber.length() - 1; i >= 0; i--){
            int digit = cardNumber.charAt(i) - '0';

            if (shouldDouble) {
                int square;
                if (digit > 4) square = ((digit * 2) / 10) + ((digit * 2) % 10);
                else square = digit * 2;
                sum1 += square;
            }
            if (oddCount % 2 != 0) sum2 += digit;

            oddCount++;
            shouldDouble = !shouldDouble;
        }

        return (sum1 + sum2) % 10 == 0;
    }
}
