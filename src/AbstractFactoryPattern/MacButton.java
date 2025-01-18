package AbstractFactoryPattern;

public class MacButton implements Button{
    @Override
    public void render() {
        System.out.println("This is Mac button");
    }
}
