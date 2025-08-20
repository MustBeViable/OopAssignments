import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {
    private Map<String, Double> groceryList = new HashMap<>();

    public void addItem(String item, double price) {
        groceryList.put(item, price);
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
            for (Map.Entry<String, Double> grocery : this.groceryList.entrySet()) {
                System.out.println(index + ". " + grocery);
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
        for (Double price : groceryList.values()) {
            totalPrice += price;
        }
        return totalPrice;
    }

    public static void main(String[] args) {
        GroceryListManager listManager = new GroceryListManager();
        String[] groceries = {"Milk", "Bread", "Eggs", "Apples", "Potholders"};

        for (String grocery : groceries) {
            double cost = Math.random() * (Math.random()*10);
            listManager.addItem(grocery, cost);
        }

        System.out.printf("Total price of the list is: %.2f €", listManager.calculateTotalCost());
/*
        listManager.displayList();

        listManager.removeItem("Milk");

        listManager.removeItem("Candy");

        listManager.displayList();
*/

    }
}