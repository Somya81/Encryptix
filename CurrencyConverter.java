import java.util.Scanner;

public class CurrencyConverter {
    // Define exchange rates (hardcoded for demonstration)
    private static final double USD_TO_EUR = 0.85;
    private static final double USD_TO_GBP = 0.75;
    private static final double EUR_TO_USD = 1.18;
    private static final double EUR_TO_GBP = 0.88;
    private static final double GBP_TO_USD = 1.33;
    private static final double GBP_TO_EUR = 1.14;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Currency Converter!");

        // Display options to the user
        System.out.println("\nSelect the currency to convert from:");
        System.out.println("1. USD");
        System.out.println("2. EUR");
        System.out.println("3. GBP");
        int fromCurrency = scanner.nextInt();

        System.out.println("\nSelect the currency to convert to:");
        System.out.println("1. USD");
        System.out.println("2. EUR");
        System.out.println("3. GBP");
        int toCurrency = scanner.nextInt();

        System.out.print("\nEnter the amount to convert: ");
        double amount = scanner.nextDouble();
        double convertedAmount = 0;

        // Calculate conversion based on user's choice
        if (fromCurrency == 1 && toCurrency == 2) {
            convertedAmount = amount * USD_TO_EUR;
            System.out.printf("%.2f USD = %.2f EUR%n", amount, convertedAmount);
        } else if (fromCurrency == 1 && toCurrency == 3) {
            convertedAmount = amount * USD_TO_GBP;
            System.out.printf("%.2f USD = %.2f GBP%n", amount, convertedAmount);
        } else if (fromCurrency == 2 && toCurrency == 1) {
            convertedAmount = amount * EUR_TO_USD;
            System.out.printf("%.2f EUR = %.2f USD%n", amount, convertedAmount);
        } else if (fromCurrency == 2 && toCurrency == 3) {
            convertedAmount = amount * EUR_TO_GBP;
            System.out.printf("%.2f EUR = %.2f GBP%n", amount, convertedAmount);
        } else if (fromCurrency == 3 && toCurrency == 1) {
            convertedAmount = amount * GBP_TO_USD;
            System.out.printf("%.2f GBP = %.2f USD%n", amount, convertedAmount);
        } else if (fromCurrency == 3 && toCurrency == 2) {
            convertedAmount = amount * GBP_TO_EUR;
            System.out.printf("%.2f GBP = %.2f EUR%n", amount, convertedAmount);
        } else if (fromCurrency == toCurrency) {
            System.out.printf("No conversion needed. %.2f remains %.2f.%n", amount, amount);
        } else {
            System.out.println("Invalid currency selection.");
        }

        scanner.close();
    }
}
