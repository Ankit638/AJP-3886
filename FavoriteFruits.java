import java.util.LinkedHashSet;

public class FavoriteFruits {
    public static void main(String[] args) {
        // Create a LinkedHashSet to store favorite fruits
        LinkedHashSet<String> fruits = new LinkedHashSet<>();

        // Add fruits to the set
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // Use a for-each loop to print each fruit
        System.out.println("My favorite fruits are:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
