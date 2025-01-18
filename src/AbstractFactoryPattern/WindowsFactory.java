package AbstractFactoryPattern;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button buttonFactory() {
        return new WindowsButton();
    }

    @Override
    public CheckBox checkboxFactory() {
        return new WindowsCheckBox();
    }
}
