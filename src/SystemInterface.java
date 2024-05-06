public class SystemInterface {
    private Aggregator aggregator;
    public SystemInterface(Aggregator aggregator){
        this.aggregator = aggregator;
    }
    public void submitOrder(int itemInt){
        OrderItem item = new OrderItem(itemInt);
        Invoker invoker = new Invoker(item, aggregator.getMenu(), aggregator.getOrders());
        aggregator = invoker.submitOrder();
    }
    public void displayTab(){
        Tab tab = new Tab(aggregator.getMenu(), aggregator.getOrders());
        Invoker invoker = new Invoker(tab);
        System.out.println("Your Tab:");
        for(String line : invoker.displayTab()){
            System.out.println(line);
        }
    }
    public void displayMenu(){
        Invoker invoker = new Invoker(aggregator.getMenu());
        System.out.println("The Menu:");
        for(String line : invoker.displayMenu()){
            System.out.println(line);
        }
    }
}
