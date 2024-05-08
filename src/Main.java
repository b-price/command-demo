import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu allMenus = new Menu();
        Menu entrees = new EntreesMenu();
        Menu drinks = new DrinksMenu();
        allMenus.add(entrees);
        allMenus.add(drinks);
        allMenus.add(new MenuItem(9, "Gift Certificate", 50.00));

        entrees.add(new EntreeMenuItem(1, "Summer Rolls     ", 5.99, 100));
        entrees.add(new EntreeMenuItem(2, "Banh Mi          ", 9.99, 500));
        entrees.add(new EntreeMenuItem(3, "Beef Pho        ", 12.99, 800));
        entrees.add(new EntreeMenuItem(4, "Vegan Pho       ", 11.99, 600));
        drinks.add(new DrinksMenuItem(5, "Topo Chico       ", 3.99, 0));
        drinks.add(new DrinksMenuItem(6, "Natty Boh        ", 4.99, 4));
        drinks.add(new DrinksMenuItem(7, "Negroni          ", 9.99, 30));
        drinks.add(new DrinksMenuItem(8, "White Wine       ", 8.99, 15));

        Aggregator aggregator = new Aggregator(allMenus, new Orders());
        Scanner scanner = new Scanner(System.in);
        int menuSize = 9;
        int selection = 1;
        String instructions = "Enter number of item to order, enter 0 to pay your tab.";

        System.out.println("Welcome to BigBoi Restaurant!");
        do {
            System.out.println(SystemInterface.displayMenu(aggregator));
            System.out.println(instructions);
            try {
                selection = Integer.parseInt(scanner.nextLine());
                if (selection == 0) {
                    System.out.println("Your Tab:");
                    for(String line : SystemInterface.displayTab(aggregator)){
                        System.out.println(line);
                    }
                } else if (selection > 0 && selection <= menuSize){
                    aggregator = SystemInterface.submitOrder(selection, aggregator);
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