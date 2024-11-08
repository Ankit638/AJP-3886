import java.util.LinkedHashSet;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Array with duplicate numbers
        Integer[] numbers = {1, 2, 3, 2, 1};

        // Create a LinkedHashSet to remove duplicates while preserving order
        LinkedHashSet<Integer> uniqueNumbers = new LinkedHashSet<>(Arrays.asList(numbers));

        // Print the unique numbers in the order they were added
        System.out.println("Unique numbers in order: " + uniqueNumbers);
    }
}
