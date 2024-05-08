import java.util.ArrayList;

public class EntreesMenu extends Menu {
    public EntreesMenu(ArrayList<MenuComponent> items) {
        super(items);
    }

    public EntreesMenu() {
        super();
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Entrees Menu\n_________________\n");
        for (MenuComponent menuItem : menuItems) {
            sb.append(menuItem.toString()).append("\n");
        }
        return sb.toString();
    }
}
