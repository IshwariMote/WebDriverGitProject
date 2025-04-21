package codingQuestions.ArrayCodes;

import java.util.Arrays;

public class AddElementInArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int newElement = 25;
        int position = 2; // Insert at index 2

        // Create a new array with increased size
        int[] newArr = new int[arr.length + 1];

        // Copy elements and insert new one
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == position) {
                newArr[i] = newElement;
            } else {
                newArr[i] = arr[j];
                j++;
            }
        }

        System.out.println("Array after adding element: " + Arrays.toString(newArr));
    }
}
