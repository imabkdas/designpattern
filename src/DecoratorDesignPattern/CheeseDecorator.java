package DecoratorDesignPattern;

public class CheeseDecorator extends PizzaDecorator {

    protected Pizza pizza;


    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Cheese ";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.50;
    }
}
