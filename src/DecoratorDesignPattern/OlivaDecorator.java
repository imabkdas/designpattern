package DecoratorDesignPattern;

public class OlivaDecorator extends PizzaDecorator {
    public OlivaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Olives";
    }

    @Override
    public double getCost() {
        return super.getCost() + 5.0;
    }
}
