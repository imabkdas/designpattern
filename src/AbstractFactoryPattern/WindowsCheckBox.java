package AbstractFactoryPattern;

public class WindowsCheckBox implements CheckBox{
    @Override
    public void render() {
        System.out.println("This is check box");
    }
}
