import java.util.ArrayList;
import java.util.Iterator;

public class MenuComponentIterator implements Iterator {
    private ArrayList<MenuComponent> menuItems;
    public MenuComponentIterator(ArrayList<MenuComponent> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return menuItems.iterator().hasNext();
    }

    @Override
    public Object next() {
        return menuItems.iterator().next();
    }
}
