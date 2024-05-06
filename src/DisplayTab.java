public class DisplayTab implements Command{
    private Tab tab;
    public DisplayTab(Tab tab) {
        this.tab = tab;
    }
    @Override
    public String[] execute() {
        return tab.getTab();
    }
}
