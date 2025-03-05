package interviewPrepByPriyanka.javaCoding;

public class CharacterFrequency {
    public static void main(String[] args) {
        String s = "java$%^&*123AC";
        int[] count = new int[256]; // ASCII size array

        int specialCharCount = 0; // To count special characters

        // Count occurrences of each character
        for (char c : s.toCharArray()) {
            count[c]++; // Store frequency at ASCII index
        }

        System.out.println("Character occurrences in the string:");

        // Print non-zero character counts
        for (char c : s.toCharArray()) {
            if (count[c] > 0) {
                System.out.println(c + " → " + count[c]);

                // Check if the character is a special character
                if (!Character.isLetterOrDigit(c)) {
                    specialCharCount += count[c];
                }

                count[c] = 0; // Avoid duplicate printing
            }
        }

        System.out.println("Total special characters count: " + specialCharCount);
    }
}
