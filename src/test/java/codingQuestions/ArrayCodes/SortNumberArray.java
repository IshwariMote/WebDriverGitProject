package codingQuestions.ArrayCodes;

import java.util.Arrays;

public class SortNumberArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3, 7, 6, 4};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) { // Swap if the element is greater
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array in Ascending Order:"  
        + Arrays.toString(arr) );
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

