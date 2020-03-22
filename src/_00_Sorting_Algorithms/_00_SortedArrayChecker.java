package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	//1. Write a static method called intArraySorted. 
	//   This method takes in an array of integers
	//   and it returns a boolean.
	//   The method returns true if the integer
	//   array is in ascending order and false otherwise
	static boolean intArraySorted(int[] a) {
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]<a[a.length-1]) {
				return true;
			}
		}
		
		return false;
	}

	
	//2. Write a static method called doubleArraySorted. 
	//   This method takes in an array of doubles
	//   and it returns a boolean.
	//   The method returns true if the double
	//   array is in ascending order and false otherwise
	static boolean doubleArraySorted(double[] q) {
		
		for (int i = 0; i < q.length; i++) {
			if(q[i]<q[q.length-1]) {
				return true;
			}
		}
		
		
		return false;
	}

	
	//3. Write a static method called charArraySorted. 
	//   This method takes in an array of characters
	//   and it returns a boolean.
	//   The method returns true if the character
	//   array is in alphabetical order and false otherwise
	//   (You can compare characters just like integers)
	static boolean charArraySorted(char[] c) {
		
		for(int i = 0; i<c.length; i++) {
			if(c[i]<c[c.length-1] ) {
				return true;
			}
			
		}
		
		
		return false;
	}
	
	
	
	
	//4. Write a static method called stringArraySorted. 
	//   This method takes in an array of Strings
	//   and it returns a boolean.
	//   The method returns true if the String
	//   array is in alphabetical order and false otherwise
	//   (Use the compareTo(String) method)
	
	static boolean stringArraySorted(String[] w) {
		
		for(int i=0; i<w.length;i++) {
			if(w[1].compareTo(w[2])<0) {
				return true;
			}
		}
		
		
		return false;
	}

}
