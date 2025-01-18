package singleresponsibilityprinciple;

public class Main {

    public static void main(String[] args) {

        Marker marker = new Marker("Expo","Red",2024, 50);
        Invoice invoice = new Invoice(marker, 5);
        PrintInvoice printInvoice = new PrintInvoice(invoice);
        printInvoice.printInvoice();

    }
}