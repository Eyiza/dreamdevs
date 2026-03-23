package Day4;

public class Receipt {
    public static String getMoneyInWords(int number) {
        if (number < 1 || number > 1000000) return "Invalid Amount";

        String numberString = String.valueOf(number);
        int amountSize = numberString.length();

        String amountInWords = "";
        if (amountSize > 6) {
            int digit = number / 1000000;
            amountInWords += getDigitInWord(digit);
            amountInWords += " Million";
        }
        if  (amountSize > 3 && amountSize <= 6) {
            int digit = number / 1000000;
        }
        else {
            amountInWords += getDigitInWord(number);
        }

        return amountInWords;
    }

    public static String getDigitInWord(int number) {
        String intInWord = "";
        switch (number) {
            case 0 -> intInWord = "Zero";
            case 1 -> intInWord = "One";
            case 2 -> intInWord = "Two";
            case 3 -> intInWord = "Three";
            case 4 -> intInWord = "Four";
            case 5 -> intInWord = "Five";
            case 6 -> intInWord = "Six";
            case 7 -> intInWord = "Seven";
            case 8 -> intInWord = "Eight";
            case 9 -> intInWord = "Nine";
            default -> intInWord = "Invalid";
        }
        return intInWord;
    }

    public static String getTensInWord(int number) {
        String intInWord = "";
        switch (number) {
            case 10 -> intInWord = "Ten";
            case 20 -> intInWord = "Twenty";
            case 30 -> intInWord = "Thirty";
            case 40 -> intInWord = "Forty";
            case 50 -> intInWord = "Fifty";
            case 60 -> intInWord = "Sixty";
            case 70 -> intInWord = "Seventy";
            case 80 -> intInWord = "Eighty";
            case 90 -> intInWord = "Ninety";
            default -> intInWord = "Invalid";
        }
        return intInWord;
    }
}
