package coreJavaConcepts;

import java.util.Arrays;

public class stringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Java" ;
		String s3 ="Java";
		
		//==: Compares the memory reference of two objects.
		//equals(): Compares the content or state of the objects.
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		String str3 = new String("hello");
		System.out.println(str1 == str2);   // false (compares reference)
		System.out.println(str1.equals(str2)); // true (compares content)
		

		//remove white spaces from right n left - trim ()
		String str = "   Whiter Space 		";
		System.out.println(str.trim());
		System.out.println(str.trim().length());
		
		// retunr char from index 
		System.out.println("Return char from string "+str.charAt(5));
		
		//Contains()
		
		System.out.println(str.contains("Space"));
		System.out.println(str.contains("space"));
		
		//equals ignore Case se3nsitive
		
		System.out.println(str1.equalsIgnoreCase(str3));
		
		//Replace rhe char from string - replace ()
		String s= "All the Best for Java Interview ";
		System.out.println(s.replace("Java", "Python").replace("i", "e"));
		
		//SubString ()- extarct some part of the string 
		
		String s5="Selenium, Java";
		
		System.out.println(s5.substring(0, 1));// S 
		System.out.println(s5.substring(0,8));
		
		//toUpperCase () and toLowerCase()
		System.out.println(s5.toLowerCase());
		System.out.println(s5.toUpperCase());
		
		
		//Split 
		String s6= "ishwarimote@gmail.com";
		
		//extract username 
		System.out.println(s6.substring(0,11));
		
		String a[]= s6.split("@");
		System.out.println(Arrays.toString(a));
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		String s7= "abc, John, Kiya, Max@";
		String b[] = s7.split(",");
		System.out.println(Arrays.toString(b));
		System.out.println(b[2]);
		System.out.println(b[3]);
	
		String a1= b[3];
		System.out.println(a1.split("@"));
		
		
	
		
		
		
		
				
		
	}

}
