import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringAnalyzer {

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

    // Method to calculate character frequency
    public static Map<Character, Integer> characterFrequencyCounter(String input) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char ch : input.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }
        }

        return frequencyMap;
    }

    public static void main(String[] args) {
        String input = "programming";

        // Count vowels and consonants
        Map<String, Integer> counts = countVowelsAndConsonants(input);
        System.out.println("Vowels: " + counts.get("Vowels"));
        System.out.println("Consonants: " + counts.get("Consonants"));

        // Character frequency counter
        Map<Character, Integer> frequencyMap = characterFrequencyCounter(input);
        System.out.println("Character Frequency: " + frequencyMap);
    }
}
