import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> shoppingList = new ArrayList<>();

        System.out.println("Enter up to 5 items you need to buy, type 'done' when finished:");

        // Input items into the shopping list
        while (shoppingList.size() < 5) {
            System.out.print("Enter item " + (shoppingList.size() + 1) + ": ");
            String item = scanner.nextLine();

            if (item.equalsIgnoreCase("done")) {
                break; // Exit loop if user types 'done'
            }

            shoppingList.add(item);
        }

        // Print the complete shopping list
        System.out.println("\nYour Shopping List:");
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println((i + 1) + ". " + shoppingList.get(i));
        }

        // Count and print the number of items entered
        int itemCount = shoppingList.size();
        System.out.println("\nYou have " + itemCount + " items in your shopping list.");

        // Extra Challenge: Search feature
        System.out.print("\nEnter an item to search for: ");
        String searchItem = scanner.nextLine();

        boolean found = false;
        for (String item : shoppingList) {
            if (item.equalsIgnoreCase(searchItem)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(searchItem + " is in your shopping list.");
        } else {
            System.out.println(searchItem + " is not in your shopping list.");
        }

        scanner.close();
    }
}
