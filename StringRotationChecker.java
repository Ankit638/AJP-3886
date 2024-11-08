public class StringRotationChecker {

    // Method to check if one string is a rotation of another
    public static boolean isRotation(String str1, String str2) {
        // Check if lengths are equal and not zero, and str1 concatenated with itself contains str2
        return str1.length() == str2.length() && (str1 + str1).contains(str2);
    }

    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "cdeab";
        
        boolean result = isRotation(str1, str2);
        System.out.println("Is \"" + str2 + "\" a rotation of \"" + str1 + "\": " + result);
    }
}
