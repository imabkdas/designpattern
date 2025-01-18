package DecoratorDesignPattern;

public class PlainPizza implements Pizza {


    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public double getCost() {
        return 6.0;
    }
}
