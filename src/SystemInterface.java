public class SystemInterface {
    public static Aggregator submitOrder(int itemInt, Aggregator aggregator){
        OrderItem item = new OrderItem(itemInt);
        Invoker invoker = new Invoker(item, aggregator.getMenu(), aggregator.getOrders());
        return invoker.submitOrder();
    }
    public static String[] displayTab(Aggregator aggregator){
        Tab tab = new Tab(aggregator.getMenu(), aggregator.getOrders());
        Invoker invoker = new Invoker(tab);
        return invoker.displayTab();
    }
    public static String displayMenu(Aggregator aggregator){
        Invoker invoker = new Invoker(aggregator.getMenu());
        return invoker.displayMenu();
    }
}
