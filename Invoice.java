//Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at
the store. An Invoice should include four pieces of information as instance variables-a part
number(type String),a part description(type String),a quantity of the item being purchased (type int) and
a price per item (double). Your class should have a constructor that initializes the four instance variables.
In addition, provide a method named getInvoiceAmount that calculates the invoice amount.

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }

    public static void main(String[] args) {
        // Create an invoice
        Invoice invoice = new Invoice("1234", "Hammer", 3, 12.99);
        
        // Calculate and display the invoice amount
        System.out.printf("Invoice Amount: $%.2f%n", invoice.getInvoiceAmount());
    }
}