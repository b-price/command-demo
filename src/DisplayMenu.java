public class DisplayMenu implements Command{
    private MenuComponent menu;
    public DisplayMenu(MenuComponent menu) {
        this.menu = menu;
    }
    @Override
    public String execute() {
        return menu.toString();
    }
}
