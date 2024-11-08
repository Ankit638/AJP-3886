import java.util.Scanner;

public class CheckNthBitSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (num): ");
        int num = scanner.nextInt();

        System.out.print("Enter the bit position (n): ");
        int n = scanner.nextInt();

        // Check if the nth bit is set (1)
        boolean isSet = (num & (1 << n)) != 0;

        if (isSet) {
            System.out.println("The " + n + "th bit of " + num + " is set (1).");
        } else {
            System.out.println("The " + n + "th bit of " + num + " is not set (0).");
        }

        scanner.close();
    }
}
