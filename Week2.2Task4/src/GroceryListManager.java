import java.util.*;

public class GroceryListManager {
    final private Map<String, Item> groceryList = new HashMap<>();

    //Class to hold price and category for an item

    public static class Item {
        final double price;
        final String category;
        int quantity;

        private Item(double price, String category, int quantity) {
            this.price = price;
            this.category = category;
            this.quantity = quantity;
        }
    }

    public void addItem(String item, double price, String category, int quantity) {
        groceryList.put(item, new Item(price, category, quantity));
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
                int quantity = grocery.getValue().quantity;
                System.out.printf("%d. %d %s        %.2f€  [%s]\n", index, quantity, name, price, category);
                index++;
            }
        } else {
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
        }
        if (!itemsFound) {
            System.out.println("No items in category " + category);
        }
    }

    public void updateQuantity(String itemName, int newQuantity) {
        if (groceryList.containsKey(itemName)) {
            Item groceryToBeUpdated = groceryList.get(itemName);
            groceryToBeUpdated.quantity = newQuantity;
        }
    }

    public void displayAvailableItems() {
        int index = 1;
        System.out.println("List of items with positive quantity");
        for (Map.Entry<String, Item> item : this.groceryList.entrySet()) {
            if (item.getValue().quantity > 0) {
                System.out.printf("%d.   %s  %d\n", index, item.getKey(), item.getValue().quantity);
                index++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GroceryListManager listManager = new GroceryListManager();
        String[] groceries = {"Milk", "Bread", "Eggs", "Apples", "Potholders"};
        String category;
        int quantity = 0;

        for (String grocery : groceries) {
            boolean validCategory = false;
            boolean validQuantity = false;
            do {
                System.out.printf("Input a category for %s: ", grocery);
                category = input.nextLine().toLowerCase(Locale.ROOT);
                if (!category.isEmpty()) {
                    validCategory = true;
                } else{
                    System.out.println("Please enter valid category");
                }
            } while (!validCategory);

            do {
                try {
                    System.out.printf("Input quantity of %s: ", grocery);
                    quantity = Integer.parseInt(input.nextLine());
                    validQuantity = true;
                } catch (Exception e) {
                    System.out.println("Please enter quantity as a integer.");
                }
            } while (!validQuantity);
            double cost = Math.random() * (Math.random() * 10);
            listManager.addItem(grocery, cost, category, quantity);
        }

        listManager.displayList();

        System.out.printf("Total price of the list is: %.2f €", listManager.calculateTotalCost());

        listManager.removeItem("Milk");

        listManager.removeItem("Candy");

        listManager.displayList();

        System.out.printf("Total price of the list is: %.2f €", listManager.calculateTotalCost());

        listManager.displayByCategory("aa");

        System.out.println("Updating quantity for bread to 10");

        listManager.updateQuantity("Bread", 10);

        listManager.displayList();

        listManager.displayAvailableItems();

        System.out.println("Changing apples and eggs to 0");

        listManager.updateQuantity("Apples", 0);

        listManager.updateQuantity("Eggs", 0);

        listManager.displayAvailableItems();
    }
}