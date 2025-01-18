package liskovsubstitutionprinciple;

public class MainClass {
    public static void main(String[] args) {
        Marker marker = new Marker("Expo", "Black", 2023, 10);

        // Using different discount strategies (LSP-compliant substitution)
        Discount noDiscount = new NoDiscount();
        Discount percentageDiscount = new PercentageDiscount(10); // 10% discount
        Discount flatDiscount = new FlatDiscount(5); // Flat $5 discount

        // Create invoices with different discounts
        Invoice invoiceWithNoDiscount = new Invoice(marker, 5, noDiscount);
        Invoice invoiceWithPercentageDiscount = new Invoice(marker, 5, percentageDiscount);
        Invoice invoiceWithFlatDiscount = new Invoice(marker, 5, flatDiscount);

        // Print Invoices using the same InvoicePrinter
        InvoicePrinter textPrinter1 = new TextInvoicePrinter(invoiceWithNoDiscount);
        InvoicePrinter textPrinter2 = new TextInvoicePrinter(invoiceWithPercentageDiscount);
        InvoicePrinter textPrinter3 = new TextInvoicePrinter(invoiceWithFlatDiscount);

        textPrinter1.printInvoice(); // Should print with no discount
        textPrinter2.printInvoice(); // Should print with a 10% discount
        textPrinter3.printInvoice(); // Should print with a $5 flat discount
    }
}
