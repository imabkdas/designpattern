package AbstractFactoryPattern;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("This is Windows button");
    }
}
