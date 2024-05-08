public class DrinksMenuItem extends MenuItem {
    private double abv;
    public DrinksMenuItem(int itemNo, String itemDescription, Double itemPrice, double abv) {
        super(itemNo, itemDescription, itemPrice);
        this.abv = abv;
    }
    public double getAbv() {
        return abv;
    }
    public String toString() {
        return super.toString() + String.format(" %.2f", abv) + "% abv";
    }
}
