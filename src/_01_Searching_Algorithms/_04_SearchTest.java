package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] test = {"a", "b", "c", "d"};
		String value = "b";
		
		assertEquals(_00_LinearSearch.linearSearch(test, value), 1);
	
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] test2 = {2, 4, 6, 8, 10, 12};
		int value2 = 4;
		assertEquals(_01_BinarySearch.binarySearch(test2, 0, 5, value2), 1);
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] test3 = {2,4,6,8,10,12};
		int value3 = 8;
		assertEquals(_02_InterpolationSearch.interpolationSearch(test3, value3), 3);
		
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] test4 = {2,4,6,8,10,12,14,16,18};
		int value4 = 14;
		assertEquals(_03_ExponentialSearch.exponentialSearch(test4, value4), 6);
		
		
	}
}
