public class MenuItem {
    private int itemNo;
    private String itemDescription;
    private Double itemPrice;
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
    public Double getItemPrice() {
        return itemPrice;
    }
    public String toString() {
        return "No." + itemNo + " " + itemDescription + " $" + itemPrice;
    }
}
