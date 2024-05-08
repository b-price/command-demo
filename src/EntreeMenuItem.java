public class EntreeMenuItem extends MenuItem{
    private int calories;
    public EntreeMenuItem(int itemNo, String itemDescription, Double itemPrice, int calories){
        super(itemNo, itemDescription, itemPrice);
        this.calories = calories;
    }
    public int getCalories(){
        return calories;
    }
    public String toString(){
        return super.toString() + " " + calories + "cal";
    }
}
