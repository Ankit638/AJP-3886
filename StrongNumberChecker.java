import java.util.Scanner;

public class StrongNumberChecker {

    // Method to calculate factorial of a digit
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check if a number is a Strong number
    public static boolean isStrongNumber(int num) {
        int originalNum = num;
        int sumOfFactorials = 0;

        // Extracting each digit and calculating the sum of factorials
        while (num > 0) {
            int digit = num % 10; // Get the last digit
            sumOfFactorials += factorial(digit); // Add factorial of the digit
            num /= 10; // Remove the last digit
        }

        // Compare the sum of factorials to the original number
        return sumOfFactorials == originalNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isStrongNumber(number)) {
            System.out.println(number + " is a Strong number.");
        } else {
            System.out.println(number + " is not a Strong number.");
        }

        scanner.close();
    }
}