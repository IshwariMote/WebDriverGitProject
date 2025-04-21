package codingQuestions.ArrayCodes;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	        int[] arr = {1, 2, 3, 4, 5};
	        System.out.println(arr);
//	        int n = arr.length;
//	        for (int i = 0; i < n / 2; i++) {
//	        	
//	            int temp = arr[i];
//	            arr[i] = arr[n - i - 1];
//	            arr[n - i - 1] = temp;
//	        }
//	        System.out.println(Arrays.toString(arr));
//	    }

		for  (int i = arr.length-1;i>=0;i--) {
			System.out.println(arr[i]+" ");
		}
		
	
	}

}
