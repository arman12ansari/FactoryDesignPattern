import components.button.Button;
import components.menu.Menu;

public interface UIFactory {
    Menu createMenu();
    Button createButton();
}
