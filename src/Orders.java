import java.util.ArrayList;

public class Orders {
    private ArrayList<OrderItem> orderItems;
    public Orders() {
        orderItems = new ArrayList<>();
    }
    public Orders(ArrayList<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }
    public void addOrderItem(OrderItem orderItem) {
        orderItems.add(orderItem);
    }
    public int size(){
        return orderItems.size();
    }
}
