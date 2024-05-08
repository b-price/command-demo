import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent{
    protected ArrayList<MenuComponent> menuItems;

    public Menu(ArrayList<MenuComponent> menuItems) {
        this.menuItems = menuItems;
    }

    public Menu() {
        this.menuItems = new ArrayList<>();
    }

    public void add(MenuComponent item) {
        menuItems.add(item);
    }

    public void remove(MenuComponent item) {
        menuItems.remove(item);
    }

    public ArrayList<MenuComponent> getMenu(){
        return menuItems;
    }

    public Iterator createIterator(ArrayList<MenuComponent> menuItems) {
        return new MenuComponentIterator(menuItems);
    }

    public MenuItem getItem(OrderItem orderItem) {
        MenuItem item = null;
        for (MenuComponent menuItem : menuItems) {
            if (menuItem instanceof Menu){
                item = ((Menu) menuItem).getItem(orderItem);
                if (item != null) {
                    return item;
                }
            } else if (menuItem instanceof MenuItem && ((MenuItem) menuItem).getItem(orderItem)){
                item = (MenuItem) menuItem;
                return item;
            }
        }
        return null;
    }

    public int size() {
        return menuItems.size();
    }

    public MenuComponent getChild(int index) {
        return super.getChild(index);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("MENU\n_________________\n");
        for (MenuComponent menuItem : menuItems) {
            sb.append(menuItem.toString()).append("\n");
        }
        return sb.toString();
    }

}
