import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<MenuItem> items = new ArrayList<>();
        items.add(new MenuItem(1, "Summer Rolls", 5.99));
        items.add(new MenuItem(2, "Banh Mi     ", 9.99));
        items.add(new MenuItem(3, "Beef Pho    ", 12.99));
        items.add(new MenuItem(4, "Vegan Pho   ", 11.99));
        Menu menu = new Menu(items);
        Aggregator aggregator = new Aggregator(menu, new Orders());
        SystemInterface ui = new SystemInterface(aggregator);
        Scanner scanner = new Scanner(System.in);
        int menuSize = aggregator.getMenu().size();
        int selection = 1;
        String instructions = "Enter number of item to order, enter 0 to pay your tab.";

        System.out.println("Welcome to BigBoi Restaurant!");
        do {
            ui.displayMenu();
            System.out.println(instructions);
            try {
                selection = Integer.parseInt(scanner.nextLine());
                if (selection == 0) {
                    ui.displayTab();
                } else if (selection > 0 && selection <= menuSize){
                    ui.submitOrder(selection);
                    System.out.println("Your order has been submitted.");
                } else {
                    System.out.println("Please enter a valid number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
        while (selection != 0);
    }
}