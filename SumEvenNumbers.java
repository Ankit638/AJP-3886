import java.util.ArrayList;

public class SumEvenNumbers {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        numbers.add(35);
        numbers.add(48);
        
        
        int sum = calculateSumOfEvenNumbers(numbers);
        
        
        System.out.println("The sum of all even numbers in the list is: " + sum);
    }

    
    public static int calculateSumOfEvenNumbers(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) { // Check if the number is even
                sum += number; // Add it to the sum
            }
        }
        return sum; // Return the total sum of even numbers
    }
}