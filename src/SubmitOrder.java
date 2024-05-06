public class SubmitOrder implements Command{
    private OrderItem item;
    private Menu menu;
    private Orders orders;
    public SubmitOrder(OrderItem item, Menu menu, Orders orders) {
        this.item = item;
        this.menu = menu;
        this.orders = orders;
    }
    @Override
    public Aggregator execute() {
        orders.addOrderItem(item);
        return new Aggregator(menu, orders);
    }
}
