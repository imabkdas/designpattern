package DecoratorDesignPattern;

public class PepperoniDecorator extends PizzaDecorator {
    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Pepperoni";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.0;
    }
}
