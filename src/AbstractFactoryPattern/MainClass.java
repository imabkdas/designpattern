package AbstractFactoryPattern;

public class MainClass {

    public static void main(String[] args){
        GUIFactory factory;

        String os  = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")){
            factory = new WindowsFactory();
        }
        else if (os.contains("mac")){
            factory = new MacFactory();
        }
        else {
            throw  new UnsupportedOperationException("Unsupported platform " + os);
        }

        Application app = new Application(factory);
        app.renderUI();
    }
}
