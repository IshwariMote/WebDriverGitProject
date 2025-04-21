package codingQuestions.StringCodes;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String str = scanner.nextLine();
        scanner.close();

        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        System.out.println("Reversed String: " + reversed);
    }
}
