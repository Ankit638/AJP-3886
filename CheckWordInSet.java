import java.util.HashSet;

public class CheckWordInSet {
    public static void main(String[] args) {
        // Create a HashSet of strings
        HashSet<String> words = new HashSet<>();

        // Add random words to the set
        words.add("Kroos");
        words.add("MYBAD");
        words.add("Choker");
        words.add("JavaScript");
        words.add("Loser");

        // Word to check in the set
        String wordToCheck = "Loser";

        // Check if the specific word exists in the set
        if (words.contains(wordToCheck)) {
            System.out.println(wordToCheck + " exists in the set.");
        } else {
            System.out.println(wordToCheck + " does not exist in the set.");
        }
    }
}
