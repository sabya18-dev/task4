import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Available currencies
        System.out.println("Available Currencies: ");
        System.out.println("1. USD (US Dollar)");
        System.out.println("2. EUR (Euro)");
        System.out.println("3. INR (Indian Rupee)");
        System.out.println("4. GBP (British Pound)");

        // Step 1: Choose base currency
        System.out.print("\nEnter Base Currency (USD/EUR/INR/GBP): ");
        String baseCurrency = scanner.next().toUpperCase();

        // Step 2: Choose target currency
        System.out.print("Enter Target Currency (USD/EUR/INR/GBP): ");
        String targetCurrency = scanner.next().toUpperCase();

        // Step 3: Enter amount
        System.out.print("Enter amount to convert: ");
        double amount = scanner.nextDouble();

        // Step 4: Conversion (fixed rates for demo purpose)
        double rate = getExchangeRate(baseCurrency, targetCurrency);

        if (rate == 0) {
            System.out.println("❌ Invalid currency selection!");
        } else {
            double convertedAmount = amount * rate;
            System.out.println("\n✅ " + amount + " " + baseCurrency + " = " + convertedAmount + " " + targetCurrency);
        }

        scanner.close();
    }

    // Method to return exchange rate (dummy values for demo)
    public static double getExchangeRate(String base, String target) {
        if (base.equals(target)) {
            return 1.0;
        }

        // Sample fixed rates (not real-time)
        switch (base + "-" + target) {
            case "USD-INR":
                return 83.0;
            case "INR-USD":
                return 0.012;
            case "USD-EUR":
                return 0.92;
            case "EUR-USD":
                return 1.08;
            case "USD-GBP":
                return 0.79;
            case "GBP-USD":
                return 1.26;
            case "EUR-INR":
                return 90.0;
            case "INR-EUR":
                return 0.011;
            case "GBP-INR":
                return 105.0;
            case "INR-GBP":
                return 0.0095;
            default:
                return 0;
        }
    }
}
