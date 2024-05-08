public class Invoker {
    private OrderItem item;
    private Orders orders;
    private Menu menu;
    private Tab tab;
    public Invoker(OrderItem item, Menu menu, Orders orders) {
        this.item = item;
        this.menu = menu;
        this.orders = orders;
    }
    public Invoker(Menu menu) {
        this.menu = menu;
    }
    public Invoker(Tab tab) {
        this.tab = tab;
    }
    public String displayMenu(){
        DisplayMenu displayMenu = new DisplayMenu(menu);
        return displayMenu.execute();
    }
    public String[] displayTab(){
        DisplayTab displayTab = new DisplayTab(tab);
        return displayTab.execute();
    }
    public Aggregator submitOrder(){
        SubmitOrder submitOrder = new SubmitOrder(item, menu, orders);
        return submitOrder.execute();
    }
}
