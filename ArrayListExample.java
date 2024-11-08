import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add numbers 1 to 5 to the list
        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }

        // Remove the number 3 from the list
        numbers.remove(Integer.valueOf(3));

        // Print the elements in the list
        System.out.println("Elements in the list: " + numbers);
    }
}
