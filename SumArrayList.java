import java.util.ArrayList;

public class SumArrayList {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add numbers to the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Variable to store the sum
        int sum = 0;

        // Iterate over the list and calculate the sum
        for (int number : numbers) {
            sum += number;
        }

        // Print the sum
        System.out.println("The sum of all numbers is: " + sum);
    }
}
