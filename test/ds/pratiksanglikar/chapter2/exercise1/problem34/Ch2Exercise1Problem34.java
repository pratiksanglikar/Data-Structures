/**
 * 
 */
package ds.pratiksanglikar.chapter2.exercise1.problem34;

import static org.junit.Assert.*;
import static ds.pratiksanglikar.chapter2.SortingUtilities.*;

import org.junit.Test;

import ds.pratiksanglikar.chapter2.Shell;
import ds.pratiksanglikar.chapter2.Sort;
import ds.pratiksanglikar.lib.StdRandom;

/**
 * <pre>
 * Chapter 2, Exercise 1, Problem 34
 * 
 * Corner cases. 
 * Write a client that runs sort() on difficult or pathological cases 
 * that might turn up in practical applications. 
 * Examples include -
 * 1. arrays that are already in order
 * 2. arrays in reverse order
 * 3. arrays where all keys are the same
 * 4. arrays consisting of only two distinct values 
 * 5. arrays of size 0
 * 6. arrays of size 1
 * 
 * @author Pratik Sanglikar
 * </pre>
 */
public class Ch2Exercise1Problem34 {

	private Integer[] array;
	Sort shell = new Shell();

	@Test
	public void inOrderArrayTest() {
		populateSortedArray();
		test("Already sorted array must be in sorted condition after sorting");
	}
	
	@Test
	public void reverseOrderArrayTest() {
		populateReverseSortedArray();
		test("Reverse sorted array must be in sorted condition after sorting");
	}
	
	@Test
	public void sameElementsTest() {
		populateSameElements();
		test("Array of same elements should be in sorted condition after sorting");
	}
	
	@Test
	public void twoDistinctValues() {
		populateTwoDistinctValues();
		test("Should sort array of only two distinct values");
	}
	
	@Test
	public void arrayOfSizeZero() {
		array = new Integer[0];
		test("Should sort array of size 0");
	}

	@Test
	public void arrayOfSizeOne() {
		array = new Integer[1];
		array[0] = 234;
		test("Should sort array of size 1");
	}
	
	/**
	 * tests the whether the array is sorted after for each test case
	 * 
	 * @param message to be tested. 
	 */
	private void test(String message) {
		shell.sort(array);
		assertTrue(message, isSorted(array));
	}


	/**
	 * 
	 * populates an array with only two distinct values.
	 * 
	 */
	private void populateTwoDistinctValues() {
		array = new Integer[100];
		for (int i = 0; i < array.length; i++) {
			int randomInt = StdRandom.uniform(3,5);
			array[i] = randomInt;
		}
	}


	/**
	 * populates the array with same elements
	 * 
	 */
	private void populateSameElements() {
		array = new Integer[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = 54;
		}
	}


	/**
	 * populates the array with elements sorted in reverse order.
	 * 
	 */
	private void populateReverseSortedArray() {
		array = new Integer[100];
		for (int i = array.length-1; i >= 0; i--) {
			array[i] = i * 5;
		}
	}


	/**
	 * populates the array with elements in sorted order.
	 * 
	 */
	private void populateSortedArray() {
		array = new Integer[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = i * 5;
		}
	}

}
