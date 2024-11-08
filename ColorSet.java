import java.util.LinkedHashSet;

public class ColorSet {
    public static void main(String[] args) {
        // Create a LinkedHashSet of strings
        LinkedHashSet<String> colors = new LinkedHashSet<>();

        // Add colors to the set
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Remove one color from the set
        colors.remove("Green");

        // Print the remaining elements in the set
        System.out.println("Remaining colors: " + colors);
    }
}
