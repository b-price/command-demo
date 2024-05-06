import java.util.ArrayList;

public class DisplayMenu implements Command{
    private Menu menu;
    public DisplayMenu(Menu menu) {
        this.menu = menu;
    }
    @Override
    public String[] execute() {
        String[] menuStrings = new String[menu.size()];
        ArrayList<MenuItem> menuList = menu.getMenu();
        for (int i = 0; i < menuList.size(); i++) {
            menuStrings[i] = menuList.get(i).toString();
        }
        return menuStrings;
    }
}
