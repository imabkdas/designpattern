package openclosedprinciple;

import openclosedprinciple.*;

public class Main {

    public static void main(String[] args) {

        Marker marker = new Marker("Expo","Red",2024, 50);

        //Using different discount strategies
        Invoice invoiceWithoutNoDiscount = new Invoice(marker, 5, new NoDiscount());
        Invoice invoiceWithDiscount  = new Invoice(marker, 10, new PercentageDiscount(5));

        //Using different printers
        TextInvoicePrinter textInvoicePrinter = new TextInvoicePrinter(invoiceWithoutNoDiscount);
        JSONInvoicePrinter jsonInvoicePrinter = new JSONInvoicePrinter(invoiceWithDiscount);

        textInvoicePrinter.printInvoice();
        jsonInvoicePrinter.printInvoice();



    }
}