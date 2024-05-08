public class MenuItem extends MenuComponent{
    protected int itemNo;

    protected String itemDescription;

    protected Double itemPrice;

    public MenuItem(int itemNo, String itemDescription, Double itemPrice) {
        this.itemNo = itemNo;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
    }

    public int getItemNo() {
        return itemNo;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public boolean getItem(OrderItem orderItem) {
        return itemNo == orderItem.getItemNo();
    }

    public String toString() {
        return "No." + itemNo + " " + itemDescription + " $" + itemPrice;
    }
}
