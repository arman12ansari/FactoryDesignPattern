import components.button.Button;
import components.menu.Menu;

public class Main {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatform.IOS);
        UIFactory uiFactory = flutter.createUIFactory();
        Button button = uiFactory.createButton();
        Menu menu = uiFactory.createMenu();
        button.render();
        menu.display();

    }
}