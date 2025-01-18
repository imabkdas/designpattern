package AbstractFactoryPattern;

public class MacFactory implements GUIFactory{
    @Override
    public Button buttonFactory() {
        return new MacButton();
    }

    @Override
    public CheckBox checkboxFactory() {
        return new MacCheckBox();
    }
}
