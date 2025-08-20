import java.util.*;

public class GroceryListManager {
    final private Map<String, Item> groceryList = new HashMap<>();

    //Class to hold price and category for a item
    private static class Item {
        final double price;
        final String category;

        private Item(double price, String category) {
            this.price = price;
            this.category = category;
        }
    }

    public void addItem(String item, double price, String category) {
        groceryList.put(item, new Item(price, category));
    }

    public void removeItem(String item) {
        if (this.checkItem(item)) {
            System.out.println("\nRemoving " + item + " from the list...");
            this.groceryList.remove(item);
        } else {
            System.out.println("\nYou tried to remove " + item + ". List does not contain " + item);
        }
    }

    public void displayList() {
        if (!this.groceryList.isEmpty()) {
            System.out.println("\nGrocery List:");
            int index = 1;
            for (Map.Entry<String, Item> grocery : this.groceryList.entrySet()) {
                String name = grocery.getKey();
                double price = grocery.getValue().price;
                String category = grocery.getValue().category;
                System.out.printf("%d. %s        %.2f€  [%s]\n", index, name, price, category);
                index++;
            }
        }  else {
            System.out.println("Grocery List is empty.");
        }
    }

    public boolean checkItem(String item) {
        return groceryList.containsKey(item);
    }

    public double calculateTotalCost() {
        double totalPrice = 0;
        for (Item item : groceryList.values()) {
            totalPrice += item.price;
        }
        return totalPrice;
    }

    public void displayByCategory(String category) {
            int index = 1;
            boolean itemsFound = false;
            System.out.println("The items in category " + category + " are:");
            for (Map.Entry<String, Item> item : this.groceryList.entrySet()) {
                if (Objects.equals(item.getValue().category, category)) {
                    System.out.printf("%d.  %s\n", index, item.getKey());
                    index++;
                    itemsFound = true;
                }
            } if (!itemsFound) {
            System.out.println("No items in category " + category);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GroceryListManager listManager = new GroceryListManager();
        String[] groceries = {"Milk", "Bread", "Eggs", "Apples", "Potholders"};
        String category;

        for (String grocery : groceries) {
            System.out.printf("Input a catgory for %s: ", grocery);
            category = input.nextLine().toLowerCase(Locale.ROOT);
            double cost = Math.random() * (Math.random()*10);
            listManager.addItem(grocery, cost, category);
        }

        listManager.displayList();

        System.out.printf("Total price of the list is: %.2f €", listManager.calculateTotalCost());

        listManager.removeItem("Milk");

        listManager.removeItem("Candy");

        listManager.displayList();

        System.out.printf("Total price of the list is: %.2f €", listManager.calculateTotalCost());

        listManager.displayByCategory("aa");
    }
}