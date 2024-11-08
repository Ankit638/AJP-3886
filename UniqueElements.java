import java.util.HashSet;

public class UniqueElements {
    public static void main(String[] args) {
        // Create a HashSet of integers
        HashSet<Integer> numbers = new HashSet<>();

        // Add numbers to the set (including duplicates)
        numbers.add(10);
        numbers.add(20);
        numbers.add(20); // Duplicate
        numbers.add(30);

        // Print the elements in the set to confirm only unique values are stored
        System.out.println("Elements in the set: " + numbers);
    }
}
