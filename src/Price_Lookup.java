import java.util.HashMap;
import java.util.Scanner;

public class PriceLookup {
    public static void main(String[] args) {
        // 1. Create a HashMap (Key: Item Name, Value: Price)
        HashMap<String, Double> groceryStore = new HashMap<>();

        // 2. Add some items to our "Data Structure"
        groceryStore.put("Apple", 0.99);
        groceryStore.put("Banana", 0.59);
        groceryStore.put("Milk", 2.49);
        groceryStore.put("Bread", 1.99);

        // 3. Simple User Interface to lookup items
        Scanner scanner = new Scanner(System.in);
        System.out.println("Available items: Apple, Banana, Milk, Bread");
        System.out.print("Enter an item to check its price: ");
        
        String userChoice = scanner.next();

        // 4. Use the HashMap algorithm to check and fetch the price instantly
        if (groceryStore.containsKey(userChoice)) {
            double price = groceryStore.get(userChoice);
            System.out.println("The price of " + userChoice + " is: $" + price);
        } else {
            System.out.println("Sorry, we do not sell " + userChoice + ".");
        }

        scanner.close();
    }
}
