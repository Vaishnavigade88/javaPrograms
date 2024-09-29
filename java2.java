//Develop a Java application to generate Electricity bill. Create a class with the following members:
Consumer no., consumer name, previous month reading, current month reading, and type of EB
connection (i.e. domestic or commercial). Compute the bill amount using the user defined tariff.

import java.util.Scanner;

class ElectricityBill {
    private String consumerNo;
    private String consumerName;
    private double previousReading;
    private double currentReading;
    private String connectionType; // Domestic or Commercial

    public ElectricityBill(String consumerNo, String consumerName, double previousReading, double currentReading, String connectionType) {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.previousReading = previousReading;
        this.currentReading = currentReading;
        this.connectionType = connectionType;
    }

    // Method to calculate bill
    public double calculateBill() {
        double unitsConsumed = currentReading - previousReading;
        double tariff;

        // Define tariff based on connection type
        if (connectionType.equalsIgnoreCase("domestic")) {
            tariff = 5.0; // Example rate for domestic
        } else if (connectionType.equalsIgnoreCase("commercial")) {
            tariff = 10.0; // Example rate for commercial
        } else {
            System.out.println("Invalid connection type.");
            return 0;
        }

        return unitsConsumed * tariff;
    }

    // Method to display bill information
    public void displayBill() {
        System.out.println("Electricity Bill");
        System.out.println("Consumer No: " + consumerNo);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Previous Reading: " + previousReading);
        System.out.println("Current Reading: " + currentReading);
        System.out.println("Units Consumed: " + (currentReading - previousReading));
        System.out.printf("Total Bill Amount: %.2f\n", calculateBill());
    }
}

public class ElectricityBillApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Consumer No: ");
        String consumerNo = scanner.nextLine();

        System.out.print("Enter Consumer Name: ");
        String consumerName = scanner.nextLine();

        System.out.print("Enter Previous Month Reading: ");
        double previousReading = scanner.nextDouble();

        System.out.print("Enter Current Month Reading: ");
        double currentReading = scanner.nextDouble();

        System.out.print("Enter Type of EB Connection (Domestic/Commercial): ");
        String connectionType = scanner.next();

        // Create an ElectricityBill object
        ElectricityBill bill = new ElectricityBill(consumerNo, consumerName, previousReading, currentReading, connectionType);

        // Display the bill
        bill.displayBill();

        scanner.close();
    }
}