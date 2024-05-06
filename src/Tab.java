import java.util.ArrayList;

public class Tab {
    private Menu menu;
    private Orders orders;
    public Tab(Menu menu, Orders orders){
        this.menu = menu;
        this.orders = orders;
    }
    public String[] getTab(){
        ArrayList<OrderItem> orderItems = orders.getOrderItems();
        String[] tab = new String[orders.size() + 1];
        double total = 0;
        for(int i = 0; i < orders.size(); i++){
            tab[i] = menu.getItem(orderItems.get(i)).toString();
            total += menu.getItem(orderItems.get(i)).getItemPrice();
        }
        tab[orders.size()] = String.format("Total: $%.2f", total);
        return tab;
    }
}
