import java.util.ArrayList;

public class GroceryListManager {
    final private ArrayList<String> groceryList = new ArrayList<>();

    public void addItem(String item) {
        groceryList.add(item);
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
            for (String grocery : this.groceryList) {
                System.out.println(index + ". " + grocery);
                index++;
            }
        }  else {
            System.out.println("Grocery List is empty.");
        }
    }

    public boolean checkItem(String item) {
        return groceryList.contains(item);
    }

    public static void main(String[] args) {
        GroceryListManager listManager = new GroceryListManager();
        String[] groceries = {"Milk", "Bread", "Eggs", "Apples", "Potholders"};

        for (String grocery : groceries) {
            listManager.addItem(grocery);
        }

        listManager.displayList();

        System.out.printf("\nIs milk in the list? %b \n", listManager.checkItem("Milk"));

        listManager.removeItem("Milk");

        System.out.printf("\nIs milk in the list? %b \n", listManager.checkItem("Milk"));

        listManager.removeItem("Candy");

        listManager.displayList();


    }
}