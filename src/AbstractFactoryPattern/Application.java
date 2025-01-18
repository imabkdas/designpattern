package AbstractFactoryPattern;

public class Application {

    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory factory){
        this.button  = factory.buttonFactory();
        this.checkBox = factory.checkboxFactory();
    }

    public void renderUI(){
        button.render();
        checkBox.render();
    }

}
