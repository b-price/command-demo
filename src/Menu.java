import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> items;
    public Menu() {
        items = new ArrayList<>();
        items.add(new MenuItem(1, "Banh Mi", 9.99));
        items.add(new MenuItem(2, "Pho", 12.99));
        items.add(new MenuItem(3, "Summer Rolls", 5.99));
    }
    public Menu(ArrayList<MenuItem> items) {
        this.items = items;
    }
    public void addItem(MenuItem item) {
        items.add(item);
    }
    public void removeItem(MenuItem item) {
        items.remove(item);
    }
    public ArrayList<MenuItem> getMenu(){
        return items;
    }
    public MenuItem getItem(OrderItem orderItem){
        MenuItem reqItem = null;
        for(MenuItem item : items){
            if (item.getItemNo() == orderItem.getItemNo()){
                reqItem = item;
            }
        }
        return reqItem;
    }
    public int size(){
        return items.size();
    }
}
