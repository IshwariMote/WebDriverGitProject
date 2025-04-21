package codingQuestions.StringCodes;

public class ReverseEachWordInString {

    public static void main(String[] args) {
        String str = "You will get it";

        String words[] = str.split(" ");
        String revStr = "";

        for (String w : words) {
            String revWords = "";  // Reset for each word
            for (int i = w.length() - 1; i >= 0; i--) {
                revWords =revWords+ w.charAt(i);
            }
            revStr = revStr+ revWords + " ";
        }

        System.out.println("Reversed string is: " + revStr.trim());
    }
}
