import components.button.Button;
import components.button.MacButton;
import components.menu.MacMenu;
import components.menu.Menu;

public class MacUIFactory implements UIFactory {
    @Override
    public Menu createMenu() {
        return new MacMenu();
    }

    @Override
    public Button createButton() {
        return new MacButton();
    }
}
