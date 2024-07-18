import components.button.AndroidButton;
import components.button.Button;
import components.menu.AndroidMenu;
import components.menu.Menu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Button createButton() {
        return new AndroidButton();
    }
}
