package DecoratorDesignPattern;

public class DecoratorMain {

    public static void main(String[] args){

        Pizza plainPizaa = new PlainPizza();

        Pizza cheesePizaa = new CheeseDecorator(plainPizaa);

        System.out.println(cheesePizaa.getDescription() + "   " + " price is :  " + cheesePizaa.getCost());

        Pizza olivePizza =  new OlivaDecorator(plainPizaa);
        System.out.println(olivePizza.getDescription() + "  " + " price is  : " + olivePizza.getCost());

        Pizza pepperni = new PizzaDecorator(plainPizaa);
        System.out.println(pepperni.getDescription() + " price is : " + pepperni.getCost());
    }
}
