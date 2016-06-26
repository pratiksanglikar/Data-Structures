/**
 * 
 */
package ds.pratiksanglikar.chapter2.exercise2.problem8;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import ds.pratiksanglikar.lib.StdRandom;

/**
 * Test client to test Chapter 2, Exercise 2, Problem 8
 * 
 * @author Pratik Sanglikar
 *
 */
public class Ch2Exercise2Problem8Test {

	@SuppressWarnings("rawtypes")
	private Comparable[] array;

	@Before
	public void initializeSortedArray() {
		int size = StdRandom.uniform(1000);
		array = new Double[size];
		for (int i = 0; i < size; i++) {
			array[i] = i * 1.00;
		}
	}

	@Test
	public void test() {
		Ch2Exercise2Problem8 mergeSort = new Ch2Exercise2Problem8();
		int compares = mergeSort.sortAndCountCompares(array);
		assertTrue(compares < array.length);
	}
}