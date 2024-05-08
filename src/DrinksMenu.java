import java.util.ArrayList;

public class DrinksMenu extends  Menu  {
    public DrinksMenu(ArrayList<MenuComponent> menuItems) {
        super(menuItems);
    }

    public DrinksMenu() {
        super();
    }

    public DrinksMenu getNABevs() {
        ArrayList<MenuComponent> naBevs = new ArrayList<>();
        for (MenuComponent bev : menuItems) {
            if (bev instanceof DrinksMenuItem && bev.getAbv() <= 0.5){
                naBevs.add(bev);
            }
        }
        return new DrinksMenu(naBevs);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Drinks Menu\n_________________\n");
        for (MenuComponent menuItem : menuItems) {
            sb.append(menuItem.toString()).append("\n");
        }
        return sb.toString();
    }
}
