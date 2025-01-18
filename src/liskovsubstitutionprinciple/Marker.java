package liskovsubstitutionprinciple;

// Marker Class (No changes needed)
public class Marker {
    String name;
    String color;
    int year;
    int price;

    public Marker(String name, String color, int year, int price) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }
}

// Discount interface (LSP compliant as the base interface)
interface Discount {
    double applyDiscount(double price);
}

// NoDiscount class follows LSP
class NoDiscount implements Discount {
    @Override
    public double applyDiscount(double price) {
        return price; // No discount is applied
    }
}

// PercentageDiscount class follows LSP
class PercentageDiscount implements Discount {
    private double percentage;

    public PercentageDiscount(double percentage) {
        if (percentage < 0 || percentage > 100) {
            throw new IllegalArgumentException("Discount percentage must be between 0 and 100");
        }
        this.percentage = percentage;
    }

    @Override
    public double applyDiscount(double price) {
        return price - (price * percentage / 100);
    }
}

// FlatDiscount class follows LSP (Newly added for demonstration)
class FlatDiscount implements Discount {
    private double flatAmount;

    public FlatDiscount(double flatAmount) {
        if (flatAmount < 0) {
            throw new IllegalArgumentException("Flat discount amount cannot be negative");
        }
        this.flatAmount = flatAmount;
    }

    @Override
    public double applyDiscount(double price) {
        return Math.max(0, price - flatAmount); // Ensures the price never goes below zero
    }
}

// Invoice class (uses any Discount strategy, compliant with LSP)
class Invoice {
    private Marker marker;
    private int quantity;
    private Discount discount;

    public Invoice(Marker marker, int quantity, Discount discount) {
        this.marker = marker;
        this.quantity = quantity;
        this.discount = discount;
    }

    public int getQuantity() {
        return quantity;
    }

    public double totalPrice() {
        double total = marker.getPrice() * quantity;
        return discount.applyDiscount(total);
    }
}

// Base class for Invoice printing
abstract class InvoicePrinter {
    protected Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public abstract void printInvoice();
}

// TextInvoicePrinter class (No changes needed for LSP)
class TextInvoicePrinter extends InvoicePrinter {

    public TextInvoicePrinter(Invoice invoice) {
        super(invoice);
    }

    @Override
    public void printInvoice() {
        System.out.printf("Invoice: Total Price = %.2f, Quantity = %d%n", invoice.totalPrice(), invoice.getQuantity());
    }
}

// Main class to demonstrate Liskov Substitution Principle


