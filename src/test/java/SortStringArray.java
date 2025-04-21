import java.util.Arrays;

public class SortStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] a= {"banana","apple","oranges","grapes"};
		
		for (int i =0; i<a.length-1;i++) {
			
			for (int j=0; j<a.length-1;j++) {
				
				if (a[j].compareTo(a[j+1])>0) {
					
					String temp =a[j];
					a[j]= a[j+1];
					a[j+1]= temp;
					
				}
				
			}
			
		}
		System.out.println(Arrays.toString(a));
	}

}
