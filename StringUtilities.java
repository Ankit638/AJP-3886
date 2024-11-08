import java.util.HashMap;
import java.util.Map;

public class StringUtilities {

    // Method to count the frequency of each character in a string
    public static void countCharacterFrequency(String input) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char ch : input.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Display the character frequencies
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Method to check if a string is a rotation of another string
    public static boolean isRotation(String str1, String str2) {
        // Check if lengths are equal and str1 concatenated with itself contains str2
        return str1.length() == str2.length() && (str1 + str1).contains(str2);
    }

    public static void main(String[] args) {
        // Character Frequency Example
        String input = "apple";
        System.out.println("Character Frequency:");
        countCharacterFrequency(input);

        // Check if a string is a rotation of another
        String str1 = "waterbottle";
        String str2 = "erbottlewat";
        System.out.println("\nIs \"" + str2 + "\" a rotation of \"" + str1 + "\": " + isRotation(str1, str2));
    }
}
