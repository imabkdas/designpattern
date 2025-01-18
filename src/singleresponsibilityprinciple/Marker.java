package singleresponsibilityprinciple;

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

class Invoice{
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public double price(){
        return marker.getPrice() * quantity;


    }
}

class PrintInvoice{

    private Invoice invoice;

    public PrintInvoice(Invoice invoice){
        this.invoice = invoice;
    }

    public void printInvoice(){
        System.out.printf("Invoice :  Quantity is %d and price is %.2f ", invoice.getQuantity(), invoice.price());
    }
}







