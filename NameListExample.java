import java.util.ArrayList;

public class NameListExample {

    public static void main(String[] args) {
        // Create an ArrayList of names
        ArrayList<String> names = new ArrayList<>();

        // Add five names to the list
        names.add("Mrinal");
        names.add("A♥");
        names.add("Zeeshan");
        names.add("Application");
        names.add("Kush");

        // Print the total number of names in the list
        System.out.println("Total number of names: " + names.size());

        // Display the name at the second position (index 1)
        System.out.println("Name at the second position: " + names.get(1));
    }
}
