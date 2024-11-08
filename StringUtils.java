import java.util.*;

public class StringUtils {

    // Method to remove duplicate characters while maintaining order
    public static String removeDuplicates(String input) {
        Set<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }

        return result.toString();
    }

    // Method to count vowels and consonants
    public static Map<String, Integer> countVowelsAndConsonants(String input) {
        int vowels = 0, consonants = 0;
        Set<Character> vowelSet = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (vowelSet.contains(ch)) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        Map<String, Integer> counts = new HashMap<>();
        counts.put("Vowels", vowels);
        counts.put("Consonants", consonants);

        return counts;
    }

    public static void main(String[] args) {
        String input = "programming";
        
        // Remove duplicates
        String withoutDuplicates = removeDuplicates(input);
        System.out.println("String without duplicates: " + withoutDuplicates);

        // Count vowels and consonants
        Map<String, Integer> counts = countVowelsAndConsonants(input);
        System.out.println("Vowels: " + counts.get("Vowels"));
        System.out.println("Consonants: " + counts.get("Consonants"));
    }
}
