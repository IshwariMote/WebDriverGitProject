package codingQuestions.ArrayCodes;

import java.util.Arrays;

public class MergeNSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Define two arrays
        int[] arr1 = {5, 1, 9, 3};
        int[] arr2 = {8, 4, 2, 7};
        
        
     // Get lengths of both arrays
        int len1 = arr1.length;
        int len2 = arr2.length;
        
        //create new array 
        
       int  mArray [] = new int [len1+len2];
    // Copy elements from arr1
       for (int i=0; i< len1;i++) {
    	   mArray[i]=arr1[i];
       }
       
       // Copy elements from arr2 (Fixing the index)
       for (int i=0; i< len2;i++) {
    	   mArray[len1+i]=arr2[i]; //Corrected index
       }
       
       
       System.out.println("Before sorting array is"+Arrays.toString(mArray));
       
     
       
       for (int i=0; i<mArray.length-1;i++) {
    	   for (int j=0; j<mArray.length-1;j++) {
    		    if (mArray[j]>mArray[j+1]) {
    		   int temp = mArray[j];
    		   mArray[j]=mArray[j+1];
    		   mArray[j+1]= temp;
    		    }
    	   }
    	   
       }
       System.out.println("After sorted arrays is "+Arrays.toString(mArray) );
        
	}

}
