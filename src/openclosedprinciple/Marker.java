package openclosedprinciple;

public class Marker {

    String name;
    String color;
    int year;
    double price;

    public Marker(String name, String color, int year, double price){
        this.name = name;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public String getColor (){
        return color;
    }

    public int getYear(){
        return year;
    }

    public double getPrice(){
        return  price;
    }
}

interface  Discount{
    double applyDiscount(double price);
}

class NoDiscount implements Discount{

    @Override
    public double applyDiscount(double price) {
        return price;
    }
}

class PercentageDiscount implements Discount{

    int percentage;

    public PercentageDiscount(int percentage){
        this.percentage = percentage;
    }

    @Override
    public double applyDiscount(double price){
        return price - (price * percentage/100);
    }
}

class Invoice{
    private Marker marker;
    private int quantity;
    private Discount discount;


    public Invoice(Marker marker, int quantity, Discount discount){
        this.marker = marker;
        this.quantity = quantity;
        this.discount  = discount;
    }

    public int getQuantity() {
        return quantity;
    }

    public double price(){
        double total = marker.getPrice() * quantity;
        return discount.applyDiscount(total);

    }

}

abstract class InvoicePrinter{
    protected Invoice invoice;

    public InvoicePrinter(Invoice invoice){
        this.invoice = invoice;
    }
//    public void printInvoice(){
//        System.out.printf("openclosedprinciple.Invoice is  Quantity : %d and Price :  %d " , invoice.getQuantity(), invoice.price());
//    }
    public abstract void printInvoice();

}

class TextInvoicePrinter extends InvoicePrinter{

    public TextInvoicePrinter(Invoice invoice){
        super(invoice);
    }

    @Override
    public void printInvoice() {
        System.out.printf("openclosedprinciple.Invoice: Total Price = %.2f, Quantity = %d%n", invoice.price(), invoice.getQuantity());
    }
}

class JSONInvoicePrinter extends InvoicePrinter{

    public JSONInvoicePrinter(Invoice invoice){
        super(invoice);
    }

    @Override
    public void printInvoice() {
        System.out.println("{");
        System.out.printf("\"totalPrice\": %.2f, \"quantity\": %d%n", invoice.price(), invoice.getQuantity());
        System.out.println("}");
    }
}


