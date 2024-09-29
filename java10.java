/*Develop a java application to inherit currency converter (Dollar to INR, EURO to INR, Yen to INR and
vice versa), distance converter (meter to KM, miles to KM and vice versa) , time converter (hours to
minutes, seconds and vice versa) from a base class Converter.*/


// Base class
abstract class Converter {
    abstract double convert(double value);
}

// Currency Converter
class CurrencyConverter extends Converter {
    private static final double DOLLAR_TO_INR = 74.0; // Example conversion rate

    // Convert USD to INR
    public double dollarToINR(double value) {
        return value * DOLLAR_TO_INR;
    }

    // Convert INR to USD
    public double inrToDollar(double value) {
        return value / DOLLAR_TO_INR;
    }

    @Override
    public double convert(double value) {
        // Placeholder; can be used for a specific case if needed
        return 0;
    }
}

// Main application
public class Main {
    public static void main(String[] args) {
        CurrencyConverter currencyConverter = new CurrencyConverter();

        // Currency conversion examples
        double dollars = 100;
        System.out.println(dollars + " USD to INR: " + currencyConverter.dollarToINR(dollars));
        
        double inr = 7400;
        System.out.println(inr + " INR to USD: " + currencyConverter.inrToDollar(inr));
    }
}
