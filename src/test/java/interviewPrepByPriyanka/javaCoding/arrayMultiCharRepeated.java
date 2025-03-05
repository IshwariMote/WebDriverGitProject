package interviewPrepByPriyanka.javaCoding;

public class arrayMultiCharRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        String s = "java";
		        char[] arr = s.toCharArray();

		        System.out.println("Character occurrences in the string:");

		        for (int i = 0; i < arr.length; i++) {
		            int count = 1;

		            for (int j = i + 1; j < arr.length; j++) {
		                if (arr[i] == arr[j]) {
		                    count++;
		                    arr[j] = '0'; // Mark duplicate characters to avoid recounting
		                }
		            }

		            if (arr[i] != '0') { // Print only for first occurrence
		                System.out.println(arr[i] + " → " + count);
		            }
		        }
		    }
		}

	